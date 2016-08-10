package controller;

import java.util.TreeMap;

import model.D12;

public class D12RollController {
	public TreeMap<Integer, Integer> rolls = new TreeMap<Integer, Integer>(); 
	
	int onesCounter = 0;
	int twosCounter = 0;
	int threesCounter = 0;
	int foursCounter = 0;
	int fivesCounter = 0;
	int sixesCounter = 0;
	int sevensCounter = 0;
	int eightsCounter = 0;
	int ninesCounter = 0;
	int tensCounter = 0;
	int elevensCounter = 0;
	int twlevesCounter = 0;
	
	//int onesPercentage, twosPercentage, threesPercentage, foursPercentage, fivesPercentage, sixesPercentage, sevensPercentage, eightsPercentage, ninesPercentage, tensPercentage = 0; 
	D12 dice = new D12(); 
	
	
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
			else if (k == 5) {
				fivesCounter++;
			}
			else if (k == 6) {
				sixesCounter++;
			}
			else if (k == 7) {
				sevensCounter++;
			}
			else if (k == 8) {
				eightsCounter++;
			}
			else if (k == 9) {
				ninesCounter++;
			}
			else if (k == 10) {
				tensCounter++;
			}
			else if (k == 11) {
				elevensCounter++;
			}
			else if (k == 12) {
				twlevesCounter++;
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
			System.out.println("Sevens rolled: " + sevensCounter);
			System.out.println("Eights rolled: " + eightsCounter);
			System.out.println("Nines rolled: " + ninesCounter);
			System.out.println("Tens rolled: " + tensCounter);
			System.out.println("Elevens rolled: " + elevensCounter);
			System.out.println("Twleves rolled: " + twlevesCounter);
		
}
}
