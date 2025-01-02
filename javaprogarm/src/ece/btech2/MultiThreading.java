package ece.btech2;

public class MultiThreading {
	public static int amount=0;

	public static void main(String[] args) {
		for(int i=0;i<8;i++) {
		Multithread obj=new Multithread();
		obj.start();}
		
		Mains thread=new Mains();
		thread.start();
		while(thread.isAlive()) {
			System.out.println("Waiting...");
		}
		System.out.println("Mains: "+amount);
		amount++;
		System.out.println("Mains: "+amount);
	}
}
class Multithread extends Thread{
	public void run() {
		try {
			// Displaying the thread that is running
			System.out.println("Thread "+ Thread.currentThread().getId()+" is running");
		}catch(Exception e){
			// Throwing an exception
			System.out.println("Exception is caught");
		}
	}
}
class Mains extends Thread{
	
	public void run() {
		int amount = 0;
		amount++;
	}
}