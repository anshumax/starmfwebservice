package com.claroinvestments.bsestarmf;

import java.net.MalformedURLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.xml.ws.soap.AddressingFeature;

import com.claroinvestments.bsestarmf.additionalservices.AOFPanSearchRequest;
import com.claroinvestments.bsestarmf.additionalservices.AOFPanSearchResponse;
import com.claroinvestments.bsestarmf.additionalservices.AllotmentStatementRequest;
import com.claroinvestments.bsestarmf.additionalservices.AllotmentStatementResponse;
import com.claroinvestments.bsestarmf.additionalservices.ChildOrderRequest;
import com.claroinvestments.bsestarmf.additionalservices.ChildOrderResponse;
import com.claroinvestments.bsestarmf.additionalservices.EMandateAuthURLRequest;
import com.claroinvestments.bsestarmf.additionalservices.EMandateAuthURLResponse;
import com.claroinvestments.bsestarmf.additionalservices.Fatca;
import com.claroinvestments.bsestarmf.additionalservices.FatcaResponse;
import com.claroinvestments.bsestarmf.additionalservices.IStarMFWebService;
import com.claroinvestments.bsestarmf.additionalservices.MFAPIResult;
import com.claroinvestments.bsestarmf.additionalservices.MandateDetails;
import com.claroinvestments.bsestarmf.additionalservices.MandateDetailsRequest;
import com.claroinvestments.bsestarmf.additionalservices.MandateDetailsResponse;
import com.claroinvestments.bsestarmf.additionalservices.MandateRegistrationResponse;
import com.claroinvestments.bsestarmf.additionalservices.OrderRequest;
import com.claroinvestments.bsestarmf.additionalservices.OrderResponse;
import com.claroinvestments.bsestarmf.additionalservices.Password;
import com.claroinvestments.bsestarmf.additionalservices.PasswordRequest;
import com.claroinvestments.bsestarmf.additionalservices.PaymentStatusResponse;
import com.claroinvestments.bsestarmf.additionalservices.Response;
import com.claroinvestments.bsestarmf.additionalservices.StarMFWebService;
import com.claroinvestments.bsestarmf.additionalservices.StpOrderEntryResponse;
import com.claroinvestments.bsestarmf.additionalservices.SwpOrderEntryResponse;
import com.claroinvestments.bsestarmf.additionalservices.Ucc;
import com.claroinvestments.bsestarmf.additionalservices.UccResponse;
import com.claroinvestments.bsestarmf.enums.AccessTokenRequestType;
import com.claroinvestments.bsestarmf.enums.AdditionServicesFlag;
import com.claroinvestments.bsestarmf.enums.BuySellType;
import com.claroinvestments.bsestarmf.enums.FrequencyType;
import com.claroinvestments.bsestarmf.enums.MandateType;
import com.claroinvestments.bsestarmf.enums.OrderStatus;
import com.claroinvestments.bsestarmf.enums.OrderType;
import com.claroinvestments.bsestarmf.enums.PaymentStatusSegment;
import com.claroinvestments.bsestarmf.enums.SettlementType;
import com.claroinvestments.bsestarmf.enums.SubOrderType;
import com.claroinvestments.bsestarmf.enums.SystematicPlanType;
import com.claroinvestments.bsestarmf.enums.TransMode;
import com.claroinvestments.bsestarmf.enums.TransactionType;
import com.claroinvestments.bsestarmf.exceptions.MFAdditionalServicesException;
import com.claroinvestments.bsestarmf.exceptions.MFPasswordRequestException;

public class BseStarMFAdditionalServices {
	
	private IStarMFWebService starMFWebServiceClient;
	
	private DateTimeFormatter starMfDateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public BseStarMFAdditionalServices(String url) throws MalformedURLException {
		StarMFWebService starMFWebService = new StarMFWebService(url);
		AddressingFeature addressingFeature = new AddressingFeature(true,true);
		starMFWebServiceClient = starMFWebService.getWSHttpBindingIStarMFWebService1(addressingFeature);
	}
	
	public boolean isBseUserValid(BseUser bseUser) {
		try {
			String getPasswordResponse = starMFWebServiceClient.getPassword(bseUser.getBseUserId(), bseUser.getBseMemberCode(), bseUser.getBseUserPassword(), BseStarMFConstants.BSE_PASS_KEY);
			Password password = new Password(getPasswordResponse);
			return password.isValidPassword();	
		}catch(Exception e) {
			return false;
		}
	}
	
