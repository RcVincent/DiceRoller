package model;

import java.util.Random;

public class D20 {
private Random value;
	
	public D20() {
		value = new Random(); 
	}
	
	public Random getValue() {
		return value;
	}

	public void setValue(Random value) {
		this.value = value;
	}

	public int roll() {
		int roll = value.nextInt(20) + 1; 
		return roll;
	}
}
