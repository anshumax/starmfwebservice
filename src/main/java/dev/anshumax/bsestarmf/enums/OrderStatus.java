package dev.anshumax.bsestarmf.enums;

public enum OrderStatus {
	ALL("All"),
	VALID("VALID"),
	INVALID("INVALID");
	
	private String value; 
	  
    public String getValue() 
    { 
        return this.value; 
    } 
  
    private OrderStatus(String value) 
    { 
        this.value = value; 
    }
    
    @Override
    public String toString() {
    	return this.value;
    }
}
