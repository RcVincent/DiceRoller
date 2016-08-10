package controller;

import java.util.TreeMap;

import model.D4;

public class D4RollController {
public TreeMap<Integer, Integer> rolls = new TreeMap<Integer, Integer>(); 
	
	int onesCounter = 0;
	int twosCounter = 0;
	int threesCounter = 0;
	int foursCounter = 0;
	
	D4 dice = new D4(); 
	
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
			else if (k == 4) {
				foursCounter++;
			}
		}
	}
	
	public void displayResults() {
		System.out.println("Ones rolled: " + onesCounter);
		System.out.println("Twos rolled: " + twosCounter);
		System.out.println("Threes rolled: " + threesCounter);
		System.out.println("Fours rolled: " + foursCounter);
	}
			
}
