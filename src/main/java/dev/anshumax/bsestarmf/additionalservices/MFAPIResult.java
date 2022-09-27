
package dev.anshumax.bsestarmf.additionalservices;

import java.util.regex.Pattern;

import dev.anshumax.bsestarmf.BseStarMFConstants;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MFAPIResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
public class MFAPIResult {

	private String status;
	private String response;
	private boolean isSuccess;
	
	public MFAPIResult(String mfApiResult) {
		String[] resultContents = mfApiResult.split(Pattern.quote("|"));
		status = resultContents[0].trim();
		response = resultContents[1].trim();
		if(BseStarMFConstants.STATUS_100.equals(status)) {
			isSuccess = true;
		} else {
			isSuccess = false;
		}
	}
	
	public MFAPIResult() {
		// TODO Auto-generated constructor stub
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public boolean isSuccess() {
		return isSuccess;
	}

	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
    
}
