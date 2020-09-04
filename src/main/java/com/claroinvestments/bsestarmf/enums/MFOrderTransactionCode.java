package com.claroinvestments.bsestarmf.enums;

public enum MFOrderTransactionCode {
	NEW("NEW"),
	CANCEL("CXL");
	
	private String value; 
	  
    public String getValue() 
    { 
        return this.value; 
    } 
  
    private MFOrderTransactionCode(String value) 
    { 
        this.value = value; 
    }
    
    @Override
    public String toString() {
    	return this.value;
    }
}
