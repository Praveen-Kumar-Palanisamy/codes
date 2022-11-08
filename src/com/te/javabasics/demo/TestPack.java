package com.te.javabasics.demo;

public class TestPack {

	public void myName() {

		System.out.println(" My name is arvind");
	}

	protected void companyName() {
		System.out.println("My company is test yantra");
	}

	private void myDesignation() {
		// TODO Auto-generated method
		System.out.println("I am a developer ");

	}

	 void idNum() {
		System.out.println("My id number is 007");
	}

	public static void main(String[] args) {
		TestPack testPack = new TestPack();
		testPack.myName();
		testPack.companyName();
		testPack.myDesignation();
		testPack.idNum();
	}
}
