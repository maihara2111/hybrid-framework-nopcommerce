package javaOOP;

public class Topic_04_Overloading {

	static int plusMethod(int x, int y) {
		return x+y;
	}
	
	static double plusMethod(double x, double y) {
		return x + y;
	}
	
	public static void main (String[] args) {
		int myNum1 = plusMethod(13, 10);
		double myNum2= plusMethod(13.10, 21.11);
		
		System.out.println("int: " + myNum1);
		System.out.println("double: " + myNum2);
	}
	
	
}
