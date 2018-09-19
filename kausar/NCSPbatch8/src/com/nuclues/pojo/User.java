package com.nuclues.pojo;

public class User 
{
private int userId;
private String uName;
private String address;
private String aadhaarNo,panNo;
public static String org="Oracle";
public User(int userId,String uName,String address,String aadhaarNo,String panNo)
{
this.userId	=userId;
this.uName=uName;
this.address=address;
this.aadhaarNo=aadhaarNo;
this.panNo=panNo;

}
public User()
{
	System.out.println("Default constructor called");
}
@Override
public String toString() {
	return "User [userId=" + userId + ", uName=" + uName + ", address="
			+ address + ", aadhaarNo=" + aadhaarNo + ", panNo=" + panNo + "]";
}
public static void show()
{
	System.out.println(org+" ");
}
}
