package com.collection.stack;

import java.util.Stack;

//2.  WAP to create a Stack with some colors (String) &amp; using generics
public class StackQ2 {
	
	public static void main(String[] args) {
		
		Stack<String> s= new Stack<>();
		s.push("Red");
		s.push("Yellow");
		s.push("Blue");
		s.push("Green");
		s.push("Black");
		
		System.out.println(s);
		
		System.out.println(s.search("Green"));
		
		
	}
}
