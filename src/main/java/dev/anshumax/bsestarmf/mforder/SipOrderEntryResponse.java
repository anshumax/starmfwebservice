
package dev.anshumax.bsestarmf.mforder;

import java.util.regex.Pattern;


public class SipOrderEntryResponse {
    private String transactionCode;
    private String uniqueRefNo;
    private String memberId;
    private String clientCode;
    private String userId;
    private String sipRegId;
    private String remarks;
    private boolean success;
    
    public SipOrderEntryResponse(String sipOrderEntryResponseString) {
    	String[] params = sipOrderEntryResponseString.split(Pattern.quote("|"));
    	this.transactionCode = params[0];
    	this.uniqueRefNo = params[1];
    	this.memberId = params[2];
    	this.clientCode = params[3];
    	this.userId = params[4];
    	this.sipRegId = params[5];
    	this.remarks = params[6];
    	if("0".equals(params[7])) {
    		this.success = true;
    	}else {
    		this.success = false;
    	}
    }

	public String getTransactionCode() {
		return transactionCode;
	}

	public String getUniqueRefNo() {
		return uniqueRefNo;
	}

	public String getMemberId() {
		return memberId;
	}

	public String getClientCode() {
		return clientCode;
	}

	public String getUserId() {
		return userId;
	}

	public String getSipRegId() {
		return sipRegId;
	}

	public String getRemarks() {
		return remarks;
	}

	public boolean isSuccess() {
		return success;
	}
	
	@Override
	public String toString() {
		return  transactionCode+ "|" + uniqueRefNo+ "|" + memberId+ "|" + clientCode+ "|" + userId+ "|" + sipRegId+ "|" + remarks+ "|" +(success?1:0);
	}
    
    
}
