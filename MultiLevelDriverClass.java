package com.nucleus.mains;

import java.util.Scanner;

import com.nucleus.POJO.Employee;
import com.nucleus.POJO.Manager;

public class MultiLevelDriverClass {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		/*
		 * System.out.println(employee instanceof Employee);
		 * System.out.println(employee2 instanceof Manager);
		 */
		boolean loop = true;

		while (loop = true) {
			//System.out.println("NSEL...");
			//System.out.println("1.");
			
			
			//Creating the employees
			System.out.println("Enter the number of employees: ");
			int size = in.nextInt();
			
			Employee[] employees = new Employee[size];
			
			for(int i = 0; i < size; i++)	{
				
			}
			
			loop = false;
		}
		
		
		
		
		
		
		
	}
	
	public static Employee createEmp(int id)	{
		return new Employee(id);
	}

}
