package com.collection.treeset;

import java.util.TreeSet;

public class FirstAndLastElement {

	public static void main(String[] args) {
		TreeSet<String> t=new TreeSet<>();
		t.add("Blue");
		t.add("Red");
		t.add("Purple");
		t.add("Brown");
		t.add("White");
		t.add("Yellow");
		System.out.println(t);
		
		System.out.println("The first element : "+t.first());
		System.out.println("The last element : "+t.last());

		//The greater and equal element .ceiling(obj)
		//The Less Or Equal Element element .floor(obj)
		System.out.println("The greater and equal element 'Purple' : "+t.ceiling("A"));
		System.out.println("Less adn equal element 'Purple' : "+t.floor("S"));
	}

}