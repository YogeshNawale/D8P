package com.collection.linkedhashmap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class BookLinkedHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashMap<Book, Integer> lhm = new LinkedHashMap<>();

		lhm.put(new Book(101, "Java Programming", 750), 45);
		lhm.put(new Book(102, " Basic Java", 550), 75);
		lhm.put(new Book(103, "Advanced Java", 1100), 34);
		lhm.put(new Book(104, "C++Programming", 850), 54);

		// Set<Entry<Book, Integer>> s= lhm.entrySet();

		for (Entry<Book, Integer> e : lhm.entrySet()) {
			System.out.println(e);
		}

		// find book with maximmum number of copies (HardCore)

		Set<Entry<Book, Integer>> s = lhm.entrySet();
		Iterator<Entry<Book, Integer>> itr = s.iterator();
		int max = 0;
		int min = lhm.get(new Book(101, "Java Programming", 750));
		while (itr.hasNext()) {
			Entry<Book, Integer> e = itr.next();
			Integer a = e.getValue();

			if (a > max) {
				max = a;
			}

			if (a < min) {
				min = a;
			}
		}
		System.out.println("Maximum copies : " + max);
		System.out.println("Minumum copies : " + min);

		// find book with maximmum number of copies (Using ArrayList)
		ArrayList<Integer> arr = new ArrayList<>();

		for (Book e1 : lhm.keySet()) {
			Integer a = lhm.get(e1);
			arr.add(a);
		}

		Collections.sort(arr);
		System.out.println(arr);

		for (Entry<Book, Integer> e : lhm.entrySet()) {
			if (e.getValue() == arr.get(0))
				System.out.println("Minumum copies : " + arr.get(0) + "----> key : " + e.getKey());
			if (e.getValue() == arr.get(arr.size() - 1))
				System.out.println("Maximum copies : " + arr.get(arr.size() - 1) + "----> key : " + e.getKey());
		}

		// Another Method

		ArrayList<Integer> list = new ArrayList<>(lhm.values());
		Collections.sort(list);
		System.out.println(list.get(0));
		int minval = list.get(0);
		int maxval = list.get(list.size() - 1);

		for (Book b1 : lhm.keySet()) {
			if (lhm.get(b1) == minval) {
				System.out.println("Minimum value " + minval + " Of Book name " + b1.getBname());

			}
			if (lhm.get(b1) == maxval) {
				System.out.println("Maximum value " + maxval + " Of Book name " + b1.getBname());
			}

		}
	}
}