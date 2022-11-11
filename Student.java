package com.te.restaurant;



public class Student  {

	
	int id;
	String name;
	int age;
	int mark;
	public Student(int id, String name, int age, int mark) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.mark = mark;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", mark=" + mark + "]";
	}
	
	

}
