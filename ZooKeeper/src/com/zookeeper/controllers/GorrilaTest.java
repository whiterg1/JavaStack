package com.zookeeper.controllers;

public class GorrilaTest {

	public static void main(String[] args) {
		Gorrila magila = new Gorrila("Magilla");
		
		magila.displayEnergy();
		
		magila.throwSomething();
		magila.throwSomething();
		magila.throwSomething();
		
		magila.displayEnergy();
		
		magila.eatBananas();
		magila.eatBananas();
		
		magila.displayEnergy();
		
		magila.climb();
		
		magila.displayEnergy();
	}

}
