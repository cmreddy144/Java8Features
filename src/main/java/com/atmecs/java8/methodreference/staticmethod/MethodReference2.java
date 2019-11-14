package com.atmecs.java8.methodreference.staticmethod;

/*
 *  we are using predefined functional interface Runnable to refer static method
 */
public class MethodReference2
{
	public static void threadStatus()
	{
		System.out.println("Thread is Running...");
	}
	
	public static void main(String[] args)
	{
		Thread t = new Thread(MethodReference2 :: threadStatus);
		t.start();
	}

}
