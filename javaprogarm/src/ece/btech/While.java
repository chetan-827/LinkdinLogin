package ece.btech;

public class While {
	public static void main(String[]args) {
		int i = 0;
		while (i<10) {
			System.out.println(i);
			i++;
			if (i==9) {
				break;
			}
		}
		int j=3;
		do {
			System.out.println(j);
			j++;
		}
		while(j<5);
	}
}
