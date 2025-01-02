package ece.btech3;

public class CalculatorMethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculatorMethodOverloading cal=new CalculatorMethodOverloading();
		System.out.println(cal.add(23, 234));
		System.out.println(cal.mul(24,34,62));
		int i=5;
		System.out.println(i++);
		System.out.println(i);
		System.out.println(++i);
		
	}
	public int add(int a,int b) {
		return a+b;
	}
	public double mul(int a,int b,int c) {
		return a*b*c;
	}
}
