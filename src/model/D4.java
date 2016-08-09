package model;

import java.util.Random;

public class D4 {
private Random value;
	
	public Random getValue() {
	return value;
}

public void setValue(Random value) {
	this.value = value;
}

	public D4() {
		value = new Random(); 
	}
	
	public int roll() {
		int roll = value.nextInt(4) + 1; 
		return roll;
	}
}
