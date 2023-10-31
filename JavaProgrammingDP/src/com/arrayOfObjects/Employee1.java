package com.arrayOfObjects;

import java.util.Scanner;

/* 1.	WAP to print the employees from Employee[] array who has same salary 
 * (Create Employee class which has 3 attributes id, name, salary and add employee objects to your array)
 * //Accept id from user and show all emp who get same sal as given id
*/
public class Employee1 {
	private int id;
	private String name;
	private double salary;

	public Employee1() {

		id = 0;
		name = "";
		salary = 0.0;

	}

	public Employee1(int id, String name, double sal) {

		this.id = id;
		this.name = name;
		this.salary = sal;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String toString() {
		return "Employee [ ID :" + id + " Name : " + name + " Salary : " + salary + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		Employee1[] arr = new Employee1[5];
		arr[0] = new Employee1(01, "Amit", 50000);
		arr[1] = new Employee1(02, "Aman", 55000);
		arr[2] = new Employee1(03, "Ashok", 50000);
		arr[3] = new Employee1(04, "Yogesh", 55000);
		arr[4] = new Employee1(05, "Amol", 50000);

		/*
		 * for(Employee1 a : arr) System.out.println(a);
		 * 
		 * System.out.println();
		 */

		System.out.println("Enter ID ");
		int id = sc.nextInt();
		Employee1 obj =new Employee1();
		
		for (int i = 0; i < arr.length; i++) {
			if (id == arr[i].getId()) {
				obj = arr[i];
				break;
			}
			else { 
				System.out.println("Invalid Id");
				
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (obj.getSalary() == arr[i].getSalary())
				System.out.println(arr[i]);

		}

	}

}
