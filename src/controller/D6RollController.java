package controller;

import java.awt.List;
import java.util.ArrayList;

import model.D6;

public class D6RollController {
	public ArrayList<Integer> rolls = new ArrayList<Integer>();
	
	int onesCounter = 0;
	int twosCounter = 0;
	int threesCounter = 0;
	int foursCounter = 0;
	int fivesCounter = 0;
	int sixesCounter = 0;
	
	D6 dice = new D6(); 
	
	
	public void roll(int n) {
		for(int i = 0; i < n; i++) {
			int k = dice.roll();
			rolls.add(k);
			
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
			else if (k == 5) {
				fivesCounter++;
			}
			else if (k == 6) {
				sixesCounter++;
			}
		}
	}
	
	public void displayResults() {
		System.out.println("Ones rolled: " + onesCounter);
		System.out.println("Twos rolled: " + twosCounter);
		System.out.println("Threes rolled: " + threesCounter);
		System.out.println("Fours rolled: " + foursCounter);
		System.out.println("Fives rolled: " + fivesCounter);
		System.out.println("Sixes rolled: " + sixesCounter);
	}
}
