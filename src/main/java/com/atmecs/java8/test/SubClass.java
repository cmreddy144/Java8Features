package com.atmecs.java8.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


class SuperClass
{
	SuperClass(int x)
	{
		System.out.println("Super");
	}
}

public class SubClass extends SuperClass
{
	private Date rob = new Date();
	private java.util.Date sharon = new java.util.Date();
	SubClass()
	{
		super(10);
		System.out.println("Sub 2");
	}

	public static void main(String[] args)
	{
		List<String> items = new ArrayList<>();
		items.add("Pen");
		items.add("Pencil");
		items.add("Box");
		for (String i : items)
		{
			if (i.indexOf("P") == 0)
			{
				continue;
			} else
			{
				System.out.print(i + " ");
			}
		}

		int x = 10;
		int y = 2;
		try
		{
			for (int z = 2; z >= 0; z--)
			{
				int ans = x / z;
				System.out.print(ans + " ");
			}
		} catch (Exception e1)
		{
			System.out.println("E1");
		} /*
			 * catch (ArithmeticException e1) { System.out.println("E2"); }
			 */
		StringBuilder s1 = new StringBuilder("Java");
		 String s2 = "Love";
		 s1.append(s2);
		 s1.substring(4);
		 System.out.println(s1);
		 int foundAt = s1.indexOf(s2);
		System.out.println(foundAt);

		Runnable r1 = new Runnable()
		{
			@Override
			public void run()
			{
				System.out.println("");
				
			}
		};
		
	}
}
