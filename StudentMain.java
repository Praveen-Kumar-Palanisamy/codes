package com.te.restaurant;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class StudentMain  {
	static ArrayList<Student > arr;
	static boolean cont=true;
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) throws Exception {
		
		
		
		

		Student  student1 = new Student(10,"ram",20,90);
		Student  studend2 = new Student(20,"kumar",22,80);
		Student  student3 = new Student(30,"laksh",21,99);
		Student  student4 = new Student(40,"praveen",24,93);
		Student  student5 = new Student(50,"annach",20,99);
		arr = new ArrayList<Student> ();

		arr.add(student1);
		arr.add(studend2);
		arr.add(student3);
		arr.add(student4);
		arr.add(student5);
		  System.out.println("Welcom to studentdatabase");
		try {
			  want();
		} catch (EnterVal e) {
			System.out.println(	e.getMessage());	}
		catch (studendexception e) {
		System.out.println(	e.getMessage());
		  System.out.println("please enter th number");
		  arrang();

		}
		catch (InputMismatchException e) {
			System.out.println("please enter the number");
			  arrang();
		}
		
		
	}
	public static void arrang() {	  
	
			int key=s.nextInt();
			switch (key) {
			case 1: Collections.sort(arr, new SortingId());
			  for (Student student : arr) {
			    	System.out.println(student);
			  }
				break;
			case 2: Collections.sort(arr, new SortingName());
		    for (Student student : arr) {
		    	System.out.println(student);
			}
			break;
			case 3: Collections.sort(arr, new SortingAge());
			for (Student student : arr) {
		    	System.out.println(student);
			}
			break;
			case 4: Collections.sort(arr, new SortingMark());
			for (Student student : arr) {
		    	System.out.println(student);
			}
			break;
			case 5: cont=false;
			break;

			default:
				//System.out.println("please enter the valved data");
				throw new studendexception("pleas enter the valved data");
			}
		

	
	}
	 public static void want() {
		  System.out.println("Do you want detile of student\n student id press   1 \n student name press 2 \n student age press  3 \n student mark press 4 \n want to exit press 5");
		 	 arrang();
		 
		  boolean pra = true;
		  do {
		  System.out.println("Do you want to contine yes or no");
       String des =s.next();
		  if("yes".contains(des)) {
			  System.out.println("Do you want detile of student\n student id press   1 \n student name press 2 \n student age press  3 \n student mark press 4 \n wnan to exit press 5");
			  
			  arrang();

			  }
		  else if ("no".contains(des)){
			  System.out.println("Thank you for visiting");
			  pra=false;
			 }
		  else {
			 // System.out.println("plase enter the valved data");
	
		  throw new EnterVal("plase enter the valved data");
		  }
		  }while(pra);
	 
	 }
}