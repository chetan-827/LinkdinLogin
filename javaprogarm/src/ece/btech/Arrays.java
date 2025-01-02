package ece.btech;

public class Arrays {
	public static void main(String[] args) {
		String[] cars= {"Honda","BMW"};
		System.out.println(cars[1]);
		System.out.println(cars.length);
		int [][]myNumbers = {{1,2,3,4},{5,6,7,8},{33,55,66,99}};
		myNumbers[2][2]=57;
		myNumbers[2][0]=9;
		System.out.println(myNumbers[2][0]);
		int[][]myNum = {{4,5,6,8},{9,19,36}};
		for (int i = 0; i < myNum.length; ++i){
			for (int j= 0; j < myNum[i].length;++j){
			System.out.println(myNum[i][j]);
			}
		}
		
		String[] names= {"ramesh","suresh","Ramu","siddhu"};
		for(int i=0; i< names.length; i++) {
			System.out.println(names[i]);
		}
		
		for(String sc: names) {
			System.out.println(sc);
		}
		//
		int rollnum[]= {20,23,43,56,45,65,55,57};
		
		float avg, sum=0;
		
		int length=rollnum.length;
		System.out.println(length);
		for(int num: rollnum) {
			sum+=num;
		}
		System.out.println(sum);
		avg=sum/length;
		System.out.println(avg);
		
		int age[]= {20,2,23,43,54,25};
		int le=age.length;
		int lowestage=age[0];
		System.out.println(lowestage);
		
		for(int i: age) {
			System.out.println(i);
			if(lowestage>i) {
				lowestage=i;
			}
			System.out.println(lowestage);
		}
		System.out.println("The lowest age in the array is: "+lowestage);
	}	
}
