package com.te.restaurant;

import java.util.*;

public class Order {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
       System.out.println("Welcome to cafe");
       System.out.println("Your order please");
		String[] list = {"Pizza-100","Burger-79","Faluda-80","Samosa-60"};
		for(String liste:list) {
			System.out.println(liste);
		}
		//System.out.println("if you what to  ");
		boolean input =true;
		do {
		String menu=s.next();
		System.out.println(menu);
		System.out.println("Do you wish to proceed with this order?/n Press 1 for yes and 2 for no");
		String menuIntake=s.next();
		switch(menuIntake) {
		case 1:{
			    
		       }
		
		}
		
		
	    }while(input);

}
}
