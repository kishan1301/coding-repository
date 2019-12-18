package com.photon.pojo;

import java.util.HashSet;
import java.util.Set;

public class Employee_POJO extends User_POJO {
	// public int emp_dept_id;
	public static Set<String> emp_dept =new HashSet<String>();
	public static int emp_salary;
	public static String emp_Hire_date;
	public static String emp_designation;
	public static int count_manager=0;

	// public int getEmp_dept_id() {
	// return emp_dept_id;
	// }

	// public void setEmp_dept_id(int emp_dept_id) {
	// this.emp_dept_id = emp_dept_id;
	// }

	public int getEmp_salary() {
		return emp_salary;
	}



	public void setEmp_dept(String emp_deptss) {
		emp_dept.add(emp_deptss);
	}

	public Set<String> getEmp_dept() {
		return emp_dept;
	}



	public void setEmp_salary(int emp_salary) {
		this.emp_salary = emp_salary;
	}

	public String getEmp_Hire_date() {
		return emp_Hire_date;
	}

	public void setEmp_Hire_date(String emp_Hire_date) {
		this.emp_Hire_date = emp_Hire_date;
	}

	public String getEmp_designation() {
		return emp_designation;
	}

	public void setEmp_designation(String emp_designation) {
		this.emp_designation = emp_designation;
	}
	public static void no_of_dept(){
		System.out.println("Number OF DEPARTMENTS :" + emp_dept.size());	
		}
	public static void no_of_managers() {
		if(emp_designation.equalsIgnoreCase("manager")){
			++count_manager;
		}
	}



	@Override
	public String toString() {
		return "Employee_POJO [emp_dept=" + emp_dept + ", emp_salary=" + emp_salary + ", emp_Hire_date=" + emp_Hire_date
				+ ", emp_designation=" + emp_designation + ", user_id=" + user_id + ", user_name=" + user_name + "]";
	}
	
}
