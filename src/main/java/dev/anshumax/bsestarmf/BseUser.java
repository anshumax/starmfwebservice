package dev.anshumax.bsestarmf;

public class BseUser {
	private String bseMemberCode;
	private String bseUserId;
	private String bseUserPassword;
	
	public BseUser(String bseMemberCode, String bseUserId, String bseUserPassword) {
		this.bseMemberCode = bseMemberCode;
		this.bseUserId = bseUserId;
		this.bseUserPassword = bseUserPassword;
	}
	
	public String getBseMemberCode() {
		return bseMemberCode;
	}
	public void setBseMemberCode(String bseMemberCode) {
		this.bseMemberCode = bseMemberCode;
	}
	public String getBseUserId() {
		return bseUserId;
	}
	public void setBseUserId(String bseUserId) {
		this.bseUserId = bseUserId;
	}
	public String getBseUserPassword() {
		return bseUserPassword;
	}
	public void setBseUserPassword(String bseUserPassword) {
		this.bseUserPassword = bseUserPassword;
	}
	
	@Override
	public String toString() {
		return "BseUser [bseMemberCode=" + bseMemberCode + " | bseUserId=" + bseUserId + " | bseUserPassword="
				+ bseUserPassword + "]";
	}
}
