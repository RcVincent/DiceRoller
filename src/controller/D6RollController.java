package controller;


import java.util.TreeMap;

import model.D6;

public class D6RollController {
	
	public TreeMap<Integer, Integer> rolls = new TreeMap<Integer, Integer>(); 
	
	int onesCounter = 0;
	int twosCounter = 0;
	int threesCounter = 0;
	int foursCounter = 0;
	int fivesCounter = 0;
	int sixesCounter = 0;
	
	int onesPercentage = 0; 
	int twosPercentage = 0;
	int threesPercentage = 0; 
	int foursPercentage = 0;
	int fivesPercentage = 0;
	int sixesPercentage = 0; 
	 
	
	D6 dice = new D6(); 
	
	
	public void roll(int n) {
		for(int i = 0; i < n; i++) {
			int k = dice.getRollValue();
			
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
		}
		
		onesPercentage = onesCounter/n;
		twosPercentage = twosCounter/n;
		threesPercentage = threesCounter/n;
		foursPercentage = foursCounter/n; 
		fivesPercentage = fivesCounter/n;
		sixesPercentage = sixesCounter/n;
		 
		
	}
	
	//rolling multiple dice several times, individually tallying values. 
	public void massroll(int n, int m) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				int k = dice.getRollValue();
				
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
		
		System.out.println(); // for a line break in the console
		
		System.out.println("Percent of ones rolled: " + onesPercentage);
		System.out.println("Percent of twos rolled: " + twosPercentage);
		System.out.println("Percent of threes rolled: " + threesPercentage);
		System.out.println("Percent of fours rolled: " + foursPercentage);
		System.out.println("Percent of fives rolled: " + fivesPercentage);
		System.out.println("Percent of sixes rolled: " + sixesPercentage);
		
	}
}
