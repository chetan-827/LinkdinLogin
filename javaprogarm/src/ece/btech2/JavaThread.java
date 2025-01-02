package ece.btech2;

public class JavaThread  {

	
	public static void main(String[] args) throws InterruptedException {
		
		JavaThread obj=new JavaThread();
		Main thread = new Main();
		Thread obj1=new Thread(thread);
		obj1.start();
		for(int i=0; i<5;i++)
		System.out.println("This code is outside of the thread");
		Thread.sleep(5);
		
	}
}
 class Main implements Runnable{
	
	public void run() {
		for(int i=0;i<5;i++)
		System.out.println("This code is running in the thread");
	}
}
 