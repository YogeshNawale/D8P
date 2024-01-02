package com.collection.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

//14.  WAP to create a Map which stores another Map as a value.
public class StoreMapInMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String,Integer> hm1= new HashMap<>();
		hm1.put("Yogesh", 101);
		hm1.put("Amit", 102);
		hm1.put("Suraj", 103);
		//System.out.println(hm1);
		
		HashMap<String,Integer> hm2= new HashMap<>();
		hm2.put("Ajay", 104);
		hm2.put("Sudarshan", 105);
		
		HashMap<Integer,HashMap<String,Integer>> hm3= new HashMap<>();
		hm3.put(1, hm1);
		hm3.put(2, hm2);
		
		
		//15. WAP to iterate the elements in the Map stored in the above Map
		Set<Entry<Integer,HashMap<String,Integer>>> s= hm3.entrySet();
		Iterator<Entry<Integer,HashMap<String,Integer>>> itr= s.iterator();
		
		while(itr.hasNext()) {
			Entry<Integer,HashMap<String,Integer>> e= itr.next();
			System.out.println(e.getKey()+ "---->"+ e.getValue());
		}
	}
	
	

}
