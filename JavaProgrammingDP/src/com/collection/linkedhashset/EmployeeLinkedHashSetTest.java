package com.collection.linkedhashset;

import java.util.LinkedHashSet;



public class EmployeeLinkedHashSetTest {

	public static void main(String[] args) {
		LinkedHashSet< Employee> lhs= new LinkedHashSet<>();
		lhs.add(new Employee(101,"Yogesh",50000));
		lhs.add(new Employee(102,"Sumit",45000));
		lhs.add(new Employee(103,"Maruti",55000));
		lhs.add(new Employee(104,"Ishwar",40000));
		lhs.add(new Employee(101,"Yogesh",50000));
		lhs.add(new Employee(104,"Ishwar",40000));
		
		for(Employee e: lhs)
			System.out.println(e);
		
		

	}

}
