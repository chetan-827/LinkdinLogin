package ece.btech3;

public class ReversetheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="chetan";
		String reversename="";

		for(int i=0;i<name.length();i++){
			reversename=name.charAt(i)+reversename;
		//	System.out.println(name.charAt(i));
		}
		System.out.println("Reverse Name of chetan: "+ reversename);
	}

}
