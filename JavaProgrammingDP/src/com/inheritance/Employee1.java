package com.inheritance;

 public class Employee1 {
	private int eid;
	private String name;
	private double salary;
	private MyDate1 doj;

	public Employee1() {
		System.out.println("Default constructor of Employee1");
		eid = 0;
		name = "";
		salary = 0.0;
		doj = new MyDate1();
	}

	public Employee1(int eid, String name, double sal, MyDate1 d) {

		System.out.println("Parameter constructor of Employee1");

		this.eid = eid;
		this.name = name;
		this.salary = sal;
		this.doj = d;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
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

	public MyDate1 getDoj() {
		return doj;
	}

	public void setDoj(MyDate1 doj) {
		this.doj = doj;
	}

	public String toString() {
		return "Employee [Id : " + eid + " Name : " + name + " Salary : " + salary + " Date of Joining : " + doj + "]";
	}

	public  void printArray(Employee1 a[]) {
		String str="";
		for (int i=0; i<a.length; i++) {
			if (a[i] instanceof SalesPerson1)
				str="SalesPerson1";
			else if (a[i] instanceof WageEmp1)
				str="WageEmp1";
			else if (a[i] instanceof Manager1)
				str="Manager1";
			else 
				str="Employee1";
		
		System.out.println(str);
		System.out.println(a[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee1 obj = new Employee1(01, "Yogesh", 50000, new MyDate1(25, 10, 2023));

		System.out.println(obj);
		System.out.println("_____________________________________________________");

		Employee1 arr[] = new Employee1[5];
		arr[0] = new Employee1(01, "Yogesh", 50000, new MyDate1(25, 10, 2023));
		arr[1] = new Manager1(03, "Suraj", 50000, new MyDate1(25, 10, 2023), 100, 100.5);
		arr[2] = new SalesPerson1(01, "AMit", 50000, new MyDate1(25, 10, 2023), 100, 50, 10000, 0.1);
		arr[3] = new WageEmp1(02, "Sumit", 50000, new MyDate1(25, 10, 2023), 200, 10);
		arr[4] = new Employee1(05, "Ajay", 30000, new MyDate1(20, 10, 2023));
		
		Employee1 a = new Employee1();
		a.printArray(arr);
	}

}
