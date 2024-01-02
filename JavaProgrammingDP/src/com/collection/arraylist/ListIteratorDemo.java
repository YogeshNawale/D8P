package com.collection.arraylist;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		List<Integer> l1= Arrays.asList(1,2,3,4,5);
		
		ListIterator<Integer>itr=l1.listIterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
			
		}
		
		System.out.println();
		itr=l1.listIterator(l1.size());
		while(itr.hasPrevious())
		{
			System.out.print(itr.previous()+" ");
			
		}

	}

}
