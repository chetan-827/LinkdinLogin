package ece.btech2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Wrapperclass {

	public static void checkage(int age) {
		if(age<18) {
			throw new ArithmeticException("Throwing an exception");
		//	throw new Exception();
		}
		else {
			System.out.println("Access denied");
		}
	}
	public static void main(String[] args) {
		
		checkage(18);
		
		Integer myInt=55;
		Double myDouble=5.99;
		System.out.println(myInt);
		System.out.println(myDouble.intValue());
		String myString=myInt.toString();
		System.out.println(myString.length());
		
		try {
		int []numbers= {12,34,435,535,24};
		System.out.println(numbers[6]);
		}catch (Exception e) {
			System.out.println("Something went wrong");
		}finally {
			System.out.println("The 'try catch' is finished");
		}
		
		
		
		
		Pattern p=Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
		Matcher m=p.matcher("vist w3schools");
		boolean matchfound=m.find();
		if(matchfound) {
			System.out.println("Match Found");
		}else {
			System.out.println("Match not found");
		}
	}
	
}
