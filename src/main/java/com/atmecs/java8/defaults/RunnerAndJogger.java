package com.atmecs.java8.defaults;

public class RunnerAndJogger implements Runner,Jogger {

	@Override
	public void move() {
		Runner.super.move();
		Jogger.super.move();
	}
}
