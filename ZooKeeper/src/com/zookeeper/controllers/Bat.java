package com.zookeeper.controllers;

public class Bat extends Mammal {
	
	public Bat(String name, int energyLevel) {
		super(name, energyLevel);
	}

	public void fly() {
		System.out.printf(" Whoosh! %s has taken flight. Energy level has decreased by 50.\n", name);
		energyLevel -= 50;
		return;
	}
	
	public void eatHumans() {
		System.out.printf("Crunch! %s has eaten a human. Energy level has increased by 25.\n", name);
		energyLevel += 25;
		return;
	}
	
	public void attackTown() {
		System.out.printf("Boom! %s has attacked a nearby town. Energy level has decreased by 100.\n", name);
		energyLevel -= 100;
		return;
	}
}
