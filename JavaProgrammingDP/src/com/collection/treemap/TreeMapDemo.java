package com.collection.treemap;

import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {

		TreeMap<Integer, String> map = new TreeMap<>();

		map.put(32, "Yogesh");
		map.put(43, "Ishwar");
		map.put(84, "Adarsh");
		map.put(37, "Suraj");
		map.put(45, "Abhishek");
		map.put(67, "Prasad");
		
		System.out.println(map); // default sorted by ascending order
		
		NavigableSet< Integer> nmap=map.descendingKeySet(); // Returns a reverse order NavigableSet
		
		for(int i: nmap) {
			System.out.println(i + " : "+ map.get(i));
		}
		
		NavigableMap <Integer, String> nmap1=map.descendingMap();
		System.out.println(nmap1);
		

		TreeMap<Book, Integer> bmap= new TreeMap<>();
		bmap.put(new Book(101,"Java",842), 352);
		bmap.put(new Book(104,"Core Java",435), 1050);
		bmap.put(new Book(102,"SpringBoot",590), 324);
		bmap.put(new Book(106,"Angular",450), 542);
		bmap.put(new Book(103,"Hiberneat",750), 235);
		
		for(Entry<Book,Integer> e : bmap.entrySet()) {
			System.out.println(e.getKey()+ "-----------> " +e.getValue());
			
		}
		System.out.println("***********************************************************");
		for(Entry<Book,Integer> e : bmap.entrySet()) {
			if(e.getValue().equals(1050))
			System.out.println(e.getKey()+ "-----------> " +e.getValue());
			
		}
		
		
	}

}
