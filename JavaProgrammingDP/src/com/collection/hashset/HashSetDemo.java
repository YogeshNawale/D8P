package com.collection.hashset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
		HashSet<String> hs= new HashSet<>(s);
		System.out.println("Adding same list to HashSet");
		System.out.println(hs);
		
		hs.add("Yellow");
		System.out.println(hs.contains("Red"));
		
		System.out.println(hs.containsAll(s));
		System.out.println(hs.isEmpty());
		hs.remove("Black");
		System.out.println(hs);
		
		System.out.println(hs.size());
		
		Iterator<String> itr=hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
	//4.        WAP to empty a HashSet.
		System.out.println("WAP to empty a HashSet");
//		hs.clear();
//		System.out.println(hs);
		
	//11.        WAP to convert a HashSet to an array.
		
		Object arr[]= hs.toArray();
		System.out.println(Arrays.toString(arr));
		
		// another method
		
		String arr1[]= new String[hs.size()];
		hs.toArray(arr1);
		System.out.println(Arrays.toString(arr1));
	}

}
