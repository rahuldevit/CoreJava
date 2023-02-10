package com.collectionframework.demos;

import java.util.*;

public class Set_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating and adding the elements
		Set<String> s1 = new HashSet<String>();
		
		s1.add("This");
		s1.add("is");
		s1.add("Set");
		s1.add("topic");
		s1.add("test");
		
		//displaying set
		System.out.println(s1);
		
		//remove the set
		s1.remove("test");
		//System.out.println(s1.remove("test"));
		System.out.println("After Remove set: "+s1);
		
		
		//creating another object and adding integer values
		
		Set<Integer> s2 = new HashSet<>();
		Set<Integer> s3 = new TreeSet<>();
		
		s2.add(1);
		s2.add(2);
		s2.add(3);
		s2.add(3);
		
		System.out.println("Hash Set: "+s2);
		
		s3.add(4);
		s3.add(4);
		s3.add(2);
		s3.add(1);
		
		System.out.println("Tree Set: "+s3);
		
	}

}
