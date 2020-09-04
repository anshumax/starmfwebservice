package com.claroinvestments.bsestarmf.additionalservices;

import com.claroinvestments.bsestarmf.BseStarMFConstants;

public class AccessToken {
	private boolean isValidPassword;
	private String encryptedPassword;
	private String message;
	
	public AccessToken(Response response) {
		String resultStatus = response.getStatus();
		String resultMessage = response.getResponseString();
		
		if(BseStarMFConstants.STATUS_100.equals(resultStatus)) {
			this.isValidPassword = true;
			this.encryptedPassword = resultMessage;
			this.message = "Success";
		} else {
			this.isValidPassword = false;
			this.encryptedPassword = BseStarMFConstants.NA;
			this.message = resultMessage;
		}
	}
	
	public boolean isValidPassword() {
		return isValidPassword;
	}

	public String getEncryptedPassword() {
		return encryptedPassword;
	}

	public String getMessage() {
		return message;
	} 
}
