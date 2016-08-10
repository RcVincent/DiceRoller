package main;

import java.io.IOException;
import java.util.Scanner;

import controller.D10RollController;
import controller.D12RollController;
import controller.D20RollController;
import controller.D3RollController;
import controller.D4RollController;
import controller.D6RollController;
import model.D6;
import model.D10;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner keyboard = new Scanner(System.in);

		//Establish these and use the boolean to decide which one is used. 
		
		D3RollController D3controller = new D3RollController();
		D4RollController D4controller = new D4RollController();
		D6RollController D6controller = new D6RollController();
		D10RollController D10controller = new D10RollController();
		D12RollController D12controller = new D12RollController();
		D20RollController D20controller = new D20RollController();

		System.out.printf("What dice system would you like to use? Please enter the number of sides: ");
		int systemType = keyboard.nextInt();

		System.out.printf("How many rolls do you want to make? ");
		int rolls = keyboard.nextInt();
		
		if(systemType == 3) {
			D3controller.roll(rolls);
			D3controller.displayResults();
		}
		if(systemType == 4) {
			D4controller.roll(rolls);
			D4controller.displayResults();
		}
		
		if(systemType == 6) {
			D6controller.roll(rolls);
			D6controller.displayResults();
		}

		if(systemType == 10) {
			D10controller.roll(rolls);
			D10controller.displayResults();

		}
		
		if(systemType == 12) {
			D12controller.roll(rolls);
			D12controller.displayResults();
		}
		
		if(systemType == 20) {
			D20controller.roll(rolls);
			D20controller.displayResults();
		}
	}
}
