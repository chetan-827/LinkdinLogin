package ece.btech2;

public class Program5 {
	public static int result;
	public static void main(String[] args) {
		nameprint("Aparna");
		nameprint("Uday");
		nameprint("Uma");
		nameprint("Murthy");
		multiply(12, 1.2);
		wishPerson(5, "Aparna", "How are you?");
		wishPerson(10, "Sunny", "Welcome");
		mathsquare(1,2);
		mathcube(1, 1, 1);
	}
	public static void nameprint(String name) {
		System.out.println("Hi "+name+" How are you?");
	}
	
	public static void multiply(int num1,double num2) {
		System.out.println(num1*num2);
	}
	
	public static void wishPerson(int num1, String name, String wish) {
		for( int i=1; i<=num1; i++) {
			System.out.println("Hi " +name+ " " +wish);
		}
	}
	
	public static void mathsquare(int a, int b) {
		result=a*a+b*b+2*a*b;
		System.out.println("Value of (a+b)2 formula is " +result);
	}
	
	public static void mathcube(int a, int b, int c) {
		result=a*a*a+b*b*b+c*c*c+2*a*b+2*b*c+2*a*c;
		System.out.println("Value of (a+b+c)3 formula is " +result);
	}
}