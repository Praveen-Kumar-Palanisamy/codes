package com.te.restaurant;

import java.util.Comparator;

public class SortingMark implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.mark-o2.mark;
	}

}
