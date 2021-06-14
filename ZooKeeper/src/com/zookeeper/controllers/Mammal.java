package com.zookeeper.controllers;

public class Mammal {
	protected int energyLevel;
	protected String name;
	
	public Mammal(String name) {
		energyLevel = 100;
		this.name = name;
	}
	
	public Mammal(String name, int energyLevel) {
		this.energyLevel = energyLevel;
		this.name = name;
	}

	public void displayEnergy() {
		System.out.printf("%s has an energy level of %s\n", name, energyLevel);
	}
	
}
