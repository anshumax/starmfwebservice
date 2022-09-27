package dev.anshumax.bsestarmf.additionalservices;

import java.util.regex.Pattern;

import dev.anshumax.bsestarmf.BseStarMFConstants;

public class SwpOrderEntryResponse {
	private String statusCode;
	private String statusDescription;
	private boolean success;
	private String swpRegistrationNo;
	
	public SwpOrderEntryResponse(String responseString) {
		String[] responseParams = responseString.split(Pattern.quote("|"));
		
		this.statusCode = responseParams[0];
		if(BseStarMFConstants.STATUS_100.equals(statusCode)) {
			this.statusDescription = responseParams[1];
			this.swpRegistrationNo = statusDescription;
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

	public String getSwpRegistrationNo() {
		return swpRegistrationNo;
	}
	
}
