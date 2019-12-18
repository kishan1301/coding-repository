package com.photon.util;

import com.photon.POJO.Employees;
import com.sun.org.apache.xalan.internal.xsltc.compiler.Pattern;

public class Validation extends Employees {
	
	private static final String EMAIL_PATTERN = 
			"^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
			+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	public static boolean[] validationID = new boolean[5];
	
	
	public boolean validateMail(String email) {
		int id = 1;
		
		Pattern pattern = Pattern.compile(EMAIL_PATTERN, Pattern.CASE_SENSITIVE);
		
		return false;

	}
	
	public boolean validateSalary(float salary) {
		int id = 2;
		if (this.getSalary() > 12000 && this.getSalary() < 150000) {
			return true;
		} else {
			validationID[2] = false;
			return false;
		}
	}
	
	public boolean validateDate() {
		int id = 3;
		return false;
		
	}
	
	public boolean validateContact(String contact) {
		Integer integer = new Integer(integer);
		
		
		return false;
		
	}
}
