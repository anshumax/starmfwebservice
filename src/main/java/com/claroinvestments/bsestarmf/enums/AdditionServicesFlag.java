package com.claroinvestments.bsestarmf.enums;

public enum AdditionServicesFlag {
	FATCA_UPLOAD("01"),
	UCC_MFD("02"),
	PAYMENT_GATEWAY("03"),
	CHANGE_PASSWORD("04"),
	UCC_MFI("05"),
	MANDATE_REGISTRATION("06"),
	STP_REGISTRATION("07"),
	SWP_REGISTRATION("08"),
	STP_CANCELLATION("09"),
	SWP_CANCELLATION("10"),
	CLIENT_ORDER_PAYMENT_STATUS("11"),
	CLIENT_REDEMPTION_SMS_AUTHENTICATION("12"),
	CKYC_UPLOAD("13"),
	MANDATE_STATUS("14"),
	SYSTEMATIC_PLAN_AUTHENTICATION("15"),
	ORDER_REJECTION("16");

	private String value; 
	  
    public String getValue() 
    { 
        return this.value; 
    } 
  
    private AdditionServicesFlag(String value) 
    { 
        this.value = value; 
    }
    
    @Override
    public String toString() {
    	return this.value;
    }
}
