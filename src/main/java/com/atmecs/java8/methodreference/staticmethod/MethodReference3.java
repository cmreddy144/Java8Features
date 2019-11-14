package com.atmecs.java8.methodreference.staticmethod;

import java.util.function.BiFunction;

class Arithmetic
{
	public static int add(int a, int b) 
	{
		return a+b;
	}
	
	public static float add(int a, float b)
	{
		return a+b;
	}
}

/*
 * we are using BiFunction interface and using it's apply() method.
 */
public class MethodReference3
{

	public static void main(String[] args)
	{
		BiFunction<Integer, Integer, Integer> adder = Arithmetic :: add;
		BiFunction<Integer, Float, Float> adder1 = Arithmetic :: add;
		int result = adder.apply(10, 20);
		float result1 = adder1.apply(10, 20.2f);
		System.out.println(result +" - " + result1);
	}

}
