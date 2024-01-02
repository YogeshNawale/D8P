package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String> empName = new HashMap<>();
		empName.put("Sam Hanks", "New york");
		empName.put("Will Smith", "LA");
		empName.put("Scarlett", "Chicago");
		
		Iterator<String> iterator = empName.keySet().iterator();
		while (iterator.hasNext()) {
			System.out.println(empName.get(iterator.next()));
			// adding an element to Map
			// exception will be thrown on next call
			// of next() method.
			// empName.put("Istanbul", "Turkey");
		}

		/// Initializing a ConcurrentHashMap
		
		ConcurrentHashMap<String, Integer> m = new ConcurrentHashMap<String, Integer>();
		m.put("ONE", 1); // Adding values
		m.put("SEVEN", 7);
		m.put("FIVE", 5);
		m.put("EIGHT", 8);
		// Getting an iterator using map
		
		Iterator<String> it = m.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
			System.out.println(key + " : " + m.get(key));
			// This will reflect in iterator.
			// This means it has not created separate copy of objects
			m.put("NINE", 9);
		}
		System.out.println("___________________________");
		System.out.println(m);

		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

		Iterator<Integer> itr1 = arr.iterator();
		while (itr1.hasNext()) {
			// System.out.println(itr1.next());
			// arr.add(15);
			if (itr1.next() % 2 == 0)
				itr1.remove();
		}
		System.out.println(arr);

		CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<Integer>(new Integer[] { 1, 7, 9, 11 });
		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) {
			Integer i = (Integer) itr.next();
			System.out.println(i);
			if (i == 7)
				list.add(15); // It will not be printed
			// This means it has created a separate copy of the collection
		}
		System.out.println(list);

	}
}
