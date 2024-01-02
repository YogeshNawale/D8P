package com.collection.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkListDemo2 {

	public static void main(String[] args) {

		//7.  WAP to check if a particular element exists in a linked list.
		
		LinkedList<String> strlist= new LinkedList<>();
		strlist.add("Yogesh");
		strlist.add("Amit");
		strlist.add("Suraj");
		strlist.add("Sumit");
		
		System.out.println(strlist.contains("Amit"));
		System.out.println(strlist.contains("Yash"));
		
		// 8.  WAP to convert a linked list to array list.
	
		ArrayList<String> arrlist= new ArrayList<>(strlist);
		System.out.println(arrlist);
	
	}

}
