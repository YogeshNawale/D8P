package com.collection.linkedlist;

import java.util.Collections;
import java.util.LinkedList;

public class CompareTwoList  {

	public static void main(String[] args) {

		//9.  WAP to compare two linked lists.
		LinkedList<String> strlist= new LinkedList<>();
		strlist.add("Yogesh");
		strlist.add("Amit");
		strlist.add("Suraj");
		strlist.add("Sumit");
		
		LinkedList<String> strlist1= new LinkedList<>();
		strlist1.add("Yogesh");
		strlist1.add("Amit");
		strlist1.add("Suraj");
		//strlist1.add("Sumit");
		
		System.out.println(strlist.equals(strlist1));
		
		System.out.println(strlist.containsAll(strlist1));
		
		//10.  WAP to test a linked list is empty or not.
		System.out.println(strlist.isEmpty());
		
		//11.  WAP to replace an element in a linked list.
		
		strlist.set(1, "Ajay");
		System.out.println(strlist);
	
	}

	

	
}
