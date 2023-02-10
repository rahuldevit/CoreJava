package com.multithread.demo;

public class CreateThread2 implements Runnable {
	public void run() {
		System.out.println("I have created my first thread");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreateThread2 obj = new CreateThread2();
		
		
		Thread a = new Thread(obj);
		a.start();
	
	}

}
