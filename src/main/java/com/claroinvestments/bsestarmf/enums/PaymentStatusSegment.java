package com.claroinvestments.bsestarmf.enums;

public enum PaymentStatusSegment {
	BSEMF("BSEMF"),
	SGB("SGB");
	
	private String value; 
	  
    public String getValue() 
    { 
        return this.value; 
    } 
  
    private PaymentStatusSegment(String value) 
    { 
        this.value = value; 
    }
    
    @Override
    public String toString() {
    	return this.value;
    }
}
