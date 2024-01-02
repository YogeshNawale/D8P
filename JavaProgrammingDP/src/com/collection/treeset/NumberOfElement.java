package com.collection.treeset;

import java.util.TreeSet;



public class NumberOfElement {

	public static void main(String[] args) {
		TreeSet<String> t=new TreeSet<>();
		t.add("Blue");
		t.add("Red");
		t.add("Purple");
		t.add("Brown");
		t.add("White");
		t.add("Yellow");
		
		System.out.println("the number of element : "+t.size());
		
		//2 way
		int count=0;
		for(String x:t)
			count++;
		System.out.println("the number of element : "+count);

	}

}
