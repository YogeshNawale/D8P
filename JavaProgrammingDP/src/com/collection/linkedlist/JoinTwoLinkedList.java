package com.collection.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
//2.  WAP to join two linked lists.
public class JoinTwoLinkedList {

	public static void main(String[] args) {

		LinkedList<Integer> list1= new LinkedList<>();
		list1.add(11);
		list1.add(22);
		list1.add(33);
	
		
		LinkedList<Integer> list2= new LinkedList<>();
		list2.add(44);
		list2.add(55);
		list2.add(66);
		
		list1.addAll(list2);
		System.out.println(list1);
		
		
		
		
		
		
		
	}

}
