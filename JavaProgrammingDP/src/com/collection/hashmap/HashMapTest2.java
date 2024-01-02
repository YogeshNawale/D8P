package com.collection.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

//11.      WAP to create a map using Custom class as key and any other Custom class as value
public class HashMapTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Employee, Department> hm1= new HashMap<>();
		hm1.put(new Employee(1,"Yogesh",50000),	new Department(101,"Software Development","Pune"));
		hm1.put(new Employee(2,"Amit",30000),	new Department(102,"Hardware Development","Mumbai"));
		hm1.put(new Employee(3,"Abhishek",45000),	new Department(103,"Post Development ","Banglore"));
		hm1.put(new Employee(4,"Aman",55000),	new Department(103,"Post Development ","Banglore"));
		
		Set<Entry<Employee,Department>> s= hm1.entrySet();
		Iterator<Entry<Employee,Department>> itr= s.iterator();
		
		while(itr.hasNext()) {
			Entry<Employee,Department> e=itr.next();
			System.out.println(e.getKey()+ "---->" + e.getValue());
		}
	}

}
