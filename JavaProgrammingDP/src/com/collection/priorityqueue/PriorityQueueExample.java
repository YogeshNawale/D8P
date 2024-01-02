package com.collection.priorityqueue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> pq = new PriorityQueue<>(3);
		// Queue<Integer> pq = new LinkedList();

		pq.offer(23);
		pq.offer(23);
		pq.offer(199);
		pq.offer(45);
		pq.offer(-32);

		System.out.println(pq);

		System.out.println("poll() removed head of queue : " + pq.poll());
		System.out.println(pq);

		System.out.println("remove() removed head of queue : " + pq.remove());
		System.out.println(pq);

		Iterator<Integer> i = pq.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());

		}
		System.out.println("______________________________");
		Integer v;
		while ((v = pq.poll()) != null) {
			System.out.println(v);
		}
		// pq.remove();	java.util.NoSuchElementException 
		System.out.println(pq.poll());

		System.out.println(pq.offer(12));
		Student o1 = new Student(100, "Pankaj");
		Student o2 = new Student(10, "Ramesh");
		Student o3 = new Student(70, "Seeta");
		Student o4 = new Student(7, "Vinod");

		System.out.println("____________________________________");
		PriorityQueue<Student> pqs = new PriorityQueue<>(4);
		pqs.add(o1);
		pqs.add(o2);
		pqs.add(o3);
		pqs.add(o4);
		// duplicate element adding
		pqs.offer(o3);

		System.out.println(pqs);
		//System.out.println(pqs.poll());

		// System.out.println(pqs);
		while (pqs.poll() != null) {
			System.out.println(pqs.poll());
		}

	}

}
