package ece.btech2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class Arraylist {

	public static void main(String[] args) {
		
		//ArrayList<String> student=new ArrayList<String>();
		LinkedList<String> student=new LinkedList<String>();
		student.add("Ramu");
		student.add("Suresh");
		student.add("Ramesh");
		student.add("Srinu");
		student.add("Amar");
		student.addFirst("Iyra");
		System.out.println(student);
		System.out.println(student.size());
		System.out.println(student);
		System.out.println(student.getLast());
		System.out.println(student.get(0));
		for(int i=0;i<student.size();i++) {
			System.out.println(student.get(i));
		}
	//	Collections.reverse(student);
		Collections.sort(student);
		for(String i : student) {
			System.out.println(i);
		}
		//Hashmap store items in "Key/value" pairs, and you can access them by an index of another type
		HashMap<String, String> capitalcities=new HashMap<String, String>();
		capitalcities.put("Telangana","Hyderabad");
		capitalcities.put("India", "Delhi");
		capitalcities.put("AP", "Amaravathi");
		capitalcities.put("Karnataka", "Benguluru");
		System.out.println(capitalcities.get("AP"));
		System.out.println(capitalcities);
		System.out.println(capitalcities.size());
		// To print keys
		for(String i: capitalcities.keySet()) {
			System.out.println(i);
		}
		// To print values
		for(String i: capitalcities.values()) {
			System.out.println(i);
		}
		// To print keys and values
		for (String i: capitalcities.keySet()) {
			System.out.println("Key: "+i+" value: "+ capitalcities.get(i));
		}
		HashMap<String, Integer> students=new HashMap<String, Integer>();
		students.put("siva", 53);
		students.put("chetan", 55);
		students.put("jagadeesh",56);
		for(String i: students.keySet()) {
			System.out.println("Key: "+ i +" Values: "+ students.get(i));
		} 
		// Hashset is a collections of items where every item is unique, and found in the java.util package.
		HashSet<String> people=new HashSet<String>();
		people.add("srinu");
		people.add("ram");
		people.add("gopi");
		System.out.println(people.contains("ram"));
		
		HashSet<Integer> number=new HashSet<Integer>();
		number.add(4);
		number.add(5);
		number.add(8);
		number.add(9);
		// get the iterator
		// iterator is an object that can be used to loop through collections like arraylist and hashset.it is called an iterator because iterating is the terminal term for looping. 
		Iterator<Integer> it=number.iterator();
		//print the first item
		System.out.println(it.next());
		System.out.println(number);
		for(int i=1; i<=10; i++) {
			if(number.contains(i)) {
				System.out.println(i + " was found in the set");
			} else {
				System.out.println(i + " was not found in the set");
			}
		}
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		ArrayList<Integer> rollnum=new ArrayList<Integer>();
		rollnum.add(50);
		rollnum.add(55);
		rollnum.add(57);
		rollnum.add(60);
		Iterator<Integer> It=rollnum.iterator();
		while(It.hasNext()) {
			Integer i=It.next();
			if(i<58) {
				It.remove();
			}
		}
		System.out.println(rollnum);
	}

}
