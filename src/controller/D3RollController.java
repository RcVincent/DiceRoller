package controller;

import java.util.TreeMap;

import model.D3;

public class D3RollController {
	
	public TreeMap<Integer, Integer> rolls = new TreeMap<Integer, Integer>(); 
	
	int onesCounter = 0;
	int twosCounter = 0;
	int threesCounter = 0;
	
	D3 dice = new D3();
	
	public void roll(int n) {
		for(int i = 0; i < n; i++) {
			int k = dice.roll();
			
			//Populate the treemap
			rolls.put(i, k);
			
			if(k == 1) {
				onesCounter++;
			}
			else if (k == 2) {
				twosCounter++;
			}
			else if (k == 3) {
				threesCounter++;
			}
		}
	}
	
	public void displayResults() {
		System.out.println("Ones rolled: " + onesCounter);
		System.out.println("Twos rolled: " + twosCounter);
		System.out.println("Threes rolled: " + threesCounter);
	}
}
