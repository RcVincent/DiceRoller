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
		
		System.out.println("What dice system would you like to use? Please enter the number of sides");
		int systemType = keyboard.nextInt();
		
		System.out.println("How many rolls do you want to make?");
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