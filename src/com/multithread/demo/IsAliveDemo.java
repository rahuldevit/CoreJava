package com.multithread.demo;

public class IsAliveDemo extends Thread{
	   public void run(){
	      System.out.println("sample ");
	      try{
	         Thread.sleep(25);
	      }
	      catch (InterruptedException ie){
	      }
	      System.out.println("only ");
	   }
	   public static void main(String[] args){
		  IsAliveDemo my_obj_1 = new IsAliveDemo();
		  IsAliveDemo my_obj_2 = new IsAliveDemo();
	      my_obj_1.start();
	      System.out.println("The first object has been created and started");
	      my_obj_2.start();
	      System.out.println("The second object has been created and started");
	      System.out.println(my_obj_1.isAlive());
	      System.out.println("The isAlive function on first object has been called");
	      System.out.println(my_obj_2.isAlive());
	      System.out.println("The isAlive function on second object has been called");
	   }
	}
