package com.collectionframework.demos;

import java.util.*;

public class Map_Demo {

	public static void main(String[] args) {
		
		//Creating the map and adding the values
		Map<String, Integer> m1 = new HashMap<String, Integer>();
		m1.put("Rahul", 25);
		m1.put("Raj", 22);
		m1.put("Kumar", 26);
		m1.put("Rohit", 35);
		m1.put("Rahul", 25);
		System.out.println("This is HashMap: "+m1);
		
		//creating linkedhashmap map and adding the values
		Map<String, Integer> m2 = new LinkedHashMap<String, Integer>();
		m2.put("Rahul", 25);
		m2.put("Raj", 22);
		m2.put("Kumar", 26);
		m2.put("Rohit", 35);
		m2.put("Raj", 22);
		System.out.println("This is LinkedHashMap: "+m2);
		
		
		Map<String, Integer> m3 = new TreeMap<String, Integer>();
		m3.put("Rahul", 25);
		m3.put("Raj", 22);
		m3.put("Kumar", 26);
		m3.put("Rohit", 35);
		m3.put("Kumar", 26);
		System.out.println("This is TreeMap: "+m3);
		
		for(Map.Entry map:m1.entrySet()) {
			System.out.println(map.getValue());
		}
	}

}
