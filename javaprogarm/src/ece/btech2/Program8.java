package ece.btech2;

public class Program8 {

	public static void main(String[] args) {
		reveresename("Aparna");
		reverse("sunny");
		myname("cherry");
		names("chetan");
	}
	public static void reverse(String name) {
		String originalStr=name;
		String reversedStr="";
	    System.out.println("Original string: " + originalStr);
	        
	    for (int i = 0; i<originalStr.length(); i++) {
	      reversedStr = originalStr.charAt(i) + reversedStr;
	    }
	    
	    System.out.println("Reversed string: "+ reversedStr);
		
	}
	
	public static void reveresename(String name) {
		String reversename="";
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		char c;
		for(int i=name.length();i>0;i--) { //Aparna
			c=name.charAt(i-1);
			reversename=reversename+c;
		}
		
		System.out.println(reversename);
	}
	public static void myname(String name) {
		String yourname="";
		char c;
		for(int i=name.length();i>0;i--) {
			c=name.charAt(i-1);
			yourname=yourname+c;
		}
		System.out.println(yourname);
	}
	public static void names(String name) {
		String ourname="";
		char c;
		for(int i=name.length();i>0;i--) {
			c=name.charAt(i-1);
			ourname=ourname+c;
		}
		System.out.println(ourname);
	}
}