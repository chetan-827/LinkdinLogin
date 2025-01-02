package ece.btech1;	

public class Program1 {

	public static void main(String[] args) {
		addNumbers(-90,30,10);
		addNumbers(1555,3900,780);
		subtractNumbers(500,700);
		
	}
	// Addition method
	public static void addNumbers(int num1,int num2,int num3) {
		System.out.println(num1+num2+num3);	
	}
	
	// Subtraction method
	public static void subtractNumbers(int number1,int number2) {
		System.out.println(number1-number2);
	}

}
