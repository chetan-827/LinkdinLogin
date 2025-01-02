package ece.btech;

import java.util.ArrayList;

public class Sample {
	public static void main(String[] args) {
		try {
			System.out.println("Enter into the dragon");
			//joining the current statement
			Thread.currentThread().join();
			// This statement never execute
			System.out.println("This statement never execute");
		}catch (Exception e) {
			// TODO: handle exception
			//Display the exception along with line number using printstacktrace() method
			e.printStackTrace();
		}
		ArrayList<Integer> numbers = new ArrayList<Integer>();
	    numbers.add(5);
	    numbers.add(9);
	    numbers.add(8);
	    numbers.add(1);
	    numbers.forEach( (n) -> { System.out.println(n); } );
	    
	}
}
