package com.collectionframework.demos;

import java.util.*;

public class QueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> q = new PriorityQueue<String>();
		q.add("Rahul");
		System.out.println(q);
		
		
		
		PriorityQueue<String> pq = new PriorityQueue<>();
		
		pq.add("Collection");
		pq.add("topic");
		pq.add("of");
		pq.add("Queue");
		
		System.out.println("Queue: "+pq);
		System.out.println(pq);
		
		//display the size of queue
		System.out.println("Size of queue: "+pq.size());
		
	}

}
