package com.collection.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayList2 {

	public static void main(String[] args) {

		ArrayList<Integer> L1= new ArrayList<>();
		L1.add(1);
		L1.add(11);
		L1.add(2);
		L1.add(22);
		L1.add(3);
		L1.add(33);
		
		
		// Using for loop
		for(int i=0; i<L1.size(); i++) {
			System.out.print(L1.get(i)+"\t");
		}
		
		System.out.println();
		
		// using Enhanced for loop
		for(int i:L1)
			System.out.print(i+"\t");
		
		System.out.println();
		
		// using Iterator
		Iterator <Integer> itr= L1.iterator();
		while( itr.hasNext()) {
			System.out.print(itr.next()+"\t");
		}
		
		System.out.println();
		
		Object [] arr=   L1.toArray();
		System.out.println(Arrays.toString(arr));
		
		Integer arr1[]=L1.toArray(new Integer[L1.size()]);
		System.out.println(Arrays.toString(arr1));
		
		 ArrayList<Integer> l2= new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
		  
		 System.out.println(l2);
		 
		 ArrayList<Integer> l3= new ArrayList<>();
		 System.out.println(l3.size());
		 l3.add(32);
		 System.out.println(l3.size());
		 
	}

	
}
