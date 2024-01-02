package com.collection.arraylist;

import java.util.ArrayList;

public class ArraylistDemo {

	public static void main(String[] args) {
		ArrayList<String> technology= new ArrayList<>();
		System.out.println(technology.size());
		
		technology.add("Java");
		technology.add("C#");
		technology.add("MobileDevelopment Flutter");
		technology.add("Java Framework");
		System.out.println(technology);
		
		System.out.println(technology.size());
		
		technology.add(1, "Asp DotNet MVC");
		System.out.println(technology);
		
		technology.remove(1);
		System.out.println(technology);
		
		boolean f=technology.remove("C#");
		System.out.println(f);
		System.out.println(technology);
		
		ArrayList<String> L1=new ArrayList<>();
		L1.add("maths");
		L1.add("chemistry");
		L1.add("Bio");
		
		technology.addAll(L1);
		System.out.println(technology);
		
		ArrayList<String>L2=new ArrayList<>();
		L2.add("English");
		L2.add("Hindi");
		technology.addAll(2,L2);
		System.out.println(technology);
	}

}
