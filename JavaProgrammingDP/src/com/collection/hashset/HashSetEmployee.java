package com.collection.hashset;

import java.util.HashSet;

public class HashSetEmployee {

	public static void main(String[] args) {
		
		HashSet<Employee> hs= new HashSet<>();
		hs.add(new Employee(101,"Yogesh",50000));
		hs.add(new Employee(102,"Sumit",45000));
		hs.add(new Employee(103,"Maruti",55000));
		hs.add(new Employee(104,"Ishwar",40000));
		hs.add(new Employee(101,"Yogesh",50000));
		
		for(Employee e: hs) {
			System.out.println(e);
			 
		}
		
		
		
		

	}

}
