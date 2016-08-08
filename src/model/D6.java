package model;


import java.util.Random;

public class D6 {
	
	private Random value; 
	
	public D6() {
	}
	
	
	public int roll() {
		int roll = value.nextInt(6); 
		
		return roll;
	}
			
}
