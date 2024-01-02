package com.collection.treeset;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {

		TreeSet<Integer> ts= new TreeSet<>();
		ts.add(36);
		ts.add(32);
		ts.add(23);
		ts.add(34);
		ts.add(65);
		ts.add(46);
		ts.add(87);
		
		System.out.println(ts);
		
		TreeSet<Integer> t1=new TreeSet<>();
		t1.add(6);
		t1.add(7);
		t1.add(8);
		t1.add(9);
		t1.add(10);
		t1.add(2);
		//t1.add(null);
		t1.addAll(ts);
		System.out.println(t1);
		
		
		for(Integer x:t1)
			System.out.print(x+"\t");
		
		// to remove an element
		System.out.println();
		System.out.println(t1.remove(10));
		System.out.println(t1);
		
		
		

	}

}
