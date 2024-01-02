package com.collection.stack;

import java.util.Stack;

//3.  WAP to create a Stack with user defined class objects &amp; using generics
//4.  Use  different method calls to add elements to a Stack.
//5.  WAP to check if a Stack has values
public class StackQ3UserDefinedObject {

	
	public static void main(String[] args) {

		Stack<Employee> s= new Stack<>();
		s.push(new Employee(3,"Yogesh",50000));
		s.push(new Employee(2,"Suraj",45000));
		s.push(new Employee(1,"Prasad",55000));
		s.push(new Employee(3,"Yogesh",50000));
		
		System.out.println(s);
		System.out.println("------------------------------------");
		s.add(new Employee(4,"Ganesh",66000));
		System.out.println(s);
		System.out.println("------------------------------------");
		
		s.add(2, new Employee(5,"Sumit",76000));
		System.out.println(s);
		System.out.println("------------------------------------");
		
		Stack<Employee> s1= new Stack<>();
		s1.push(new Employee(6,"Akash",56000));
		s1.push(new Employee(7,"Rohan",96000));
		s.addAll(s1);
		System.out.println(s);
		System.out.println("------------------------------------");
		
		s.addAll(1, s1);
		System.out.println(s);
		System.out.println("------------------------------------");
		
		System.out.println(s.capacity());
		
		System.out.println(s.containsAll(s1));

		System.out.println(s.elementAt(0));
		System.out.println(s.elementAt(3));
		
		System.out.println(s.get(1));

		
	}

}
