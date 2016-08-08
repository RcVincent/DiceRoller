package model;


import java.util.Random;

public class D6 {
	
	private Random value; 
	
	public D6() {
		value = new Random(); 
	}
	
	
	public Random getValue() {
		return value;
	}


	public void setValue(Random value) {
		this.value = value;
	}
	
	public int getRollValue() {
		int k = value.nextInt(6) + 1; 
		return k;
	}
			
}
