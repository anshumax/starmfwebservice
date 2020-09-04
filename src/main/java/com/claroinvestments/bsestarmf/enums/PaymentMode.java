package com.claroinvestments.bsestarmf.enums;

public enum PaymentMode {
	DIRECT("DIRECT"),
	NODAL("NODAL"),
	OTM("OTM"),
	NEFTRTGS("NEFTRTGS"),
	UPI("UPI");
	
	private String value; 
	  
    public String getValue() 
    { 
        return this.value; 
    } 
  
    private PaymentMode(String value) 
    { 
        this.value = value; 
    }
    
    @Override
    public String toString() {
    	return this.value;
    }
}
