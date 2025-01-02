package ece.btech2;

import java.util.Scanner;

public class Program4 {
	//public static int num;
	public static int tablenumber=6;
	public static void main(String[] args) {
		table();
		table();
		table();
		tableInputNumber();
		}
		public static void table() { //Method Declaration with Parameters
			 //Lines of code
			for(int i=1;i<=10;i++) {
				System.out.println(tablenumber+"*"+i+"="+tablenumber*i);
				
				}
		}
		
		public static void tableInputNumber() { //Method declaration without any parameter
			System.out.println("Enter Table number");  //Lines of code
 			Scanner scan = new Scanner(System.in); 
			int tablenumber= scan.nextInt();
			for(int i=1;i<=10;i++) {
				System.out.println(tablenumber+"*"+i+"="+tablenumber*i);
				}
		}

	}
