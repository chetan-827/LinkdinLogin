package ece.btech3;

public class LowestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age[]= {12,23,432,12,24,14,3,13,5};
		
		int lowestage=age[0];
		
		for(int i:age) {
			if(lowestage>i) {
				lowestage=i;
			}
		}
		System.out.println(lowestage);
	}

}
