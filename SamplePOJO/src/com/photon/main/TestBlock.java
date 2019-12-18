package com.photon.main;
class Test
{
	Test()
	{
		System.out.println("Object created");
	}
	static
	{
		System.out.println("static block");
	}
	{
		System.out.println("Initialization block");
	}
}
public class TestBlock 
{

	public static void main(String[] args) 
	{	
			Test obj= new Test();
			Test ob=new Test();
			
	}

}
