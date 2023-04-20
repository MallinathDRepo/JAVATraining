package calculator;

import java.io.IOException;

public class Entry {
	public static void main(String[] args) throws IOException {
	
		Menu m = new Menu();		
		m.mathMenu();
		
		int operation = GetInput.readInteger();
		System.out.println(" You have selected Addition operation \n");
		
		System.out.print("Enter 1st Number : ");
		int number1 = GetInput.readInteger();
		
		System.out.print("\nEnter 2nd Number : ");
		int number2 = GetInput.readInteger();
		
		switch(operation) {
		case 1:
			 m.add(number1, number2);
			 break;
		case 2:
			m.substract(number1, number2);
			break;
		case 3:
			m.multiply(number1, number2);
			break;
		case 4:
			m.div(number1, number2);
			break;
		case 5:
			m.square(number1, number2);
			break;
		case 6:
			m.cube(number1, number2);
			break;
		}
		
		System.out.println("\n ****** Do you wish to perform more operations?  Yes = 1  Exit = 0");
		System.out.print("Choice = ");
		int repeat = GetInput.readInteger();
		
		switch(repeat) {
		case 1:
			m.mathMenu();
			break;
		case 0:
			System.out.println("----- End -----");
			break;
		}
	}
}