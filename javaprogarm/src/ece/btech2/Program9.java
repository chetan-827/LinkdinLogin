package ece.btech2;

public class Program9 {

	public static void main(String[] args) {
		

	}
	public static void sum(int...numbers) {
		int sum=0;
		for(int i:numbers) {
			sum+=i;
		}
		System.out.println("Sum:"+sum);
	}

}
