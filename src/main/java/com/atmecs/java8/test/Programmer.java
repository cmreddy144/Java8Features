package com.atmecs.java8.test;

abstract class Writer
{
	public static void write()
	{
		System.out.println("Writing....");
	}
}

class Author extends Writer
{
	public static void write() {
		System.out.println("Writing Book...");
	}
}

public class Programmer extends Writer
{
	public static void write()
	{
		System.out.println("Writing Code...");
	}
	
	@SuppressWarnings("static-access")
	public static void main(String args[])
	{
		Writer writer = new Programmer();
		writer.write();
	}
}