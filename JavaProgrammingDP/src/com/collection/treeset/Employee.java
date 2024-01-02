package com.collection.treeset;

import java.util.Comparator;

public class Employee  implements Comparable<Employee>
{
	int eid;
	String ename;

	Employee(int id, String name) {
		eid = id;
		ename = name;
	}

	public String toString() {
		return "Employee[id:" + eid + " name:" + ename + "]";
	}

	public int compareTo(Employee o) {
		System.out.println("I am in compare");
		if (this.eid > o.eid)
			return 1;
		else if (this.eid < o.eid)
			return -1;
		else
			return 0;

	}

}

class IdComparatorEmployee implements Comparator<Employee> {
	public int compare(Employee o1, Employee o2) {
		// print descending order
		if (o1.eid > o2.eid)
			return -1;
		else if (o1.eid < o2.eid)
			return 1;
		else
			return 0;
	}
}