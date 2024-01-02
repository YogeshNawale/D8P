package com.collection.linkedlist;

import java.util.Collections;
import java.util.LinkedList;

////15. WAP to shuffle all the elements from a linked list.
public class ShuffleLinkedList {

	public static void main(String[] args) {

		LinkedList<Integer> list = new LinkedList<>();
		list.add(21);
		list.add(342);
		list.add(33);
		list.add(64);
		list.add(62);
		System.out.println(list);
		
		Collections.shuffle(list);
		System.out.println(list);
		
		// Add list to Existing list
		LinkedList<Integer> list1 = new LinkedList<>();
		list1.add(55);
		list1.add(66);
		list1.add(77);
		System.out.println(list1);
		
		list.addAll(list1);
		System.out.println(list);
		
		// isEmpty()  method to check weather list is empty or not
		System.out.println(list.isEmpty());
		LinkedList<Integer> list2 = new LinkedList<>();
		System.out.println(list2.isEmpty());
		
		
		
		
	}

}
