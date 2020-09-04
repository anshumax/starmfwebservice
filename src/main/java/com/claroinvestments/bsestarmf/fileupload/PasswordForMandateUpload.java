package com.claroinvestments.bsestarmf.fileupload;

import com.claroinvestments.bsestarmf.BseStarMFConstants;

public class PasswordForMandateUpload {
	private boolean isValidPassword;
	private String encryptedPassword;
	
	public PasswordForMandateUpload(Response passwordResponse) {
		
		if(BseStarMFConstants.STATUS_100.equals(passwordResponse.getStatus())) {
			this.isValidPassword = true;
			this.encryptedPassword = passwordResponse.getResponseString();
		} else {
			this.isValidPassword = false;
			this.encryptedPassword = passwordResponse.getResponseString();
		}
	}
	
	public boolean isValidPassword() {
		return isValidPassword;
	}

	public String getEncryptedPassword() {
		return encryptedPassword;
	}

}
