package model;

import java.util.Random;

public class D12 {
private Random value;
	
	public Random getValue() {
	return value;
}

public void setValue(Random value) {
	this.value = value;
}

	public D12() {
		value = new Random(); 
	}
	
	public int roll() {
		int roll = value.nextInt(12) + 1; 
		return roll;
	}
}
