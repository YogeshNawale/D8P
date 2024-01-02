package com.collection.linkedlist;

import java.util.LinkedList;

public class CloneLinkedList  implements Cloneable{

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return   super.clone();
	}

	public static void main(String[] args) {

		LinkedList<String> strlist= new LinkedList<>();
		strlist.add("Yogesh");
		strlist.add("Amit");
		strlist.add("Suraj");
		strlist.add("Sumit");
		
		LinkedList<String> strlist1=  (LinkedList<String>) strlist.clone();
		System.out.println(strlist1);
		
		//4.  WAP to remove and return the first element of a linked list.
				// .poll()
		
		System.out.println(strlist.poll());
		System.out.println(strlist);
		
		// 5.  WAP to retrieve but does not remove, the first element of a linked list.
			// .element() 	.peek() 	.peekFirst		.getFirst()	 
		System.out.println(strlist.element());
		System.out.println(strlist);
		System.out.println(strlist.peek());
		System.out.println(strlist.getFirst());
		
		// 6.  WAP to retrieve but does not remove, the last element of a linked list.
			// .peekLast()	.getLast
		
		System.out.println(strlist.getLast());
		System.out.println(strlist.peekLast());
		
		
	
	
	}

}
