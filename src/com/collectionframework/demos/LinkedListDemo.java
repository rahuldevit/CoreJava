package com.collectionframework.demos;
import java.util.*;
public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> carlist = new LinkedList<String>();
		carlist.add("NanoCar");
		carlist.add("Tata");
		carlist.add("Santro");
		
		//Display the list
		System.out.println(carlist);
		
		//add in first order
		carlist.addFirst("BMW");
		System.out.println("Add in car in first: "+carlist);
		
		//add in last order
		carlist.addLast("Aodi");
		System.out.println("Add in car in last: "+carlist);
		
		//add in index position
		carlist.add(2, "Toyota");
		System.out.println("Add new element in the 3rd position: "+carlist);
		
		//remove the any functions
		carlist.remove("NanoCar");
		System.out.println("Remove NanoCar: "+carlist);
	}

}
