package interfaceDemo;

import java.io.IOException;
import java.util.*;

public class TestInterface implements MyInterface, Interface2{
	
	@Override
	public void addition(int a, int b) {
		int sum = a+b;
		System.out.println("\nSum = "+sum);
	}
	
	@Override
	public void multiply(int a, int b) {
		int mul = a*b;
		System.out.println("\nMultiplication = "+mul);
	}
	
	public static void main(String args[]) throws IOException {
		
		TestInterface ti = new TestInterface();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter 1st Number : ");
		int no1 = sc.nextInt();

		System.out.print("\nEnter 2nd Number : ");
		int no2 = sc.nextInt();
		
		ti.addition(no1, no2);
		ti.multiply(no1, no2);		
	}
}
