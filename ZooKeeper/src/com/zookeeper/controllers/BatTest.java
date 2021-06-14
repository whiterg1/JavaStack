package com.zookeeper.controllers;

public class BatTest {

	public static void main(String[] args) {
		Bat dracula = new Bat("Dracula", 300);
		
		dracula.displayEnergy();
		
		dracula.attackTown();
		dracula.attackTown();
		dracula.attackTown();
		
		dracula.eatHumans();
		dracula.eatHumans();
		
		dracula.fly();
		dracula.fly();
		
		dracula.displayEnergy();

	}

}
