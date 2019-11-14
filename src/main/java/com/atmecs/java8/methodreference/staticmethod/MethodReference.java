package com.atmecs.java8.methodreference.staticmethod;

public class MethodReference
{
	//we have defined a functional interface and referring a static method to it's functional method say().
	public static void saySomething()
	{
		System.out.println("This is Staic Method Reference");
	}

	public static void main(String[] args)
	{
		//Referring Static Method
		Sayable sayable = MethodReference :: saySomething;
		
		//calling interface method
		sayable.say();
	}

}
