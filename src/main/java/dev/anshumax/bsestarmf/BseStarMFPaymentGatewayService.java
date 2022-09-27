package dev.anshumax.bsestarmf;

import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.util.Arrays;

import jakarta.xml.ws.soap.AddressingFeature;

import dev.anshumax.bsestarmf.enums.PaymentMode;
import dev.anshumax.bsestarmf.exceptions.MFPasswordRequestException;
import dev.anshumax.bsestarmf.exceptions.MFPaymentServiceException;
import dev.anshumax.bsestarmf.payments.ArrayOfstring;
import dev.anshumax.bsestarmf.payments.IStarMFPaymentGatewayService;
import dev.anshumax.bsestarmf.payments.PasswordRequest;
import dev.anshumax.bsestarmf.payments.RequestParam;
import dev.anshumax.bsestarmf.payments.Response;
import dev.anshumax.bsestarmf.payments.StarMFPaymentGatewayService;

public class BseStarMFPaymentGatewayService {
	
	private IStarMFPaymentGatewayService starMFPaymentGatewayServiceClient;
	
	public BseStarMFPaymentGatewayService(String url) throws MalformedURLException {
		StarMFPaymentGatewayService starMFPaymentGatewayService = new StarMFPaymentGatewayService(url);
		AddressingFeature addressingFeature = new AddressingFeature(true,true);
		this.starMFPaymentGatewayServiceClient = starMFPaymentGatewayService.getWSHttpBindingIStarMFPaymentGatewayService1(addressingFeature);
	}
	
	public String getEncryptedPassword(BseUser bseUser) throws MFPasswordRequestException {
		PasswordRequest passwordRequest = new PasswordRequest();
		passwordRequest.setMemberId(bseUser.getBseMemberCode());
		passwordRequest.setPassKey(BseStarMFConstants.BSE_PASS_KEY);
		passwordRequest.setPassword(bseUser.getBseUserPassword());
		passwordRequest.setUserId(bseUser.getBseUserId());
		Response response = starMFPaymentGatewayServiceClient.getPassword(passwordRequest);
		if(!response.getStatus().equals(BseStarMFConstants.STATUS_100)) {
			throw new MFPasswordRequestException(response.getResponseString());
		}
		return response.getResponseString();
	}
	
	public String getDirectPaymentPage(BseUser bseUser, String[] orders, BigDecimal totalAmount, String accountNo, String ifsc, String bankId, PaymentMode paymentMode, String logoutUrl, String clientCode, String encryptedPassword) throws MFPaymentServiceException {
		ArrayOfstring ordersArray = new ArrayOfstring();
		ordersArray.getString().addAll(Arrays.asList(orders));
		
		RequestParam param = new RequestParam();
		param.setAccNo(accountNo);
		param.setBankID(bankId);
		param.setClientCode(clientCode);
		param.setEncryptedPassword(encryptedPassword);
		param.setIFSC(ifsc);
		param.setLogOutURL(logoutUrl);
		param.setMemberCode(bseUser.getBseMemberCode());
		param.setMode(paymentMode.getValue());
		param.setOrders(ordersArray);
		param.setTotalAmount(totalAmount.toPlainString());
		
		Response response = starMFPaymentGatewayServiceClient.paymentGatewayAPI(param);
		if(BseStarMFConstants.STATUS_100.equals(response.getStatus())){
			throw new MFPaymentServiceException(response.getResponseString());
		}
		
		return response.getResponseString();
	}
	
	
}
