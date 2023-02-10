package com.multithread.demo;

public class RunDemo extends Thread{
	
	public void run() {
		System.out.println("Experiment run method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RunDemo obj = new RunDemo();
		obj.run();
		
		RunDemo obj1 = new RunDemo();
		obj1.run();
			
	}

}
