package com.claroinvestments.bsestarmf.additionalservices;

import java.util.regex.Pattern;

import com.claroinvestments.bsestarmf.BseStarMFConstants;

public class MandateRegistrationResponse {
	private String statusCode;
	private String statusDescription;
	private String mandateId;
	private boolean success;
	
	public MandateRegistrationResponse(String responseString) {
		String[] responseParams = responseString.split(Pattern.quote("|"));
		
		this.statusCode = responseParams[0];
		if(BseStarMFConstants.STATUS_100.equals(statusCode)) {
			this.statusDescription = responseParams[1];
			this.mandateId = responseParams[2];
			this.success = true;
		} else {
			this.statusDescription = responseParams[1];
			this.success = false;
		}
	}
	
	public String getStatusDescription() {
		return statusDescription;
	}
	public String getMandateId() {
		return mandateId;
	}
	public String getStatusCode() {
		return statusCode;
	}
	public boolean isSuccess() {
		return this.success;
	}
	public String toString() {
		return statusCode + "|" + statusDescription + "|" + mandateId;
	}

}
