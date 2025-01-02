package ece.btech;

public class Basicsofjava {
	public static void main(String args[]) {
		String name ="My Name is chetan";
		int myrullnumber = 55;
		int x=50,y=60,z=10;
		int mynum=9;
		double mynum2=mynum;
		int a=5;
		++a;
		int w=2;
		int randomNum = (int)(Math.random() * 101);  // 0 to 100
	    System.out.println(randomNum);
		String firstName="che\btan ";
		String lastName="Sai";
		System.out.println(Math.max(5, 10));
		System.out.println(Math.abs(-40));
		System.out.println(Math.random());
		System.out.println(firstName.concat(lastName));
		String txt="I am a student at Amrita Sai Instutite of 'Science' and Technology";
		System.out.println(txt.indexOf("Sai"));
		System.out.println(a);
		System.out.println(a % w);
		System.out.println(mynum2);
		System.out.println(x+y+z);
		System.out.println(name);
		System.out.println(myrullnumber);
		System.out.println(name.toUpperCase());
		System.out.println("hello"); // this is single line comments./*this is multi line comments */
		int myage = 22;
		int voteage = 18;
		if (myage>voteage) {
			System.out.println("I can right to vote");
		}else {
			System.out.println("I can\'t vote");
		}
		int time=24;
		if (time > 12) {
			System.out.println("It\'s sunday");
		}else if(time< 12) {
			System.out.println("It\'s saturday");
		}else {
			System.out.println("monday");
		}
		int date=25;
		String result=(date > 1) ? "It\'s Christmas" : "It\'s  New Year";
		String result2=(date < 31)? "It\'s October " : "It\s November";
		System.out.println(result);
		System.out.println(result2);
		
	}
}
