package com.collectionframework.demos;

import java.util.*; 

public class Arraylist {
	
	public static void main(String[] args) {
		
	 ArrayList<String> fruitlist = new ArrayList<String>();
	 fruitlist.add("Apple");
	 fruitlist.add("Orrange");
	 fruitlist.add("Grapes ");
	 
	 //display Arraylist
	 System.out.println("First list: "+fruitlist);
	 
	 //Index order
	 System.out.println("Index Order");
	 System.out.println(fruitlist.get(0));
	 System.out.println(fruitlist.get(2));
	 
	 //change the value with help of set()
	 fruitlist.set(0, "Mango");
	 System.out.println("Converted list: "+fruitlist);
	 
	 //Remove function
	 fruitlist.remove(1);
	 System.out.println("After removing list : "+fruitlist);
	 
	 //size of the ArrayList
	 System.out.println("Size of list: "+fruitlist.size());
	 
	 
	 
		
	}

}
