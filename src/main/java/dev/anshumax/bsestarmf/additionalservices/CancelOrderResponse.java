package dev.anshumax.bsestarmf.additionalservices;

import java.util.regex.Pattern;

public class CancelOrderResponse {
	private String transactionCode;
	private String uniqueReferenceNo;
	private String orderNo;
	private String userId;
	private String memberCode;
	private String clientCode;
	private String bseRemarks;
	private String successFlag;
	private boolean success;
	
	public CancelOrderResponse(String responseString) {
		String[] responseParams = responseString.split(Pattern.quote("|"));
		this.transactionCode = responseParams[0];
		this.uniqueReferenceNo = responseParams[1];
		this.orderNo = responseParams[2];
		this.userId = responseParams[3];
		this.memberCode = responseParams[4];
		this.clientCode = responseParams[5];
		this.bseRemarks = responseParams[6];
		this.successFlag = responseParams[7];
		if("0".equals(successFlag)) {
			success = true;
		} else {
			success = false;
		}
	}

	public String getTransactionCode() {
		return transactionCode;
	}

	public String getUniqueReferenceNo() {
		return uniqueReferenceNo;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public String getUserId() {
		return userId;
	}

	public String getMemberCode() {
		return memberCode;
	}

	public String getClientCode() {
		return clientCode;
	}

	public String getBseRemarks() {
		return bseRemarks;
	}

	public String getSuccessFlag() {
		return successFlag;
	}

	public boolean isSuccess() {
		return success;
	}
	
	@Override
	public String toString() {
		return transactionCode + "|" + uniqueReferenceNo + "|" + orderNo + "|" + userId + "|" + memberCode + "|" + clientCode + "|" + bseRemarks + "|" + successFlag;
	}
	
}
