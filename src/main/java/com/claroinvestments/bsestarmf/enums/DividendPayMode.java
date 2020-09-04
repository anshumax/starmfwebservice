package com.claroinvestments.bsestarmf.enums;

public enum DividendPayMode {
	CHEQUE("01"),
	DIRECT_CREDIT("02"),
	ECS("03"),
	NEFT("04"),
	RTGS("05");

	private String value; 
	  
    public String getValue() 
    { 
        return this.value; 
    } 
  
    private DividendPayMode(String value) 
    { 
        this.value = value; 
    }
    
    @Override
    public String toString() {
    	return this.value;
    }
}
