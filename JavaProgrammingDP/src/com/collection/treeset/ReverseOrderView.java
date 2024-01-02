package com.collection.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class ReverseOrderView {

	public static void main(String[] args) {
		TreeSet<String> t=new TreeSet<>();
		t.add("Blue");
		t.add("Red");
		t.add("Purple");
		t.add("Brown");
		t.add("White");
		t.add("Yellow");
		
		System.out.println(t);
		
		Iterator<String> i=t.descendingIterator();
		while(i.hasNext())
			System.out.println(i.next());
		
		System.out.println(t);

	}

}

