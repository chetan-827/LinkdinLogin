package ece.btech2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuplicateString {
	
	// method 
	public static void findDupilcates(String[] arr){
//		HashMap<String, Integer> frequencyMap = new HashMap<String, Integer>();
//		
//		for(String item: arr) {
//			frequencyMap.put(item, frequencyMap.getOrDefault(item, 0)+1);
//		}
//		//List store duplicate values
//		List<String> duplicates=new ArrayList<String>();
//		
//		// Loop through the map and find elements that appear more than the once
//		for(Map.Entry<String, Integer> entry:frequencyMap.entrySet()) {
//			if (entry.getValue() > 1) {
//                duplicates.add(entry.getKey());
//            }
//		}
//		return duplicates;
		ArrayList<String> duplicates=new ArrayList<String>();
		
		for(int i=0;i< arr.length;i++) {
			for(int j=i+1; j<arr.length;j++) {
				if(arr[i].equals(arr[j]) && !duplicates.contains(arr[i])) {
					duplicates.add(arr[i]);
				}
			}
		}
		
		// print the duplicates
		if(duplicates.isEmpty()) {
			System.out.println("No duplicates found");
		}else {
			System.out.println("Duplicate elements: "+ duplicates);
		}
	}
	public static void main(String[] args) {

		String[] stringArray= {"Apple","Banana","Cherry","orange","Apple","Cherry"};
		findDupilcates(stringArray);
	}

}
