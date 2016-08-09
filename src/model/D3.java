package model;

import java.util.Random;

public class D3 {
private Random value;
	
	public D3() {
		value = new Random(); 
	}
	
	public int roll() {
		int roll = value.nextInt(3) + 1; 
		return roll;
	}

	public Random getValue() {
		return value;
	}

	public void setValue(Random value) {
		this.value = value;
	}
}
