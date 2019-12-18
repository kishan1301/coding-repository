package com.photon.main;

public class ConnectionFactory 
{
Connection getFactory(String type)
{
	if(type.equalsIgnoreCase("oracle"))
	{
		return new OracleConnection();
	}
	else if(type.equalsIgnoreCase("mysql"))
	{
		return new MySQLConnection();
	}
	return null;
}
}
