package com.claroinvestments.bsestarmf.enums;

public enum BuySellType {
	FRESH("FRESH"),
	ADDITIONAL("ADDITIONAL");

	private String value; 
	  
    public String getValue() 
    { 
        return this.value; 
    } 
  
    private BuySellType(String value) 
    { 
        this.value = value; 
    }
    
    @Override
    public String toString() {
    	return this.value;
    }
}
