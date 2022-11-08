package com.te.javabasics.cars;

public interface Cars {
	
    void accelerate();
    void breaks();
    void gear();
    default void AirBag() {
    	System.out.println("i am airbag");
    }
    

}
