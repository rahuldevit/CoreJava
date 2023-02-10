package com.multithread.demo;

public class DemoSleep extends Thread{
	
	public void run() {
		System.out.println("Lets Start the sleep method");
		
		for(int i = 1; i<=10; i++) {
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException a) {
				System.out.println(a);
			}
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DemoSleep obj = new DemoSleep();
		DemoSleep obj1 = new DemoSleep();
		
		obj.start();
		obj1.start();
		
	}

}
