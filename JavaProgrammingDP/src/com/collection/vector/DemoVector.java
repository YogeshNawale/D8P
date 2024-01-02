package com.collection.vector;
/*
 * vector is a legacy class
 * its underlying data structure is growable array
 * default capacity 10
 * increase it size by double the capacity
 * vector is thread safe, unlike arraylist (only one thread can access data)
 * all methods in vector are synchronized, it gives thread safety (we need lock key to go inside that method)
 * 
 * 3 type of cursor:
 * 		 1. Iterator-Universal Cursor(iterator method is in collection interface and hence this cursor can be used in all collections)
 * 		 2. ListIterator-only used in list specific classes
 * 		 3. Enumeration-it is available in only legacy classes vectorclasssname.elements() it gives enumeration cursor(Fail-safe)
 */
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

public class DemoVector
{
	public static void main(String[] args)
	{
		ArrayList<String> al = new ArrayList<>();
		al.add("Komal");
		al.add("Madhu");
		al.add("Anil");
		al.add("Sanju");
		al.add("Vaishu");
		//al.ensureCapacity(0);
		
		
		ArrayList<Trainer> tList = new ArrayList<>();
		tList.add(new Trainer("Medha", 10, "BE"));
		tList.add(new Trainer("Kirt", 18, "MCA"));
		tList.add(new Trainer("Jayshree", 5, "BCA"));
		/*Ways to construct vector
		 * 1. default constructor
		 * 2. constructor taking Collection extending String type parameter
		 * 3. constructor taking Collection of custom type parameter
		 */
		
		Vector<String> v = new Vector<>(al);
		Vector<Trainer> v1 = new Vector<>(tList);
		
		for(String t: v)
			System.out.print(t+"\t");
		
		System.out.println();
		for(Trainer t: tList)
			System.out.println(t);
		
		Vector<String> v3 = new Vector<>(20);
		//Vector<String> v4 = new Vector<>(20);// we can set initial capacity to vector
		System.out.println("Capacity: " + v3.capacity());
		v3.add("A");
		v3.add("Z");
		v3.add("Y");
		v3.add("C");
		System.out.println("Size: "+v3.size());
		System.out.println(v3);
		
		//Enumeration<String> eCursor = v.elements();
	
		Enumeration<String> eCursor= v.elements();
		
		while(eCursor.hasMoreElements())
			System.out.println(eCursor.nextElement());
		
		System.out.println(v.addAll(al)); //return boolean
		System.out.print(v+" ");
		
		v.addAll(1, al);
		System.out.println(v);
		
		 v.add(2, "W");
		System.out.println(v);
		
		System.out.println(v.firstElement());//returns object at index 0
		System.out.println(v.lastElement());//returns object at index v.size()-1
		//setElementAt, removeElementAt
		
		
		
		
		
		
	}
}