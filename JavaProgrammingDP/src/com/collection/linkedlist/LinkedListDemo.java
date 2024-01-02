package com.collection.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		// 1. WAP to append the specified element to the end of a linked list.
		LinkedList<Integer> list = new LinkedList<>();
		list.add(21);
		list.add(342);
		list.add(21);
		System.out.println(list);

		list.addLast(65);
		System.out.println(list);

		// 2. WAP to iterate through all elements in a linked list.

		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + "\t");
		}
		System.out.println();
		System.out.println("******************************************");

		ListIterator<Integer> litr = list.listIterator();
		while (litr.hasNext()) {
			System.out.print(litr.next() + "\t");
		}

		// 3. WAP to iterate through all elements in a linked list starting at the
		// specified position.
		System.out.println();
		System.out.println("******************************************");

		litr = list.listIterator(2);
		while (litr.hasNext()) {
			System.out.print(litr.next() + "\t");
		}
		System.out.println();
		System.out.println("******************************************");
		for (int i = 2; i < list.size(); i++) {
			System.out.print(list.get(i) + "\t");
		}

		// 4. WAP to iterate a linked list in reverse order.
		System.out.println();
		System.out.println("******************************************");

		litr = list.listIterator(list.size());
		while (litr.hasPrevious()) {
			System.out.print(litr.previous() + "\t");
		}
		System.out.println();
		System.out.println("******************************************");

		// using descendingIterator -----Available only in LinkedList
		Iterator<Integer> itr1 = list.descendingIterator();
		while (itr1.hasNext())
			System.out.print(itr1.next() + "\t");

		// 5. WAP to insert the specified element at the specified position in the
		// linked list.
		System.out.println();
		System.out.println("******************************************");

		list.add(1, 55);
		litr = list.listIterator();
		while (litr.hasNext()) {
			System.out.print(litr.next() + "\t");
		}

		// 6. WAP to insert elements into the linked list at the first and last
		// position.
		System.out.println();
		System.out.println("******************************************");

		list.addFirst(11); // .addFirst
		list.addLast(88); // .addLast

		litr = list.listIterator();
		while (litr.hasNext()) {
			System.out.print(litr.next() + "\t");
		}

		// 7. WAP to insert the specified element at the front of a linked list.

		System.out.println();
		System.out.println("******************************************");

		list.add(0, 1);
		litr = list.listIterator();
		while (litr.hasNext()) {
			System.out.print(litr.next() + "\t");
		}

		// 8. WAP to insert the specified element at the end of a linked list.
		System.out.println();
		System.out.println("******************************************");

		list.add(list.size(), 99);
		litr = list.listIterator();
		while (litr.hasNext()) {
			System.out.print(litr.next() + "\t");
		}

		// 9. WAP to insert some elements at the specified position into a linked list.
		System.out.println();
		System.out.println("******************************************");

		list.add(3, 33);
		litr = list.listIterator();
		while (litr.hasNext()) {
			System.out.print(litr.next() + "\t");
		}

		// 10. WAP to get the first and last occurrence of the specified elements in a
		// linked list.
		System.out.println();
		System.out.println("******************************************");

		int a = list.indexOf(21); // .indexOf()
		System.out.println(a);
		int b = list.lastIndexOf(21); // .lastIndexOf()
		System.out.println(b);

		int count = 0;
		int firstOcc = 0;
		int lastOcc = 0;

		list.add(6, 21);
		System.out.print(list+"\t");
		System.out.println();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == 21) {
				count++;
				if (count == 1)
					firstOcc=i;
				else
					lastOcc=i;
			}
		}
		System.out.println("First Occurance is at index " + firstOcc);
		System.out.println("Last Occurance is at index " + lastOcc);
		
		//11.  WAP to display the elements and their positions in a linked list.
		System.out.println();
		System.out.println("******************************************");

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == 21) {
				System.out.println("Element at position "+ (i+1));
			}
		}
		
		//12.  WAP to remove a specified element from a linked list.
		System.out.println();
		System.out.println("******************************************");

		list.remove(3);
		litr = list.listIterator();
		while (litr.hasNext()) {
			System.out.print(litr.next() + "\t");
		}
		
		//13.  WAP to remove first and last element from a linked list.
		list.removeFirst();
		list.removeLast();
		
		System.out.println();
		System.out.println("******************************************");

		litr = list.listIterator();
		while (litr.hasNext()) {
			System.out.print(litr.next() + "\t");
		}
		
		//14.  WAP to remove all the elements from a linked list.
		System.out.println();
		//list.clear();
		//list.removeAll(list);
		System.out.print(list+"\t");
	}
	
	

}
