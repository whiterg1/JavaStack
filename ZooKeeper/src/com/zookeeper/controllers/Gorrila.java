package com.zookeeper.controllers;

public class Gorrila extends Mammal {
	
	public Gorrila(String name) {
		super(name);
	}
	
	public void throwSomething() {
		System.out.printf("%s has thrown an object. Energy level has decreased by 5.\n", name);
		energyLevel -= 5;
		return;
	}
	
	public void eatBananas() {
		System.out.printf("%s has eaten a banana. Energy level has increased by 10.\n", name);
		energyLevel += 10;
		return;
	}
	
	public void climb() {
		System.out.printf("%s has climbed a nearby object. Energy level has decreased by 10.\n", name);
		energyLevel -= 10;
		return;
	}
}
