package dev.anshumax.bsestarmf.enums;

public enum AccessTokenRequestType {
	MANDATE("Mandate");

	private String value; 
	  
    public String getValue() 
    { 
        return this.value; 
    } 
  
    private AccessTokenRequestType(String value) 
    { 
        this.value = value; 
    }
    
    @Override
    public String toString() {
    	return this.value;
    }
}
