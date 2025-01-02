package ece.btech3;

public class Constructor {
	int id;
	String student;
	int age;
	public Constructor() {
		int a=10;
		System.out.println(a);
		System.out.println("This is default constructor");
		
	}
	public Constructor(int i,String n,int a) {
		// this is parameterized constructor
		id=i;
		student=n;
		age=a;
	}
	void display() {
		System.out.println("My id number is: "+id );
		System.out.println("Student name: "+student);
		System.out.println("My age is: "+age);
	}
	

	public static void main(String[] args) {
		Constructor con=new Constructor(); 
		Constructor c=new Constructor(55,"chetan",22); // this is parameterized cons with values
		c.display();
	}

}
