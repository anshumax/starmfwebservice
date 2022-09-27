package dev.anshumax.bsestarmf.additionalservices;

import java.util.regex.Pattern;

import dev.anshumax.bsestarmf.BseStarMFConstants;

public class FatcaResponse {
	private boolean valid;
	private String responseString;
	
	public FatcaResponse(String responseString) {
		this.responseString = responseString;
		if(BseStarMFConstants.STATUS_100.equals(responseString.split(Pattern.quote("|"))[0])) {
			valid = true;
		}
	}
	public void setValid(boolean valid) {
		this.valid = valid;
	}
	public String getResponseString() {
		return this.responseString;
	}
	public boolean isValid() {
		return this.valid;
	}
}
