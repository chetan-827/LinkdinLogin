package ece.btech3;

public class AverageArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] age= {10,12,43,53,23,12,42,55,57};
		
		float avg,sum=0;
		int length=age.length;
		 
		for(int i: age) {
			sum+=i;
		}
		
		avg=sum/length;
		System.out.println(avg);
 	}

}
