package calculator;

import java.io.IOException;

public class Menu extends Maths{

	public void show() {
		System.out.println("--------- Select the operation to perform -----------");
		System.out.println("1. Addition");
		System.out.println("2. Substraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("5. Square");
		System.out.println("6. Cube");

		System.out.print("Operation No = ");
	}
}
