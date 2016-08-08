package model;

import java.util.Random;

public class D10 {
	private Random value;
	
	public D10() {
		value = new Random(); 
	}
	
	public int roll() {
		int roll = value.nextInt(10) + 1; 
		
		return roll;
	}
}
