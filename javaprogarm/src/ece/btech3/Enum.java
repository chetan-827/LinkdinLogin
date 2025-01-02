package ece.btech3;

public class Enum {
	enum Level {
		LOW, HIGH, MEDIUM
	}

	public static void main(String[] args) {
		Level var =Level.HIGH;
		System.out.println(var);
		
		switch(var) {
		case LOW:
			System.out.println("Third class");
			break;
		case HIGH:
			System.out.println("First class");
			break;
		case MEDIUM:
			System.out.println("Second class");
			break;
		}
		for(Level vars:Level.values()) {
			System.out.println(vars);
		}
	}

}
