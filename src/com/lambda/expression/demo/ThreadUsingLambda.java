package com.lambda.expression.demo;



public class ThreadUsingLambda {

	public static void main(String[] args) {
		Thread t = new Thread(() -> {
			for (int i=1; i<=5; i++)
				System.out.println("Thread "+i*2);
			
		});
		t.start();
	}

}
