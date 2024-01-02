package com.collection.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ListSortingDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrInt=new ArrayList<>(Arrays.asList(12,312,43,32,23,12,7)) ;
		
		System.out.println("Before Sorting");
		System.out.println(arrInt);
		
		Collections.sort(arrInt);
		System.out.println("After Sorting");
		System.out.println(arrInt);
		
		Collections.reverse(arrInt);
		System.out.println(arrInt);
		
		
		ArrayList<String> arrStr=new ArrayList<>(Arrays.asList("Ajay","Vijay","Yogesh","Jay"));
		System.out.println("Before Sorting");
		System.out.println(arrStr);
		
		Collections.sort(arrStr);
		System.out.println("After Sorting");
		System.out.println(arrStr);
	}

}
