package dev.anshumax.bsestarmf.additionalservices;

import java.util.regex.Pattern;

public class PaymentStatusResponse {
	private String status;
	private String remarks;
	
	public PaymentStatusResponse(String paymentStatusResponseString) {
		String[] responseParams = paymentStatusResponseString.split(Pattern.quote("|"));
		this.status = responseParams[0];
		this.remarks = responseParams[1];
		
		
	}

	public String getStatus() {
		return status;
	}

	public String getRemarks() {
		return remarks;
	}
	
	public String toString() {
		return "Status: " + status + ", Remarks: " + remarks;
	}

}
