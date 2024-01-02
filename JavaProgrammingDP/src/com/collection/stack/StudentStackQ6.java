package com.collection.stack;

import java.util.Collections;
import java.util.Stack;

//6.  WAP to create a Stack using generics and add user defined class objects 
//    which implements comparable interface. Observe order when removing from Stack.

public class StudentStackQ6 {
	
	public static void main(String[] args) {
	
		Stack<Student> s= new Stack<>();
		s.push(new Student(101,"Yogesh"));
		s.push(new Student(105,"Amit"));
		s.push(new Student(103,"Suraj"));
		s.push(new Student(104,"Prasad"));
		
		System.out.println("Before Sorting");
		System.out.println(s);
		System.out.println(s.pop());
		
		System.out.println("After Sorting");
		Collections.sort(s);
		System.out.println(s);
		
		System.out.println(s.pop());
	}
}
