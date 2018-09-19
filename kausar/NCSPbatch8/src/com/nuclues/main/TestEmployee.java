package com.nuclues.main;

import com.nuclues.pojo.Employee;

public class TestEmployee {

	public static void main(String[] args) 
	{
	Employee obj=new Employee();
	obj.setEmpId(100);
	obj.seteName("Veer");
	obj.setSalary(23000);
	obj.setDep("Accounts");
	/*System.out.println("Employee ID: "+obj.getEmpId()+"  Name: "
	+obj.geteName()+"Salary "+ obj.getSalary()+" Department: "+obj.getDep());*/
	System.out.println(obj);
	}

}
