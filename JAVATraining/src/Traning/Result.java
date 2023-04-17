package Traning;

public class Result {

	public static void main(String[] args) {
		int a=6;
		int b=5;
		
		Maths m = new Maths();
		m.add(a, b);
		m.multiply(a, b);
		m.sub(a, b);
		m.div(a, b);
		m.square(a, b);
		m.cube(a, b);

	}
}