package com.BLC.ELC;

public class Student {
	private String name;
	private int rollNumber;
	private double percentage;

	public void setStudentDetails(String nm, int roll, double perc) {
		name = nm;
		rollNumber = roll;
		percentage = perc;
	}

	public void getStudentDetails() {
		System.out.println("Student Name: "+ name);
		System.out.println("Roll Number : "+ rollNumber);
		System.out.println("Percentage  : "+ percentage);
	}
}