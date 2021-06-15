package com.java.phone;

public class PhoneTester {

	public static void main(String[] args) {
		Galaxy s9 = new Galaxy("S9", 99, "Verizon", "Ring, Ring, Ring!");
		IPhone iphoneten = new IPhone("X", 100, "AT&T", "Zing");
		
		s9.displayInfo();
		System.out.println(s9.ring());
		System.out.println(s9.unlock());
		
		iphoneten.displayInfo();
		System.out.println(iphoneten.ring());
		System.out.println(iphoneten.unlock());
		
	}

}
