package com.claroinvestments.bsestarmf;

import java.net.MalformedURLException;
import java.util.Arrays;

import javax.xml.ws.soap.AddressingFeature;

import org.apache.commons.lang3.StringUtils;

import com.claroinvestments.bsestarmf.enums.PaymentMode;
import com.claroinvestments.bsestarmf.exceptions.MFPasswordRequestException;
import com.claroinvestments.bsestarmf.exceptions.MFPaymentServiceException;
import com.claroinvestments.bsestarmf.payments.ArrayOfstring;
import com.claroinvestments.bsestarmf.payments.IStarMFPaymentGatewayService;
import com.claroinvestments.bsestarmf.payments.PasswordRequest;
import com.claroinvestments.bsestarmf.payments.RequestParam;
import com.claroinvestments.bsestarmf.payments.Response;
import com.claroinvestments.bsestarmf.payments.StarMFPaymentGatewayService;

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
	
	public String getDirectPaymentPage(BseUser bseUser, String[] orders, String totalAmount, String accountNo, String ifsc, String bankId, PaymentMode paymentMode, String logoutUrl, String clientCode, String encryptedPassword) throws MFPaymentServiceException {
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
		param.setTotalAmount(totalAmount.toString());
		
		Response response = starMFPaymentGatewayServiceClient.paymentGatewayAPI(param);
		if(!StringUtils.equals(response.getStatus(),BseStarMFConstants.STATUS_100)){
			throw new MFPaymentServiceException(response.getResponseString());
		}
		
		return response.getResponseString();
	}
	
	
}
