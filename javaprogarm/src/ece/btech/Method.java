package ece.btech;

public class Method {
	static void mycar(String name) {
		System.out.println(name + " car");
	}
	public static void main(String[]args) {
		mycar("Benz");
		int i=3;
		do {
			System.out.println(i);
			i++;
		}
		while(i<5);
	}
}
