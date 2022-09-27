package dev.anshumax.bsestarmf;

import java.io.IOException;
import java.net.MalformedURLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import jakarta.xml.ws.soap.AddressingFeature;

import dev.anshumax.bsestarmf.exceptions.MFFileUploadServiceException;
import dev.anshumax.bsestarmf.exceptions.MFPasswordRequestException;
import dev.anshumax.bsestarmf.fileupload.FileData;
import dev.anshumax.bsestarmf.fileupload.IStarMFFileUploadService;
import dev.anshumax.bsestarmf.fileupload.MandateScanFileData;
import dev.anshumax.bsestarmf.fileupload.PasswordRequest;
import dev.anshumax.bsestarmf.fileupload.Response;
import dev.anshumax.bsestarmf.fileupload.StarMFFileUploadService;

public class BseStarMFFileUploadService {

	private IStarMFFileUploadService starmfFileUploadServiceClient;

	public BseStarMFFileUploadService(String url) throws MalformedURLException {
		StarMFFileUploadService starmfFileUploadService = new StarMFFileUploadService(url);
		AddressingFeature addressingFeature = new AddressingFeature(true,true);
		starmfFileUploadServiceClient = starmfFileUploadService.getWSHttpBindingIStarMFFileUploadService1(addressingFeature);
	}

	public String getEncryptedPassword(BseUser bseUser) throws MFPasswordRequestException {
		PasswordRequest passwordRequest = new PasswordRequest();
		passwordRequest.setMemberId(bseUser.getBseMemberCode());
		passwordRequest.setPassword(bseUser.getBseUserPassword());
		passwordRequest.setUserId(bseUser.getBseUserId());
		Response response = starmfFileUploadServiceClient.getPassword(passwordRequest);
		if(!response.getStatus().equals(BseStarMFConstants.STATUS_100)) {
			throw new MFPasswordRequestException(response.getResponseString());
		}
		return response.getResponseString();
	}
	
	public void uploadAOFImage(BseUser bseUser, String userid, byte[] imageBytes, String encryptedPassword) throws IOException, MFFileUploadServiceException {
		
		String fileName = bseUser.getBseMemberCode() + userid + LocalDate.now().format(DateTimeFormatter.ofPattern("ddMMyyyy")) + ".tiff";
		FileData fileData = new FileData();
		fileData.setClientCode(userid);
		fileData.setDocumentType(BseStarMFConstants.NRM);
		fileData.setEncryptedPassword(encryptedPassword);
		fileData.setFileName(fileName);
		fileData.setFiller1(BseStarMFConstants.EMPTY);
		fileData.setFiller2(BseStarMFConstants.EMPTY);
		fileData.setFlag(BseStarMFConstants.UCC);
		fileData.setMemberCode(bseUser.getBseMemberCode());
		fileData.setPFileBytes(imageBytes);
		fileData.setUserId(bseUser.getBseUserId());
		Response response = starmfFileUploadServiceClient.uploadFile(fileData);
		if(!response.getStatus().equals(BseStarMFConstants.STATUS_100)) {
			throw new MFFileUploadServiceException(response.getResponseString());
		}
	}
	
	public void uploadXsipNachMandate(BseUser bseUser, String clientCode, String mandateId, String imageName, byte[] mandateBytes, String encryptedPassword) throws MFFileUploadServiceException {
		
		MandateScanFileData data = new MandateScanFileData();
		data.setFlag("SCAN_MANDATE");
		data.setMemberCode(bseUser.getBseMemberCode());
		data.setClientCode(clientCode);
		data.setMandateId(mandateId);
		data.setImageName(imageName);
		data.setMandateType("XSIP");
		data.setImageType("pdf");
		data.setEncryptedPassword(encryptedPassword);
		data.setPFileBytes(mandateBytes);
		Response uploadResponse = starmfFileUploadServiceClient.uploadMandateScanFile(data);
		if(!uploadResponse.getStatus().equals(BseStarMFConstants.STATUS_100)) {
			throw new MFFileUploadServiceException(uploadResponse.getResponseString());
		}
	}
}