	public String getEncryptedPassword(BseUser bseUser) throws MFPasswordRequestException{
		String getPasswordResponse = starMFWebServiceClient.getPassword(bseUser.getBseUserId(), bseUser.getBseMemberCode(), bseUser.getBseUserPassword(), BseStarMFConstants.BSE_PASS_KEY);
		Password password = new Password(getPasswordResponse);
		if(!password.isValidPassword()) {
			throw new MFPasswordRequestException(password.getMessage());
		}
		return password.getEncryptedPassword();
	}
	
	
	public String getAccessToken(BseUser bseUser, AccessTokenRequestType accessTokenRequestType) throws MFPasswordRequestException {
		PasswordRequest passwordRequest = new PasswordRequest();
		passwordRequest.setMemberId(bseUser.getBseMemberCode());
		passwordRequest.setPassKey(BseStarMFConstants.BSE_PASS_KEY);
		passwordRequest.setPassword(bseUser.getBseUserPassword());
		passwordRequest.setRequestType(accessTokenRequestType.getValue());
		passwordRequest.setUserId(bseUser.getBseUserId());
		Response response = starMFWebServiceClient.getAccessToken(passwordRequest);
		if(!BseStarMFConstants.STATUS_100.equals(response.getStatus())) {
			throw new MFPasswordRequestException(response.getResponseString());
		}
		return response.getResponseString();
	}

	public OrderResponse getOrderDetails(BseUser bseUser, String clientCode, String fromDate, OrderStatus orderStatus, OrderType orderType, SettlementType settType, SubOrderType subOrderType, String toDate, TransactionType transactionType) {
		OrderRequest orderRequest = new OrderRequest();
		orderRequest.setClientCode(clientCode);
		orderRequest.setFromDate(fromDate);
		orderRequest.setOrderStatus(orderStatus.getValue());
		orderRequest.setOrderType(orderType.getValue());
		orderRequest.setSettType(settType.getValue());
		orderRequest.setSubOrderType(subOrderType.getValue());
		orderRequest.setToDate(toDate);
		orderRequest.setTransType(transactionType.getValue());
		orderRequest.setMemberCode(bseUser.getBseMemberCode());
		orderRequest.setPassword(bseUser.getBseUserPassword());
		orderRequest.setUserId(bseUser.getBseUserId());
		
		OrderResponse orderResponse = starMFWebServiceClient.orderStatus(orderRequest);
		return orderResponse;
		
	}
	
	public String getPaymentStatus(BseUser bseUser, String clientCode, String orderNo, String encryptedPassword) throws MFAdditionalServicesException {
		
		String param = new StringBuilder()
				.append(clientCode)
				.append("|")
				.append(orderNo)
				.append("|")
				.append(PaymentStatusSegment.BSEMF.getValue())
				.toString();
		String paymentStatusResponseString = starMFWebServiceClient.mfapi(AdditionServicesFlag.CLIENT_ORDER_PAYMENT_STATUS.getValue(), bseUser.getBseUserId(), encryptedPassword, param);
		PaymentStatusResponse paymentStatusResponse = new PaymentStatusResponse(paymentStatusResponseString);
		if(!paymentStatusResponse.getStatus().equals(BseStarMFConstants.STATUS_100)) {
			throw new MFAdditionalServicesException(paymentStatusResponse.getRemarks());
		}
		return paymentStatusResponse.getRemarks();
	}
	
	public AllotmentStatementResponse getAllotmentDetailsByDates(BseUser bseUser, String clientCode, String fromDate, OrderStatus orderStatus, OrderType orderType, SettlementType settType, SubOrderType subOrderType, String toDate) {
		AllotmentStatementRequest allotmentStatementRequest = new AllotmentStatementRequest();
		allotmentStatementRequest.setClientCode(clientCode);
		allotmentStatementRequest.setFromDate(fromDate);
		allotmentStatementRequest.setMemberCode(bseUser.getBseMemberCode());
		allotmentStatementRequest.setOrderStatus(orderStatus.getValue());
		allotmentStatementRequest.setOrderType(orderType.getValue());
		allotmentStatementRequest.setPassword(bseUser.getBseUserPassword());
		allotmentStatementRequest.setSettType(settType.getValue());
		allotmentStatementRequest.setSubOrderType(subOrderType.getValue());
		allotmentStatementRequest.setToDate(toDate);
		allotmentStatementRequest.setUserId(bseUser.getBseUserId());
		return starMFWebServiceClient.allotmentStatement(allotmentStatementRequest);
	}
	
