package com.atmecs.java8.methodreference.instancemethod;

public class InstanceMethodReference2
{
	public void saySomething()
	{
		System.out.println("Instance Method....");
	}

	public static void main(String[] args)
	{
		Thread t = new Thread(new InstanceMethodRefernce()::saySomething);
		t.start();
	}

}
