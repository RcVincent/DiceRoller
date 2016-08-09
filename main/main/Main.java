package main;

import java.io.IOException;
import java.util.Scanner;

import controller.D10RollController;
import controller.D6RollController;
import model.D6;
import model.D10;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner keyboard = new Scanner(System.in);
		
		//Establish these and use the boolean to decide which one is used. 
		D6 dice = new D6();
		D10 dice2 = new D10();
		D6RollController D6controller = new D6RollController();
		D10RollController D10controller = new D10RollController();
		
		
		
		System.out.printf("Would you like to roll multiple dice at once? ");
		String answer = keyboard.next();
		
		if(answer.contentEquals("Yes") || answer.contains("yes")) {
			
			System.out.printf("What dice system would you like to use? Please enter the number of sides: ");
			int systemType = keyboard.nextInt();
			
			System.out.printf("How many rolls do you want to make? ");
			int rolls = keyboard.nextInt();
			
			System.out.printf("How many dice do you want to roll at once? ");
			int multidice = keyboard.nextInt();
		
			if(systemType == 6) {
				D6controller.massroll(rolls, multidice);
				D6controller.displayResults();
			}
		}
		
		else {
			System.out.printf("What dice system would you like to use? Please enter the number of sides: ");
			int systemType = keyboard.nextInt();

			System.out.printf("How many rolls do you want to make? ");
			int rolls = keyboard.nextInt();

			if(systemType == 6) {
				D6controller.roll(rolls);
				D6controller.displayResults();
			}

			if(systemType == 10) {
				D10controller.roll(rolls);
				D10controller.displayResults();

		}
		}
	}
}