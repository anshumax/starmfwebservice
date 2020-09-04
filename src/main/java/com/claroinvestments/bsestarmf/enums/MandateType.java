package com.claroinvestments.bsestarmf.enums;

public enum MandateType {
	XSIP("X"),
	ISIP("I"),
	EMANDATE("E"),
	NETBANKING("N");

	private String value; 
	  
    public String getValue() 
    { 
        return this.value; 
    } 
  
    private MandateType(String value) 
    { 
        this.value = value; 
    }
    
    @Override
    public String toString() {
    	return this.value;
    }
}
