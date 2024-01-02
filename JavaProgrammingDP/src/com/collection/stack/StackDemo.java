package com.collection.stack;

import java.util.Iterator;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> st=new Stack<>();
		st.push(12);
		st.push(10);
		st.push(1);
		st.push(4);
		st.push(6);
		st.push(8);
		//[8,6,4,1,10,12]
		System.out.println(st);
		System.out.println(st.peek());
		Iterator<Integer> itr=st.iterator();
		
		System.out.println("--------------------------------------------");
		System.out.println("Iterator ....");
		while(itr.hasNext())
			System.out.println(itr.next());
		
		// Searching an element 1-based index from top of stack
		System.out.println("Position "+ st.search(6));
		
		
		System.out.println("--------------------------------------------");	
		System.out.println("After removing");
		
		while(!st.empty())
		{
			System.out.println(st.pop());
		}
		
		
	}

}
