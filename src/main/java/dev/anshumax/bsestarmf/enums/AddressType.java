package dev.anshumax.bsestarmf.enums;

public enum AddressType {
	RESIDENTIAL_OR_BUSINESS("1"),
	RESIDENTIAL("2"),
	BUSINESS("3"),
	REGISTERED_OFFICE("4"),
	UNSPECIFIED("5");

	private String value; 
	  
    public String getValue() 
    { 
        return this.value; 
    } 
  
    private AddressType(String value) 
    { 
        this.value = value; 
    }
    
    @Override
    public String toString() {
    	return this.value;
    }
}
