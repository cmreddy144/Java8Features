package com.atmecs.java8.methodreference.instancemethod;

public class InstanceMethodRefernce
{
	public void saySomething()
	{
		System.out.println("This is non static and local method");
	}

	public static void main(String[] args)
	{
		InstanceMethodRefernce instanceMethod = new InstanceMethodRefernce();

		//Referring Non Static method using reference
		Sayable sayable = instanceMethod :: saySomething;
		sayable.say();
		
		//Referring a Non Static Method Using Anonymous Object
		Sayable sayable2 = new InstanceMethodRefernce() :: saySomething; //
		sayable2.say();
	}

}
