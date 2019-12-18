package com.photon.main;

public class TestConnection {

	public static void main(String[] args) 
	{
		ConnectionFactory f=new ConnectionFactory();
		Connection connection=f.getFactory("mysql");
		connection.getConnection();
	}

}
