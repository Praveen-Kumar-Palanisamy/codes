package com.te.hibernatetest;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name ="techno")
public class Employee {

	
	@Id
	private int id ;
	private String name;
	private int  age;
	private String designation;
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "info")
	private Employeesecondary employeesecondary1;
	
	
}
