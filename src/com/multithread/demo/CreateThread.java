package com.multithread.demo;

public class CreateThread extends Thread{
	
	public void run() {
		System.out.println("I have created my thread");
	}

	public static void main(String[] args) {
		
		CreateThread obj = new CreateThread();
		obj.start();
	}

}
