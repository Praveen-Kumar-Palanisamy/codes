package com.te.javabasics.cars;

import java.util.Scanner;

public class CarFactory {
	
	public static Cars getCar() {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Enter the car name:");
		String CarName =scanner.next();
		
		if ( CarName.equalsIgnoreCase("audi")) {
			return new Audi();
			
		} else if(CarName.equalsIgnoreCase("bmw")) {
			return new Bmw();
			
		} else {
		    throw new RuntimeException("Invalid Car");
		}
		
	}

}