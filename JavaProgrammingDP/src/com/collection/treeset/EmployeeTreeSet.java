package com.collection.treeset;

import java.util.TreeSet;

public class EmployeeTreeSet {

	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Ram");
		Employee e2 = new Employee(2, "Ravan");
		Employee e3 = new Employee(3, "Amit");
		Employee e4 = new Employee(4, "Pavan");
		Employee e5 = new Employee(5, "Satish");
		Employee e6 = new Employee(5, "Satish S");
		TreeSet<Employee>t=new TreeSet<>();
		
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		t.add(e6);
		for (Employee x : t)
			System.out.println(x);
		System.out.println("=================================");

		TreeSet<Employee> t1 = new TreeSet<>(new IdComparatorEmployee());
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		t1.add(e4);
		t1.add(e5);
		t1.add(e6);
		for (Employee x : t1)
			System.out.println(x);
		System.out.println("=================================");
		
		Employee e61 = new Employee(1, "Ram");
		t.add(e61);
		for (Employee x : t)
			System.out.println(x);

	}

}
