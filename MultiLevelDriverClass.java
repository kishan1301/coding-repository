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
		/// boolean loop = true;

		// while (loop) {
		// System.out.println("NSEL...");
		// System.out.println("1.");

		// Creating the employees
		System.out.println("Enter the number of employees: ");
		int size = in.nextInt();

		Employee[] employees = new Employee[size];

		for (int i = 0; i < size; i++) {
			System.out.println("Enter the employee ID: ");
			employees[i] = createEmp(in.nextInt());

		}

		/// loop = false;
		// }

		int count = 0;
		for (int i = 0; i < size; i++) {
			if (employees[i].getDesignation().equalsIgnoreCase("manager")) {
				count++;
			}
		}

		System.out.println("The number of manager(s) are " + count);

		System.out.println("Number of departments are " + Employee.getNumOfDept());
		System.out.println("List of departments are " + Employee.numOfDept);

		float maxSalary = employees[0].getSalary();
		int mark = 0;
		for (int i = 0; i < size; i++) {

			if (employees[i].getSalary() > maxSalary) {
				maxSalary = employees[i].getSalary();
				mark = i;
			}
		}

		System.out.println("The maximum salary is the of employee " + employees[mark].getUserName()
				+ " and the salary is " + maxSalary);

		// ending the max salary query

		// initiating the joining date of the employee query
		System.out.print("Enter the Employee's name to search for...");
		String searchName = in.next();

		for (int i = 0; i < size; i++) {
			if (employees[i].getUserName().equalsIgnoreCase(searchName)) {
				System.out
						.println("The joining date of the employee" + searchName + " is " + employees[i].getHireDate());
			}
		}
		// ending of the joining date of the employee query

		
		// initiating the string containing "s" in the employee name query
		System.out.println("Name(s) of the employees ontaininf the aplhabet 's' are...");
		for (int i = 0; i < size; i++) {
			if (employees[i].getUserName().contains("s")) {
				System.out.print(employees[i].getUserName()+ " ");
			}
		}
		
	}

	public static Employee createEmp(int id) {
		return new Employee(id);
	}

}
