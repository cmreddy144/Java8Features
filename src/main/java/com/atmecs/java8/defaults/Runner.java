package com.atmecs.java8.defaults;

public interface Runner {
	
	default void move()
	{
		System.out.println("I can Run");
	}
}
