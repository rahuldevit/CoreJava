package com.collectionframework.demos;

import java.util.*;

public class VectorDemo {

	public static void main(String[] args) {
		Vector<String> v1 = new Vector<>();
		
		//use add() method to add the elements into the vector
		v1.add("My");
		v1.add("name");
		v1.add("is");
		v1.add("Rahul");
		
		//Displaying the vector
		System.out.println("Vector: "+v1);
		
		//Display vector default capacity
		System.out.println("Vector Default capacity is: "+v1.capacity());
		
		//Display the size of vector
		System.out.println("size of the vector: "+v1.size());
		
		//Adding new elements into the vector
		v1.addElement("I'm");
		v1.addElement("Java");
		v1.addElement("Developer");
		System.out.println("Vector: "+v1);
		
		//Display vector default capacity
		System.out.println("Vector Default capacity is: "+v1.capacity());

		
	}
	
}
