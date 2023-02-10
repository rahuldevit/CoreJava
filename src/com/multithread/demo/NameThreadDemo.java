package com.multithread.demo;

public class NameThreadDemo extends Thread{
	
	public void run() {
		System.out.println("Running...");
	}

	public static void main(String[] args) {
		
		NameThreadDemo t1 = new NameThreadDemo();
		NameThreadDemo t2 = new NameThreadDemo();
		
		System.out.println("Name of Thread One:"+ t1.getName());
		System.out.println("Name of Thread Two:"+ t2.getName());
		
		t1.start();
		t2.start();
		
		t1.setName("Dead Pool");
		t2.setName("Dead Pool2");
		
		System.out.println("After changing the name:"+ t1.getName());
		System.out.println("After changing the name:"+ t2.getName());
	}

}
