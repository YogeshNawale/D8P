package com.collection.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
////10. WAP to create a map using Custom class as key and any other JDK provided object as value
public class HashMapTest {

	public static void main(String[] args) {

		int arr1[]= {34,54,67,54,34};
		int arr2[]= {77,54,67,54,88};
		int arr3[]= {86,64,77,55,78};
		int arr4[]= {67,78,77,55,67};
		int arr5[]= {86,56,45,55,78};
		
		Student s1=new Student(1,"Yogesh",arr1) ;
		Student s2=new Student(2,"Amit",arr2) ;
		Student s3=new Student(3,"Suraj",arr3) ;
		Student s4=new Student(4,"Adarsh",arr4) ;
		Student s5=new Student(5,"Ajay",arr5) ;
		Student s6=new Student(5,"Ajay",arr5) ;
		
		HashMap<Student, String> hm1= new HashMap<>();
		hm1.put(s1, "IT");
		hm1.put(s2, "Mech");
		hm1.put(s3, "CS");
		hm1.put(s4, "ETC");
		hm1.put(s5, "IT");
		hm1.put(s6, "CS");
		
		
		//System.out.println(hm1);
		Set<Entry<Student, String> > s= hm1.entrySet();
		Iterator<Entry<Student, String>> itr = s.iterator();
		while(itr.hasNext()) {
			Entry<Student, String> e = itr.next();
			System.out.println(e.getKey() +"--->"+e.getValue());
		}
		
	}

}