	public AllotmentStatementResponse getAllotmentDetails(BseUser bseUser, LocalDate fromDate, LocalDate toDate) {
		OrderStatus orderStatus = OrderStatus.ALL;
		OrderType orderType = OrderType.ALL;
		SettlementType settType = SettlementType.ALL;
		SubOrderType subOrderType = SubOrderType.ALL;
		AllotmentStatementRequest allotmentStatementRequest = new AllotmentStatementRequest();
//		allotmentStatementRequest.setClientCode(clientCode);
		allotmentStatementRequest.setFromDate(fromDate.format(starMfDateTimeFormatter));
		allotmentStatementRequest.setMemberCode(bseUser.getBseMemberCode());
		allotmentStatementRequest.setOrderStatus(orderStatus.getValue());
		allotmentStatementRequest.setOrderType(orderType.getValue());
		allotmentStatementRequest.setPassword(bseUser.getBseUserPassword());
		allotmentStatementRequest.setSettType(settType.getValue());
		allotmentStatementRequest.setSubOrderType(subOrderType.getValue());
		allotmentStatementRequest.setToDate(toDate.format(starMfDateTimeFormatter));
		allotmentStatementRequest.setUserId(bseUser.getBseUserId());
		return starMFWebServiceClient.allotmentStatement(allotmentStatementRequest);
	}
	public AllotmentStatementResponse getAllotmentDetailsByOrderNo(BseUser bseUser, String clientCode, OrderStatus orderStatus, OrderType orderType, SettlementType settType, SubOrderType subOrderType, String orderNo) {
		AllotmentStatementRequest allotmentStatementRequest = new AllotmentStatementRequest();
		allotmentStatementRequest.setClientCode(clientCode);
		allotmentStatementRequest.setMemberCode(bseUser.getBseMemberCode());
		allotmentStatementRequest.setOrderStatus(orderStatus.getValue());
		allotmentStatementRequest.setOrderNo(orderNo);
		allotmentStatementRequest.setPassword(bseUser.getBseUserPassword());
		allotmentStatementRequest.setUserId(bseUser.getBseUserId());
		allotmentStatementRequest.setOrderType(orderType.getValue());
		allotmentStatementRequest.setSettType(settType.getValue());
		allotmentStatementRequest.setSubOrderType(subOrderType.getValue());
		return starMFWebServiceClient.allotmentStatement(allotmentStatementRequest);
	}
	
	public AOFPanSearchResponse aofPanSearch(BseUser bseUser, String pan) {
		AOFPanSearchRequest aofPanSearchRequest = new AOFPanSearchRequest();
		aofPanSearchRequest.setPAN(pan);
		aofPanSearchRequest.setMemberCode(bseUser.getBseMemberCode());
		aofPanSearchRequest.setPassword(bseUser.getBseUserPassword());
		aofPanSearchRequest.setUserId(bseUser.getBseUserId());
		return starMFWebServiceClient.aofPanSearch(aofPanSearchRequest);
	}
	
	public ChildOrderResponse getChildOrderDetails(BseUser bseUser, String clientCode, SystematicPlanType systematicPlanType, String sipRegNo, LocalDate childOrderDate, String encryptedPassword) {
		System.out.println(childOrderDate.format(BseStarMFConstants.BSE_DATETIME_FORMATTER));
		ChildOrderRequest childOrderRequest = new ChildOrderRequest();
		childOrderRequest.setClientCode(clientCode);
		childOrderRequest.setDate(childOrderDate.format(BseStarMFConstants.BSE_DATETIME_FORMATTER));
		childOrderRequest.setEncryptedPassword(encryptedPassword);
		childOrderRequest.setMemberCode(bseUser.getBseMemberCode());
		childOrderRequest.setRegnNo(sipRegNo);
		childOrderRequest.setSystematicPlanType(systematicPlanType.getValue());
		return starMFWebServiceClient.childOrderDetails(childOrderRequest);
	}
	
