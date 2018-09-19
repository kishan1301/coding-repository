package com.nucleus.main;


 class inheritance1
{
	void parentMethod()
	{
		System.out.println("Inside parent method");
	}
}
class Child extends inheritance1
{
	void childMethod()
	{
		System.out.println("Inside child method");
	}
	void parentMethod()
	{
		System.out.println("method overridden inside child class...");
	}
}
public class inheritance {

	public static void main(String[] args) 
	{
		inheritance1 p=new Child(); //upcasting
			p.parentMethod();
			try{
			Child ch1= (Child) new inheritance1();
	
			ch1.parentMethod();
			
			}
			catch(Exception e){
				System.out.println("jbj");
			}
			
//			Child ch=(Child)p;
//			ch.childMethod();
	}

}
