package com.collection.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;
// 12. WAP to create a map which stores an arraylist as a value
public class HashMapArrayListAsValue {

	public static void main(String[] args) {

		ArrayList<Integer> arrlist1=new ArrayList<>();
		arrlist1.add(22);
		arrlist1.add(33);
		arrlist1.add(44);
		ArrayList<Integer> arrlist2=new ArrayList<>();
		arrlist2.add(55);
		arrlist2.add(66);
		arrlist2.add(77);
		ArrayList<Integer> arrlist3=new ArrayList<>();
		arrlist3.add(88);
		arrlist3.add(99);
		arrlist3.add(111);
		
		HashMap<String, ArrayList<Integer>> hm1= new HashMap<>();
		hm1.put("List1", arrlist1);
		hm1.put("List2", arrlist2);
		hm1.put("List3", arrlist3);
		
		//13. WAP to iterate the elements in the arraylist stored in the above Map.
		Set<Entry<String, ArrayList<Integer>>> s= hm1.entrySet();
		Iterator<Entry<String, ArrayList<Integer>>> itr= s.iterator();
		
		while(itr.hasNext()) {
			Entry<String, ArrayList<Integer>> e=itr.next();
			System.out.println(e.getKey()+ "---->" + e.getValue());
		}
		
	}

}
