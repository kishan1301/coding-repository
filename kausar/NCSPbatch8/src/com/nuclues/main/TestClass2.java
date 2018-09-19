package com.nuclues.main;
class Parent
{
	void parentMethod()
	{
		System.out.println("Inside parent method");
	}
}
class Child extends Parent
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
public class TestClass2 {

	public static void main(String[] args) 
	{
			Parent p=new Child(); //upcasting
			p.parentMethod();
			Child ch=(Child)p;
			ch.childMethod();
	}

}
