package ece.btech3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringtoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Chetan";
		
		char[] MyArray=name.toCharArray();
		System.out.println(MyArray[0]);
		
		for(char i:MyArray) {
			System.out.println(i);
		}
		
		// sort an array
		
		String[] students= {"chetan","Raju","siva","Ganesh"};
		Arrays.sort(students);
		for(String i: students) {
			System.out.println(i);
		}
		
	}

}
