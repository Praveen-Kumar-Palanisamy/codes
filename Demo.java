package com.te.restaurant;

import java.util.*;

public class Demo {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Welcome to cafe");
		System.out.println("Your order please...Below is our Menu");
		String[] list = { "Pizza-100", "Burger-79", "Faluda-80", "Samosa-60" };
		for (String liste : list) {
			System.out.println(liste);
		}
		System.out.println("Enter your order");
		// System.out.println("if you what to ");
		//boolean input = true;
		//do { 
		    int a;
			String menu = s.next();
			System.out.println(menu);
			for(String lister: list) {
				if(lister.contains(menu)) {
					
					StringBuffer alpha = new StringBuffer(), num = new StringBuffer(), special = new StringBuffer();
					for (int i = 0; i < lister.length(); i++) {
						if (Character.isDigit(lister.charAt(i)))
							num.append(lister.charAt(i));
						else if (Character.isAlphabetic(lister.charAt(i)))
							alpha.append(lister.charAt(i));
						else
							special.append(lister.charAt(i));
					}
					System.out.println(alpha);
					System.out.println(num);
					System.out.println(special);
					
					
				}
					
			}
			System.out.println("Do you wish to proceed with this order?/n Press yes for yes and no for no");
			String menuIntake = s.next();
			switch (menuIntake) {
			case "yes": {
				// String menu=s.next();


//				StringBuffer alpha = new StringBuffer(), num = new StringBuffer(), special = new StringBuffer();
//				for (int i = 0; i < liste.length(); i++) {
//					if (Character.isDigit(liste.charAt(i)))
//						num.append(liste.charAt(i));
//					else if (Character.isAlphabetic(liste.charAt(i)))
//						alpha.append(liste.charAt(i));
//					else
//						special.append(liste.charAt(i));
//				}
//				System.out.println(alpha);
//				System.out.println(num);
//				System.out.println(special);

			} break;
			
			case "no": {

	
				System.out.println("thank you ");
			}
			}

		//} while (input);

	}

}
