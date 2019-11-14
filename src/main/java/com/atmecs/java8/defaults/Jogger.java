package com.atmecs.java8.defaults;

public interface Jogger {
	
	default void move()
	{
		System.out.println("I can Jog");
	}
}
