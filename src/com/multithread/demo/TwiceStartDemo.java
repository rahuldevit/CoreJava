package com.multithread.demo;

public class TwiceStartDemo extends Thread{
		
	public void run() {
		System.out.println("experiment with thread");
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TwiceStartDemo obj = new TwiceStartDemo();
		obj.start();
		obj.start();
//		
//		TwiceStartDemo obj1 = new TwiceStartDemo();
//		obj1.start();
//		
	}

}
