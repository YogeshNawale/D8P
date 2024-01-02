package com.collection.hashmap;

import java.util.HashMap;

public class MapCreationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Different constructors in HashMap
				HashMap<Integer, String> hm = new HashMap<>(); // default arg
				HashMap<Integer, String> hm1 = new HashMap<>(20); //Map with intial capacity
				HashMap<Integer, String> hm2 = new HashMap<>(hm1); //creating map using another Map
				HashMap<Integer, String> hm3 = new HashMap<>(15, 0.5f);// creating map using initial
																		// capacity and load factor
				
				
				HashMap<Integer, String> hMap = new HashMap<>();
				hMap.put(1, "10th");
				hMap.put(2, "12th");
				System.out.println(hMap.put(1, "B.E."));
				System.out.println("calling get");
				System.out.println(hMap.get(1));
				System.out.println(hMap.put(3, "Diploma"));
				System.out.println(hMap);
				
				

	}

}