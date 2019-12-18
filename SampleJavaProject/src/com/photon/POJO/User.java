package com.photon.POJO;

import java.util.Scanner;

public class User {

	private int userID;
	private String userName;

	public User(int id) {
		// TODO Auto-generated constructor stub
		userID = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
