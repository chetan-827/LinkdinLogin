package ece.btech;

public class Forloop {
	public static void main(String[]args) {
		for (int i=0; i<10;i++) {
			if(i==4) {
				break;
			}
			System.out.println(i);
			}
		for (int j=0; j<10; j=j+2) {
			System.out.println(j);
		}
		for (int i=0; i<=2; i++) {
			System.out.println("outer:"+i);
			//inner
		for (int j=0;j<=3; j++) {
			System.out.println("inner:"+j);
		}
		}
		String[] cars={"volvo","BMW","Honda"};
		for(String i:cars) {
			System.out.println(i);
		}
	}
}
