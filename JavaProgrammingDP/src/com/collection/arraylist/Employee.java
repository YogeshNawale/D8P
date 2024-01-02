package com.collection.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/*  6.        Let employee class have a department object. Iterate through aarraylist of employees.
//  7.        Use copy method of collections class to make a copy of given arraylist of employees.
//			Check if it creates shallow copy or deep copy. 
//			Check if department objects are also copied.
 *  9. Sort arraylist of employees on employee names using comparable interface.
 */
class department {
	int deptid;
	String name;

	public department(int deptid, String name) {
		super();
		this.deptid = deptid;
		this.name = name;
	}

	public int getDeptid() {
		return deptid;
	}

	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "\tdepartment [deptid=" + deptid + ", name=" + name + "]";
	}

}

public class Employee implements Comparable<Employee> {

	int empid;
	String ename;
	department dept;

	public Employee() {

	}

	public Employee(int empid, String ename, department dept) {

		this.empid = empid;
		this.ename = ename;
		this.dept = dept;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public department getDept() {
		return dept;
	}

	public void setDept(department dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + dept + "]";
	}
	@Override
	public int compareTo(Employee o) {
		 int res= this.ename.compareTo(o.ename);
		return res;
	}

	public static void main(String[] args) {

		ArrayList<Employee> emp= new ArrayList<>();
		Employee e1=new  Employee(100,"Yogesh",new department(01,"Software Developer")) ;
		emp.add(e1);
		emp.add(new Employee(101,"Amit",new department(02,"Software Tester")));
		emp.add(new Employee(102,"Amol",new department(04,"Reception")));
		emp.add(new Employee(103,"Sandeep",new department(06,"HR")));
		
		Iterator<Employee> itr=emp.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("____________________________________________________________________");
		
		ArrayList<Employee> emp1= new ArrayList<>(Collections.nCopies(emp.size(), null));
		Collections.copy(emp1,emp);
		
		Iterator<Employee> itr1=emp1.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		System.out.println("******************************************************************");
		e1.getDept().name="Coder";
		System.out.println(emp1); // deepCopy
		System.out.println();
		System.out.println("Sort arraylist of employees");
		Collections.sort(emp);
		itr=emp.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

	
}
