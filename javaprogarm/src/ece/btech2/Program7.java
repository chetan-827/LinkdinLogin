package ece.btech2;

public class Program7 {

	public static void main(String[] args) {
		length("aparna");
		length("sunny");
		length("Inturi chaitanya sai 123 from ece");
		mylength("HI hello");
		mylength("MY NAME IS CHETANSAI");
		concat("chetan"," sai");
		addnum("10","30");
		math(5,10);
		random();
	}
	public static void length(String name) {
		System.out.println(name.length());
	}
	public static void mylength(String name) {
		System.out.println(name.indexOf("hello"));
		System.out.println(name.toLowerCase());
	}
	public static void concat(String firstname ,String lastname) {
		System.out.println(firstname.concat(lastname));
		//System.out.println(firstname.concat(lastname));
	}
	public static void addnum(String num,String number) {
		System.out.println(num+number);
	}
	public static void math(int num,int number) {
		System.out.println(Math.max(num,number));
	}
	public static void random() {
		System.out.println((int)(Math.random()*50));
	}
}
