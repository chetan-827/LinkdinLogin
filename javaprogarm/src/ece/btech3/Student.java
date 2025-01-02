package ece.btech3;

public class Student {
	int rollno;
	String name;
	static String college="ITS";
	public Student(int r, String n) {
		rollno=r;
		name=n;
	}
	
	void display() {
		System.out.println(rollno+" "+name+" "+college);
	}
	public static void main(String[] args) {

		Student s1=new Student(2, "Chetan");
		Student s2=new Student(55, "sai");
		Student.college="ASIST";
		s1.display();
		s2.display();
	}

}
