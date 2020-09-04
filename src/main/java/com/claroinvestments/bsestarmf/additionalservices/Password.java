package com.claroinvestments.bsestarmf.additionalservices;

import java.util.regex.Pattern;

import com.claroinvestments.bsestarmf.BseStarMFConstants;

public class Password {
	private boolean isValidPassword;
	private String encryptedPassword;
	private String message;
	
	public Password(String getPasswordResponseString) {
		String[] results = getPasswordResponseString.split(Pattern.quote("|"));
		String resultStatus = results[0];
		String resultMessage = results[1];
		
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
