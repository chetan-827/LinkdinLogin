package ece.btech1;

public class ThrowandThrows {
	// throw keyword throw the exception explicitly from a method 
	public static void checkNum(int num) {
		if(num<1) {
			throw new ArithmeticException("\nNumber is negative, cannot calculate square");
		}else {
			System.out.println("Square of "+num +"is "+(num*num));
		}
	}
	
	// Throws keyword is used in method signature to declare on exception 
	public static int dividenum(int m,int n) {
		int div=m/n;
		return div;
	}
	public static void main(String[] args) {
		ThrowandThrows obj=new ThrowandThrows();
//		obj.checkNum(-1);
		System.out.println("Rest of the code");
		
		
		try {
			System.out.println(obj.dividenum(45, 0));
		}catch (Exception e) {
			System.out.println("Number cannot be divide by 0");
		}
		System.out.println("Rest of the code");
	}
}