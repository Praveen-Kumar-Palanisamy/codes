package com.te.hibernatetest;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;
@Data
@Entity
public class Employeesecondary {
	
	
	@Id
	private int pan;
	private int aadhaar;
	private String father_Name;
	private int passport_no;
	
	@OneToOne(cascade = CascadeType.ALL) 
	private Employee info;

}