	public void redemptionAuthentication(BseUser bseUser, String clientCode, String encryptedPassword) {
		String param =  bseUser.getBseMemberCode() + "|" + clientCode;
		System.out.println(param);
		String responseString = starMFWebServiceClient.mfapi(AdditionServicesFlag.CLIENT_REDEMPTION_SMS_AUTHENTICATION.getValue(), bseUser.getBseUserId(), encryptedPassword, param);
		System.out.println(responseString);
	}
	
	public UccResponse uploadUcc(BseUser bseUser, Ucc ucc, String encryptedPassword){

		String uccMfdParam = ucc.getUccString();
		
		String responseString = starMFWebServiceClient.mfapi(AdditionServicesFlag.UCC_MFD.getValue(), bseUser.getBseUserId(), encryptedPassword, uccMfdParam);
		UccResponse uccResponse = new UccResponse(responseString);
		
		return uccResponse;
	}
	
	public FatcaResponse uploadFacta(BseUser bseUser, Fatca fatca, String encryptedPassword) {
		String fatcaUploadParam = fatca.getFatcaString();
		String fatcaResponseString = starMFWebServiceClient.mfapi(AdditionServicesFlag.FATCA_UPLOAD.getValue(), bseUser.getBseUserId(), encryptedPassword, fatcaUploadParam);
		FatcaResponse fatcaResponse = new FatcaResponse(fatcaResponseString);
		return fatcaResponse;
		
	}
	
	public OrderResponse getAllPurchaseOrderStatusDetails(BseUser bseUser, LocalDate fromDate, LocalDate toDate) {
		
		OrderRequest orderRequest = new OrderRequest();
		orderRequest.setFromDate(fromDate.format(starMfDateTimeFormatter));
		orderRequest.setMemberCode(bseUser.getBseMemberCode());
		orderRequest.setOrderStatus(OrderStatus.ALL.getValue());
		orderRequest.setOrderType(OrderType.ALL.getValue());
		orderRequest.setPassword(bseUser.getBseUserPassword());
		orderRequest.setSettType(SettlementType.ALL.getValue());
		orderRequest.setSubOrderType(SubOrderType.ALL.getValue());
		orderRequest.setToDate(toDate.format(starMfDateTimeFormatter));
		orderRequest.setTransType(TransactionType.PURCHASE.getValue());
		orderRequest.setUserId(bseUser.getBseUserId());
		return starMFWebServiceClient.orderStatus(orderRequest);
	}
	
	public OrderResponse getAllRedemptionOrderStatusDetails(BseUser bseUser, LocalDate fromDate, LocalDate toDate) {
		
		OrderRequest orderRequest = new OrderRequest();
		orderRequest.setFromDate(fromDate.format(starMfDateTimeFormatter));
		orderRequest.setMemberCode(bseUser.getBseMemberCode());
		orderRequest.setOrderStatus(OrderStatus.ALL.getValue());
		orderRequest.setOrderType(OrderType.ALL.getValue());
		orderRequest.setPassword(bseUser.getBseUserPassword());
		orderRequest.setSettType(SettlementType.ALL.getValue());
		orderRequest.setSubOrderType(SubOrderType.ALL.getValue());
		orderRequest.setToDate(toDate.format(starMfDateTimeFormatter));
		orderRequest.setTransType(TransactionType.REDEMPTION.getValue());
		orderRequest.setUserId(bseUser.getBseUserId());
		return starMFWebServiceClient.orderStatus(orderRequest);
	}

	public MFAPIResult changePassword(String userId, String oldPassword, String newPassword, String encryptedPassword) {
		String mfApiParam = oldPassword + "|" + newPassword + "|" + newPassword;
		String mfApiResponse = starMFWebServiceClient.mfapi(AdditionServicesFlag.CHANGE_PASSWORD.getValue(), userId, encryptedPassword, mfApiParam);
		return new MFAPIResult(mfApiResponse);
		
	}
	
