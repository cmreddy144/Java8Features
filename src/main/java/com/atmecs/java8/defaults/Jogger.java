package com.atmecs.java8.defaults;

/*
 * Default methods enable us to add new functionality to existing interfaces without 
 * breaking older implementation of these interfaces
 */
public interface Jogger {
	
	default void move()
	{
		System.out.println("I can Jog");
	}
}
