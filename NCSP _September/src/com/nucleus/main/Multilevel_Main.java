package com.nucleus.main;

import com.nucleus.pojo.Employee_POJO;

//import java.util.Scanner;

import com.nucleus.pojo.Manager_POJO;

public class Multilevel_Main {

	static Manager_POJO obj[] = new Manager_POJO[9];

	public static void main(String[] args) {
		// Scanner sc =new Scanner(System.in);
		int max = 0;
		System.out.println("ENTER THE DETAILS");

		for (int i = 0; i < 9; i++) {

			obj[i] = new Manager_POJO();

			obj[i].setUser_id(i + 1);

			obj[i].setUser_name("yasir");

			obj[i].setEmp_dept("ACCOUNTS");
			obj[i].setEmp_designation("MANAGER");
			obj[i].setEmp_Hire_date("02/02/2000");
			obj[i].setEmp_salary(1000);

		}

		Employee_POJO.no_of_dept();
		Employee_POJO.no_of_managers();

		for (int i = 0; i < 9; i++) {

			if (obj[i].getEmp_salary() > max) {
				max = obj[i].getEmp_salary();

			}
		}
		
		System.out.println("MAX SALARY Is:" + max);

	}
	
}
