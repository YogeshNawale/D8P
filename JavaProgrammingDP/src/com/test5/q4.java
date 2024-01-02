package com.test5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// sort arraylist of string in reverse order of its natural sorting,
public class q4 implements Comparable<String>{

	@Override
	public int compareTo( String s) {
		
		return ((this).compareTo(s));
	
	}
	
	public static void main(String[] args) {

		ArrayList<String> al= new ArrayList<>();
		al.add("Suraj");
		al.add("Yogesh");
		al.add("Adarsh");
		al.add("Abhishek");
		al.add("Ishwar");
		
		System.out.println(al);
		
		Collections.sort(al);
		System.out.println(al);
		Collections.sort(al,Collections.reverseOrder());
		System.out.println(al);
		
		
	}

	

}
