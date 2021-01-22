package com.claroinvestments.bsestarmf.additionalservices;

import java.util.regex.Pattern;

import com.claroinvestments.bsestarmf.BseStarMFConstants;

public class StpOrderEntryResponse {
	private String statusCode;
	private String statusDescription;
	private boolean success;
	private String stpRegistrationNo;
	
	public StpOrderEntryResponse(String responseString) {
		String[] responseParams = responseString.split(Pattern.quote("|"));
		
		this.statusCode = responseParams[0];
		if(BseStarMFConstants.STATUS_100.equals(statusCode)) {
			this.statusDescription = responseParams[1];
			this.stpRegistrationNo = statusDescription;
			this.success = true;
		} else {
			this.statusDescription = responseParams[1];
			this.success = false;
		}
	}

	public String getStatusCode() {
		return statusCode;
	}

	public String getStatusDescription() {
		return statusDescription;
	}

	public boolean isSuccess() {
		return success;
	}

	public String getStpRegistrationNo() {
		return stpRegistrationNo;
	}
	
}