	/**
     * Generates a mandate
     * 
     * @return
     *     Returns a generated Mandate ID
     *     {@link String }
     *     
     */
	public String generateMandate(BseUser bseUser, String encryptedPassword, String clientCode, Integer mandateAmount, MandateType mandateType, String bankAccountNumber, String bankIfsc, LocalDate startDate, LocalDate endDate) throws MFAdditionalServicesException {
		String param = clientCode + "|" + mandateAmount + "|" + mandateType.getValue() + "|" + bankAccountNumber + "|SB|" + bankIfsc + "||" + startDate.format(starMfDateTimeFormatter) + "|" + endDate.format(starMfDateTimeFormatter);
		String responseString = starMFWebServiceClient.mfapi(AdditionServicesFlag.MANDATE_REGISTRATION.getValue(), bseUser.getBseUserId(), encryptedPassword, param);
		MandateRegistrationResponse mandateCreationResponse= new MandateRegistrationResponse(responseString);
		if(!mandateCreationResponse.isSuccess()) {
			throw new MFAdditionalServicesException(mandateCreationResponse.getStatusDescription());
		}
		return mandateCreationResponse.getMandateId();
	}
	
	/**
     * Generates a mandate authentication URL
     * 
     * @return
     *     Returns a generated Mandate authentication URL
     *     {@link String }
     *     
     */
	
	public String getMandateAuthUrl(BseUser bseUser, String clientCode, String mandateId) throws MFAdditionalServicesException {
		EMandateAuthURLRequest request = new EMandateAuthURLRequest();
		request.setClientCode(clientCode);
		request.setMandateID(mandateId);
		request.setMemberCode(bseUser.getBseMemberCode());
		request.setPassword(bseUser.getBseUserPassword());
		request.setUserId(bseUser.getBseUserId());

		EMandateAuthURLResponse response = starMFWebServiceClient.eMandateAuthURL(request);
		if(!BseStarMFConstants.STATUS_100.equals(response.getStatus())){
			throw new MFAdditionalServicesException(response.getResponseString());
		}
		return response.getResponseString();
	}
	
	/**
     * Get the a Mandate for a client between start date and end date by ID
     * 
     * @return
     *     Returns Mandate Details
     *     {@link MandateDetails }
	 * @throws MFAdditionalServicesException 
     *     
     */
	public MandateDetails getMandateStatusById(BseUser bseUser, String clientCode, String accessToken, LocalDate fromDate, LocalDate toDate, String mandateId) throws MFAdditionalServicesException {
		MandateDetailsRequest request = new MandateDetailsRequest();
		request.setClientCode(clientCode);
		request.setEncryptedPassword(accessToken);
		request.setFromDate(fromDate.format(starMfDateTimeFormatter));
		request.setToDate(toDate.format(starMfDateTimeFormatter));
		request.setMandateId(mandateId);
		request.setMemberCode(bseUser.getBseMemberCode());
		MandateDetailsResponse response = starMFWebServiceClient.mandateDetails(request);
		if(!BseStarMFConstants.STATUS_100.equals(response.getStatus())){
			throw new MFAdditionalServicesException(response.getMessage());
		}
		
		return response.getMandateDetails().getMandateDetails().get(0);
	}
	
	
	/**
     * Get the a List of all Mandates for a client between start date and end date
     * 
     * @return
     *     Returns a List of Mandate Details
     *     {@link List<MandateDetails> }
	 * @throws MFAdditionalServicesException 
     *     
     */
	public List<MandateDetails> getMandateStatus(BseUser bseUser, String clientCode, String accessToken, LocalDate fromDate, LocalDate toDate) throws MFAdditionalServicesException {
		MandateDetailsRequest request = new MandateDetailsRequest();
		request.setClientCode(clientCode);
		request.setEncryptedPassword(accessToken);
		request.setFromDate(fromDate.format(starMfDateTimeFormatter));
		request.setToDate(toDate.format(starMfDateTimeFormatter));
		request.setMemberCode(bseUser.getBseMemberCode());
		MandateDetailsResponse response = starMFWebServiceClient.mandateDetails(request);
		if(!BseStarMFConstants.STATUS_100.equals(response.getStatus())){
			throw new MFAdditionalServicesException(response.getMessage());
		}
		
		return response.getMandateDetails().getMandateDetails();
	}
	
	public String getPaymentLink(BseUser bseUser, String clientCode, String logoutUrl, String encryptedPassword) throws MFAdditionalServicesException {
		String param = bseUser.getBseMemberCode() + "|" + clientCode + "|" + logoutUrl;
		String responseString = starMFWebServiceClient.mfapi(AdditionServicesFlag.PAYMENT_GATEWAY.getValue(), bseUser.getBseUserId(), encryptedPassword, param);
		MFAPIResult mfapiResult = new MFAPIResult(responseString);
		if(!mfapiResult.isSuccess()) {
			throw new MFAdditionalServicesException("Unable to retrieve payment link: " + mfapiResult.getResponse());
		}
		return mfapiResult.getResponse();
	}
	
