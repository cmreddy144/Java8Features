package com.atmecs.java8.methodreference.constructorreference;

class Message
{
	public Message(String msg)
	{
		System.out.println(msg);
	}
}

/*
 * You can refer a constructor by using the new keyword
 */
public class ConstructorReference
{
	public static void main(String args[])
	{
		Messageable hello = Message :: new;
		hello.getMessage("Constructor Referring....");

	}
}
