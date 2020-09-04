package com.claroinvestments.bsestarmf.mforder;

import java.util.regex.Pattern;

import com.claroinvestments.bsestarmf.enums.MFOrderTransactionCode;

public class MFOrderEntryResponse {
	private MFOrderTransactionCode transactionCode;
	private String uniqueReferenceNumber;
	private String orderNumber;
	private String userId;
	private String memberId;
	private String clientCode;
	private String bseRemarks;
	private String successFlag;
	private boolean success;
	
	public MFOrderEntryResponse(String responseString) {
		
		String contents[] = responseString.split(Pattern.quote("|"));
		transactionCode = MFOrderTransactionCode.valueOf(contents[0]);
		uniqueReferenceNumber = contents[1];
		orderNumber = contents[2];
		userId = contents[3];
		memberId = contents[4];
		clientCode = contents[5];
		bseRemarks = contents[6];
		successFlag = contents[7];
		if("0".equals(successFlag)) {
			this.success = true;
		} else{
			this.success = false;
		}
		
	}

	public MFOrderTransactionCode getTransactionCode() {
		return transactionCode;
	}

	public void setTransactionCode(MFOrderTransactionCode transactionCode) {
		this.transactionCode = transactionCode;
	}

	public String getUniqueReferenceNumber() {
		return uniqueReferenceNumber;
	}

	public void setUniqueReferenceNumber(String uniqueReferenceNumber) {
		this.uniqueReferenceNumber = uniqueReferenceNumber;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getClientCode() {
		return clientCode;
	}

	public void setClientCode(String clientCode) {
		this.clientCode = clientCode;
	}

	public String getBseRemarks() {
		return bseRemarks;
	}

	public void setBseRemarks(String bseRemarks) {
		this.bseRemarks = bseRemarks;
	}

	public String getSuccessFlag() {
		return successFlag;
	}

	public void setSuccessFlag(String successFlag) {
		this.successFlag = successFlag;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}
	
	@Override
	public String toString() {
		return transactionCode.getValue() + "|" + uniqueReferenceNumber + "|" + orderNumber + "|" + userId + "|" + memberId + "|" + clientCode + "|" + bseRemarks + "|" + successFlag;
	}
	
}
