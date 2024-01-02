package com.test5;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

// Traverse a Linedlist in reverse direction using listIterator
public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ll= new LinkedList<>(Arrays.asList(1,2,3,4,5,6));
		
		ListIterator<Integer> itr= ll.listIterator(ll.size());
		while(itr.hasPrevious()) {
			System.out.print(itr.previous()+"\t");
		}
		
	}

}
