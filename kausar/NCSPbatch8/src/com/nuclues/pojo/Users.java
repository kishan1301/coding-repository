package com.nuclues.pojo;

public class Users 
{
	public  String uName;
public Users(String uName)
{
	this.uName=uName;
	System.out.println("User constructor");
}
Users()
{
	System.out.println("without arg.. parent constructor");
}
}
