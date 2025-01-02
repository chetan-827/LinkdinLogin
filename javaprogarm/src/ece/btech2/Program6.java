package ece.btech2;


public class Program6 {
	public static int num;
	public static void main(String[]args) {
		number(3);
		value(10938);
	}
	public static void number(int num) {
		//System.out.println("list of even numbers from 1 to "+number+":");
		
		for(int i=0; i<=num;i++) {
			System.out.println(i+" numbers");
		}
	}
	public static void value(int i) {
			
			if(i%2==0) {
				System.out.println(i+" number is even");
			}else {
				System.out.println(i+" number is odd");
			}
		}
	
	
}
