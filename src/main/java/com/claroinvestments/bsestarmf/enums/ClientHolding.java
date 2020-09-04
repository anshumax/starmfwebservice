package com.claroinvestments.bsestarmf.enums;

public enum ClientHolding {
	SINGLE("SI"),
	JOINT("JO"),
	ANYONE_SURVIVOR("AS");

	private String value; 
	  
    public String getValue() 
    { 
        return this.value; 
    } 
  
    private ClientHolding(String value) 
    { 
        this.value = value; 
    }
    
    @Override
    public String toString() {
    	return this.value;
    }
}
