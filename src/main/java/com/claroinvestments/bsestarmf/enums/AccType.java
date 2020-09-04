package com.claroinvestments.bsestarmf.enums;

public enum AccType {
	SAVINGS_BANK("SB"),
	CURRENT_BANK("CB"),
	NRE("NE"),
	NRO("NO");

	private String value; 
	  
    public String getValue() 
    { 
        return this.value; 
    } 
  
    private AccType(String value) 
    { 
        this.value = value; 
    }
    
    @Override
    public String toString() {
    	return this.value;
    }
}
