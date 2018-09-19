package com.nucleus.mains;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import com.nucleus.POJO.Employee;

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
			System.out.println("\nEnter the employee ID: ");
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

		System.out.println("\nThe number of manager(s) are " + count + ".\n");
		// Ending the query to find number of managers.

		// Query to show the number of dept.
		System.out.println("Number of departments are " + Employee.getNumOfDept());
		System.out.println("List of departments are " + Employee.numOfDept + ".\n");
		// ending of Query to show the number of dept.

		// Query to show max salary
		float maxSalary = employees[0].getSalary();
		int mark = 0;
		for (int i = 0; i < size; i++) {

			if (employees[i].getSalary() > maxSalary) {
				maxSalary = employees[i].getSalary();
				mark = i;
			}
		}

		System.out.println("\nThe maximum salary is the of employee " + employees[mark].getUserName()
				+ " and the salary is " + maxSalary);

		// ending the max salary query

		// initiating the joining date of the employee query
		System.out.print("\nEnter the Employee's name to search for...");
		String searchName = in.next();
		int nameCount[] = new int[size];
		int flag = 0;
		for (int i = 0, j = 0; i < size; i++) {
			if (employees[i].getUserName().equalsIgnoreCase(searchName)) {
				nameCount[j++] = i;
				flag = 1;
			}
		}
		System.out.println("Search results are...");
		try {
			if (flag == 1) {

				for (int i = 0; i < size; i++) {
					System.out.println("Employee Name : " + employees[nameCount[i]].getUserName());
					System.out.println("Join date : " + employees[nameCount[i]].getHireDate());

				}

			} else {
				System.out.println("None records found!");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("");
		}
		// ending of the joining date of the employee query

		// initiating the string containing "s" in the employee name query
		System.out.println("\nName(s) of the employees containing the letter 's' are...");
		for (int i = 0; i < size; i++) {
			if (employees[i].getUserName().contains("s")) {
				System.out.print(employees[i].getUserName() + " ");
			} /*
				 * else { System.out.
				 * println("\nNone of the employees has the letter the 's' in their name(s).");
				 * }
				 */
		}
		// ending the query to check the string 's' in employees name

		// initiating the query to show the num of employees in each dept.
		int sizeCount = Employee.getNumOfDept();
		int countEmp[] = new int[sizeCount];
		String deptString[] = new String[sizeCount];
		int j = 0;
		for (String s : Employee.numOfDept) {
			deptString[j++] = s;
		}

		for (int i = 0; i < size; i++) {
			for (j = 0; j < sizeCount; j++) {
				if (employees[i].getDept().equalsIgnoreCase(deptString[j])) {
					++countEmp[j];
				}
			}
		}

		System.out.println("\n\nThe numbers of employees in each department are...");
		System.out.println("Department\tEmployee");
		for (int i = 0; i < sizeCount; i++) {
			System.out.println(deptString[i] + "\t\t" + countEmp[i]);
		}

	}

	public static Employee createEmp(int id) {
		return new Employee(id);
	}

}