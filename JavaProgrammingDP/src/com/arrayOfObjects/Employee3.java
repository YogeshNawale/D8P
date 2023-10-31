package com.arrayOfObjects;

/*
 * 3.	Create class Dept(did, dname), class MyDate(day, month, year)
		a.	Class Employee(emp_id, emp_name, salary, date(object), dept(object)). 
		Create array of Employee and display the array elements.
4.	Same as above but print Employees whose dept_name is same.

 */
public class Employee3 {
	private int id;
	private String name;
	private double salary;
	private MyDate3 doj;
	private Dept3 dept;

	public Employee3() {

		id = 0;
		name = "";
		salary = 0.0;
		doj = new MyDate3();
		dept = new Dept3();

	}

	public Employee3(int id, String name, double sal, MyDate3 doj, Dept3 dept) {

		this.id = id;
		this.name = name;
		this.salary = sal;
		this.doj = doj;
		this.dept = dept;
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

	public Dept3 getDept() {
		return dept;
	}

	public void setDept(Dept3 dept) {
		this.dept = dept;
	}

	public MyDate3 getMyDate() {
		return doj;
	}

	public void setMyDate(MyDate3 doj) {
		this.doj = doj;
	}

	public String toString() {
		return "Employee [ ID :" + id + " Name : " + name + " Salary : " + salary + doj + dept + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee3[] arr = new Employee3[5];
		arr[0] = new Employee3(01, "Amit", 50000, new MyDate3(20, 10, 2023), new Dept3(01, "Developer"));
		arr[1] = new Employee3(02, "Aman", 55000, new MyDate3(25, 10, 2023), new Dept3(01, "Software Developer"));
		arr[2] = new Employee3(03, "Ashok", 50000, new MyDate3(20, 10, 2023), new Dept3(01, "Hardware Developer"));
		arr[3] = new Employee3(04, "Yogesh", 45000, new MyDate3(23, 10, 2023), new Dept3(01, "Developer"));
		arr[4] = new Employee3(05, "Amol", 50000, new MyDate3(20, 10, 2023), new Dept3(01, "Developer"));

		for (int i = 0; i < arr.length; i++) {
			System.out.println("________________________________________________");
			System.out.println("Same Department for : " + arr[i]);
			for (int j = 0; j < arr.length; j++)
				if (i != j && arr[i].dept.compare(arr[j].dept)) {

					System.out.println(arr[j]);

				}
		}
	}

}
