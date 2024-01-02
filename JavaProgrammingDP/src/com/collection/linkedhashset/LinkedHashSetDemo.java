package com.collection.linkedhashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		ArrayList<String> s= new ArrayList<>();
		s.add("Blue");
		s.add("Red");
		s.add("Blue");
		s.add("White");
		s.add("White");
		s.add("Black");
		s.add("Purple");
		System.out.println("Display ArrayList");
		System.out.println(s);
		
		LinkedHashSet<String> lhs= new LinkedHashSet<>(s);
		System.out.println("Adding same list to LinkedHashSet");
		System.out.println(lhs);
		
		lhs.add("Yellow");
		System.out.println(lhs.contains("Red"));
		
		System.out.println(lhs.containsAll(s));
		System.out.println(lhs.isEmpty());
		lhs.remove("Black");
		System.out.println(lhs);
		
		System.out.println(lhs.size());
		
		Iterator<String> itr=lhs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}

	}

}