	public StpOrderEntryResponse newStp(BseUser bseUser, String euin, String clientCode, String fromSchemeCode, String toSchemeCode, 
			BuySellType buySellType, String folioNo, String internalReferenceNo, LocalDate startDate, 
			FrequencyType frequencyType, Integer noOfTransfers, String installmentAmount, String remarks, String encryptedPassword) {
		String stpRegistrationParamString = new StringBuilder()
				.append(clientCode).append('|')
				.append(fromSchemeCode).append('|')
				.append(toSchemeCode).append('|')
				.append(buySellType.getValue()).append('|')
				.append(TransactionType.PURCHASE.getValue()).append('|')
				.append(folioNo).append('|')
				.append(BseUtils.getUniqueRefNo()).append('|')
				.append(startDate.format(starMfDateTimeFormatter)).append('|')
				.append(frequencyType.getValue()).append('|')
				.append(noOfTransfers).append('|')
				.append(installmentAmount)
				.append(BseStarMFConstants.N).append('|')
				.append(BseStarMFConstants.EMPTY).append('|')
				.append(BseStarMFConstants.Y).append('|')
				.append(euin).append('|')
				.append(remarks).append('|')
				.append(BseStarMFConstants.EMPTY)
				.toString();
		
		String responseString = starMFWebServiceClient.mfapi(AdditionServicesFlag.STP_REGISTRATION.getValue(), bseUser.getBseUserId(), encryptedPassword, stpRegistrationParamString);
		
		return new StpOrderEntryResponse(responseString);
	}
	
	public SwpOrderEntryResponse newSwp(BseUser bseUser, String euin, String clientCode, String schemeCode, String folioNo, 
			String internalReferenceNo,	LocalDate startDate, Integer noOfWithdrawals, FrequencyType frequencyType, 
			String installmentAmount, String installmentUnits, String remarks, String encryptedPassword) {
		String swpRegistrationParamString = new StringBuilder()
				.append(clientCode).append('|')
				.append(schemeCode).append('|')
				.append(TransMode.PHYSICAL.getValue()).append('|')
				.append(folioNo).append('|')
				.append(internalReferenceNo).append('|')
				.append(startDate.format(starMfDateTimeFormatter)).append('|')
				.append(noOfWithdrawals).append('|')
				.append(frequencyType.getValue()).append('|')
				.append(installmentAmount).append('|')
				.append(installmentUnits).append('|')
				.append(BseStarMFConstants.N).append('|')
				.append(BseStarMFConstants.EMPTY).append('|')
				.append(BseStarMFConstants.Y).append('|')
				.append(euin).append('|')
				.append(remarks).append('|')
				.append(BseStarMFConstants.EMPTY).toString();
		
		String responseString = starMFWebServiceClient.mfapi(AdditionServicesFlag.SWP_REGISTRATION.getValue(), bseUser.getBseUserId(), encryptedPassword, swpRegistrationParamString);
		
		return new SwpOrderEntryResponse(responseString);
	}
	
	public StpOrderEntryResponse cancelStp(BseUser bseUser, String euin, String stpRegistrationNo, String clientCode, 
			String remarks, String encryptedPassword) {
		String stpCancellationParamString = new StringBuilder()
				.append(stpRegistrationNo).append('|')
				.append(clientCode).append('|')
				.append(remarks)
				.toString();
		
		String responseString = starMFWebServiceClient.mfapi(AdditionServicesFlag.STP_CANCELLATION.getValue(), bseUser.getBseUserId(), encryptedPassword, stpCancellationParamString);
		
		return new StpOrderEntryResponse(responseString);
	}
	
	public SwpOrderEntryResponse cancelSwp(BseUser bseUser, String euin, String swpRegistrationNo, String clientCode, 
			String remarks, String encryptedPassword) {
		String swpCancellationParamString = new StringBuilder()
				.append(swpRegistrationNo).append('|')
				.append(clientCode).append('|')
				.append(remarks)
				.toString();
		
		String responseString = starMFWebServiceClient.mfapi(AdditionServicesFlag.SWP_CANCELLATION.getValue(), bseUser.getBseUserId(), encryptedPassword, swpCancellationParamString);
		
		return new SwpOrderEntryResponse(responseString);
	}
}
