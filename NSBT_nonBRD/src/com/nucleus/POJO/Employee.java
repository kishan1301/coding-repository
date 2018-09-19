package com.nucleus.POJO;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Employee extends User {
	
	Scanner in = new Scanner(System.in);
	private String dept;
	public static Set<String> numOfDept = new HashSet<>();
	private String designation;
	private float salary;
	private String hireDate;
	
	public Employee(int id)	{
		super(id);
		getEmpDetails();
	}
	
	public void getEmpDetails()	{
		System.out.println("Name :");
		this.setUserName(in.next());
		
		System.out.println("Department : ");
		dept = in.next();
		numOfDept.add(dept);
		
		System.out.println("Designation : ");
		designation = in.next();
		
		System.out.println("salary : ");
		salary = in.nextFloat();
		
		System.out.println("Hire date : ");
		hireDate = in.next();
		
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getHireDate() {
		return hireDate;
	}

	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}

	public static int getNumOfDept() {
		// TODO Auto-generated method stub
		return numOfDept.size();
	}
	
	
	
}
