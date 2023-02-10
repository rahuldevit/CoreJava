package com.multithread.demo;

public class JoinMethodDemo extends Thread{
	
	public void run() {
		for(int i = 0; i<10; i++) {
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		
		JoinMethodDemo obj = new JoinMethodDemo();
		JoinMethodDemo obj1 = new JoinMethodDemo();
		JoinMethodDemo obj2 = new JoinMethodDemo();
		
		obj.start();
		try {
			obj.join();
		}
		catch (Exception e) {
		System.out.println(e);
		}
		
		obj1.start();
		obj2.start();
		
	}

}
