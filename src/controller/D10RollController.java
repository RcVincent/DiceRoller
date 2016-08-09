package controller;


import java.util.TreeMap;

import model.D10;

public class D10RollController {

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
		
		//int onesPercentage, twosPercentage, threesPercentage, foursPercentage, fivesPercentage, sixesPercentage, sevensPercentage, eightsPercentage, ninesPercentage, tensPercentage = 0; 
		D10 dice = new D10(); 
		
		
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
			
			}
			/*
			onesPercentage = onesCounter/n;
			twosPercentage = twosCounter/n;
			threesPercentage = threesCounter/n;
			foursPercentage = foursCounter/n; 
			fivesPercentage = fivesCounter/n;
			sixesPercentage = sixesCounter/n;
			sevensPercentage = sevensCounter/n;
			eightsPercentage = eightsCounter/n;
			ninesPercentage = ninesCounter/n;
			tensPercentage = tensCounter/n;
			*/
		}
		
		public void massRoll(int n, int m) {
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < m; j++) {

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
			/*
			System.out.println();//for a line break in the console
			
			System.out.println("Percent of ones rolled: " + onesPercentage);
			System.out.println("Percent of twos rolled: " + twosPercentage);
			System.out.println("Percent of threes rolled: " + threesPercentage);
			System.out.println("Percent of fours rolled: " + foursPercentage);
			System.out.println("Percent of fives rolled: " + fivesPercentage);
			System.out.println("Percent of sixes rolled: " + sixesPercentage);
			System.out.println("Percent of sevens rolled: " + sevensPercentage);
			System.out.println("Percent of eights rolled: " + eightsPercentage);
			System.out.println("Percent of nines rolled: " + ninesPercentage);
			System.out.println("Percent of tens rolled: " + tensPercentage);
			*/
		}
	}


