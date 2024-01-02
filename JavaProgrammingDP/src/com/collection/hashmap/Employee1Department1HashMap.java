package com.collection.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
/*WAP to create a Map which contain Department object as a key and ArrayList of Employees
 *  who are belonging to that department.
		Department class
   			deptid,deptname,location
		Employee class
   			empid ,ename ,salary ,deptid
 */

public class Employee1Department1HashMap {

	public static double findMaxSalary(ArrayList<Employee1> l) {

		double maxSalary = l.get(0).salary;

		for (int i = 0; i < l.size(); i++) {
			if (l.get(i).salary > maxSalary) {
				maxSalary = l.get(i).salary;

			}
		}
		return maxSalary;
	}

	public static int findMaxNoOfEmployees(ArrayList<Employee1> l) {

		int count = 0;

		for (int i = 0; i < l.size(); i++) {
			count++;
		}
		return count;
	}

	public static void main(String[] args) {

		Map<Department1, ArrayList<Employee1>> hm1 = new HashMap<>();

		Department1 d1 = new Department1(101, "IT", "Pune");
		Department1 d2 = new Department1(102, "Finance", "Banglore");
		Department1 d3 = new Department1(103, "HR", "Mumbai");
		Department1 d4 = new Department1(104, "Testing", "Delhi");
		Department1 d5 = new Department1(105, "Marketing", "Nasik");

		ArrayList<Employee1> e1 = new ArrayList<>();
		e1.add(new Employee1(800, "Yogesh", 50000, 101));
		e1.add(new Employee1(801, "Aimt", 60000, 101));
		e1.add(new Employee1(802, "Adarsh", 55000, 101));
		e1.add(new Employee1(803, "Pritam", 60000, 101));
		e1.add(new Employee1(804, "Suraj", 50500, 101));

		ArrayList<Employee1> e2 = new ArrayList<>();
		e2.add(new Employee1(805, "Abhishek", 40000, 102));
		e2.add(new Employee1(806, "Maruti", 45000, 102));
		e2.add(new Employee1(807, "Sudarshan", 40500, 102));

		ArrayList<Employee1> e3 = new ArrayList<>();
		e3.add(new Employee1(808, "Utkarsha", 60000, 103));
		e3.add(new Employee1(809, "Bhakti", 62000, 103));
		e3.add(new Employee1(810, "Sumit", 55000, 103));

		ArrayList<Employee1> e4 = new ArrayList<>();
		e4.add(new Employee1(811, "Ashish", 76000, 104));
		e4.add(new Employee1(812, "Amol", 72000, 104));
		e4.add(new Employee1(816, "Santosh", 74500, 104));
		e4.add(new Employee1(817, "Jay", 72670, 104));

		ArrayList<Employee1> e5 = new ArrayList<>();
		e5.add(new Employee1(813, "Snehal", 54440, 105));
		e5.add(new Employee1(814, "Atul", 55000, 105));
		e5.add(new Employee1(815, "Sunish", 54000, 105));

		hm1.put(d1, e1);
		hm1.put(d2, e2);
		hm1.put(d3, e3);
		hm1.put(d4, e4);
		hm1.put(d5, e5);

		// 1. Display all department wise Employees

		Set<Entry<Department1, ArrayList<Employee1>>> s = hm1.entrySet();
		Iterator<Entry<Department1, ArrayList<Employee1>>> itr = s.iterator();
		while (itr.hasNext()) {
			Entry<Department1, ArrayList<Employee1>> e = itr.next();
			Department1 obj = e.getKey();
			System.out.println("Department ID : " + obj.deptId + "\t Department Name : " + obj.deptName);
			ArrayList<Employee1> eal = e.getValue();
			Iterator<Employee1> itre = eal.iterator();
			while (itre.hasNext()) {
				System.out.println("\t" + itre.next());
			}

		}

		System.out
				.println("*******************************************************************************************");

		// 2.find maximum salary along with employee details in all departments

		for (Entry<Department1, ArrayList<Employee1>> en1 : s) {
			System.out.println("Department : " + en1.getKey().getDeptName());
			System.out.println("\tFollowing is list of who earns maximum salary");
			Iterator<Employee1> eltr = en1.getValue().iterator();
			while (eltr.hasNext()) {
				Employee1 e11 = eltr.next();
				if (e11.getSalary() == findMaxSalary(en1.getValue())) {
					System.out.println("\t" + e11);
				}
			}

		}

		System.out.println("---------------------------------------------------------------------------");
		System.out.println("-----------------------Another Method--------------------------------------");
		System.out.println();

		itr = s.iterator();
		while (itr.hasNext()) {
			Entry<Department1, ArrayList<Employee1>> e = itr.next();
			Department1 obj = e.getKey();
			System.out.println("Department ID : " + obj.deptId + "\t Department Name : " + obj.deptName);
			ArrayList<Employee1> eal = e.getValue();
			Iterator<Employee1> itre = eal.iterator();
			double max = 0;
			Employee1 etemp = null;
			while (itre.hasNext()) {
				Employee1 obj1 = itre.next();
				if (obj1.getSalary() > max) {
					max = obj1.getSalary();
					etemp = obj1;
				}
			}

			itre = eal.iterator();
			while (itre.hasNext()) {
				Employee1 obj1 = itre.next();
				if (obj1.salary == max)
					System.out.println("\tMaximum Salary : " + max + "\t " + obj1);
			}

		}

		// 3. Display all employees from IT dept who is having salary less than 60000
		System.out.println("*********************************************************************************");
		System.out.println("Employees from IT dept who is having salary less than 60000");

		for (Entry<Department1, ArrayList<Employee1>> en1 : s) {

			Iterator<Employee1> eltr = en1.getValue().iterator();
			while (eltr.hasNext()) {
				Employee1 e11 = eltr.next();
				if (en1.getKey().deptName == "IT") {
					if (e11.salary < 60000)
						System.out.println("\t" + e11);
				}
			}

		}

		// 3. Display all employees from each dept who is having salary less than 60000
		System.out.println("*********************************************************************************");
		System.out.println("Employees from Each dept who is having salary less than 60000");

		itr = s.iterator();
		while (itr.hasNext()) {
			Entry<Department1, ArrayList<Employee1>> e = itr.next();

			Department1 obj = e.getKey();
			System.out.println("Department ID : " + obj.deptId + "\t Department Name : " + obj.deptName);

			ArrayList<Employee1> al = e.getValue();
			Iterator<Employee1> etemp = al.iterator();
			int flag=0;
			while (etemp.hasNext()) {
				Employee1 em1 = etemp.next();
				if (em1.getSalary() < 60000) {
					System.out.println("\t" + em1);
					flag=1;
				}
				else
					flag=0;
			}
			if(flag==0)
			System.out.println("\tNo Employee Salary less than 60000");
		}

		// 4> Add the new employee in Testing department
		System.out.println("*************************************************************");
		System.out.println("Add the new employee in Testing department");

//		e4.add(new Employee1(821, "Ankit", 54330, 104));
//
//		hm1.put(d4, e4);
//		itr = s.iterator();

		
		for (Entry<Department1, ArrayList<Employee1>> en1 : s) {

			 Department1 d = en1.getKey();
			if(d.getDeptName().equals("Testing")) {
				ArrayList<Employee1> elist= en1.getValue();
				elist.add(new Employee1(821, "Ankit", 54330, 104));
				hm1.put(d, elist);
			}
		}
		
		for(Entry<Department1, ArrayList<Employee1>> ent  : hm1.entrySet() ) {
			System.out.println(ent.getKey());
			ArrayList<Employee1> al=ent.getValue();
			for(Employee1 e : al)
			System.out.println("\t"+ e);
		}

		System.out.println("get() method");
		System.out.println(hm1.get(new Department1(101, "IT", "Pune")));
		// 5>Give department details in which maximum number of Employees working.
		System.out.println("*************************************************************");

		int maxcount = 0;
		int count = 0;

		for (Entry<Department1, ArrayList<Employee1>> en1 : s) {

			Iterator<Employee1> eltr = en1.getValue().iterator();

			while (eltr.hasNext()) {
				eltr.next();
				count = findMaxNoOfEmployees(en1.getValue());

			}
			if (count > maxcount) {
				maxcount = count;
			}
		}

		for (Entry<Department1, ArrayList<Employee1>> en1 : s) {

			if (maxcount == findMaxNoOfEmployees(en1.getValue()))
				System.out.println("maxcount " + maxcount + " of " + en1.getKey());
			

		}
		
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("-----------------------Another Method--------------------------------------");
		System.out.println();

		Department1 d= null;
		int count1=0, maxcount1=0;
		
		for (Entry<Department1, ArrayList<Employee1>> en1 : s) {
			ArrayList<Employee1> al= en1.getValue();
			if(al.size()>count1) {
				count1=al.size();
			}
		}
		
		if(count1>maxcount1)
			maxcount1=count;
		
		for (Entry<Department1, ArrayList<Employee1>> en1 : s) {
			ArrayList<Employee1> al= en1.getValue();

			if (maxcount == al.size()) {
				System.out.println("maxcount " + maxcount + " of " + en1.getKey());
			}
		}
		// 6>Find employees whose name start with 'A'
		System.out.println("*************************************************************");
		System.out.println("Employees whose name start with 'A'");
		
		for (Entry<Department1, ArrayList<Employee1>> en1 : s) {
			
			System.out.println("\n\t"+en1.getKey());
			Iterator<Employee1> eltr = en1.getValue().iterator();
			int flag=0;
			while (eltr.hasNext()) {
				Employee1 e11 = eltr.next();
				if (e11.eName.charAt(0) == 'A') {
					System.out.println("\t\t" + e11);
					flag++;
				}
			}
			if(flag==0)
				System.out.println("\t\tNo employee whose name start with 'A' ");

		}
		// total Salary of Each department
		System.out.println("*************************************************************");
		System.out.println("Total Salary of Each department");
		
		for (Entry<Department1, ArrayList<Employee1>> en1 : s) {
			double totalsal=0;
			
			Department1 dt= en1.getKey();
			System.out.println(dt);
			ArrayList<Employee1> al = en1.getValue();
			Iterator<Employee1> etemp = al.iterator();
			while(etemp.hasNext()) {
				Employee1 e=etemp.next();
				totalsal= totalsal+ e.getSalary();
			}
			System.out.println("Total Salary of Department is : "+ totalsal);
		}
		
	}

}
