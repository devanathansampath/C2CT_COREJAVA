package com.tns.ifet.day5.finalstat;

public class FinalVariable {
	final int x = 100;

	// Declare a static blank final variable.
	final static int Y;

	// Declare & intialize static final variable.
	final static int Z = 10;

	// instatnce method
	void change() {
		//x = 30; // final variables can't be reassigned
		//Y = 200; // final s
	}

	@Override
	public String toString() {
		return "FinalVariable [x=" + x + ", Y" + Y + "]";
	}

	// Declare a static block to initialize the final static variable.
	static {
		Y = 20;
		//Z = 100;
		System.out.println("Value of Y: " + Y);
	}

}
