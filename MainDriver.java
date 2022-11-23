package com.te.hibernatetest;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainDriver {
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.setId(1);
		emp.setName("Siva");
		emp.setAge(24);
		emp.setDesignation("Sales");
		
		
		Employeesecondary employeesecondary = new Employeesecondary();
		employeesecondary.setAadhaar(12222);
		employeesecondary.setFather_Name("shami");
		employeesecondary.setPan(765);
		employeesecondary.setPassport_no(2134);
		employeesecondary.setInfo(emp);
		emp.setEmployeesecondary1(employeesecondary);
		
		EmployeeEducation employeeeducation =new EmployeeEducation(); 
		EntityManagerFactory factory= Persistence.createEntityManagerFactory("Empolyee");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction entityTransaction=manager.getTransaction();
		entityTransaction.begin();
		manager.persist(emp);
		entityTransaction.commit();
		
		
		
	}

}
