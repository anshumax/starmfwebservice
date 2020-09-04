package com.claroinvestments.bsestarmf.enums;

public enum FrequencyType {
	MONTHLY("MONTHLY"),
	QUARTELY("QUARTELY"),
	WEEKLY("WEEKLY");

	private String value; 
	  
    public String getValue() 
    { 
        return this.value; 
    } 
  
    private FrequencyType(String value) 
    { 
        this.value = value; 
    }
    
    @Override
    public String toString() {
    	return this.value;
    }
}
