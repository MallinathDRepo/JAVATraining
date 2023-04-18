package Traning;

import java.util.Scanner;


public class Result {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in); //System.in is a standard input stream.
		System.out.print("Enter first number- ");
		int a= sc.nextInt();
		System.out.print("Enter second number- ");
		int b= sc.nextInt();
		Maths m = new Maths();
		m.add(a, b);
		m.multiply(a, b);
		m.sub(a, b);
		m.div(a, b);
		m.square(a, b);
		m.cube(a, b);
	}
}