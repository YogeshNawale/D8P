package com.Oops;

public class Employee {

	// data members
	int eid;
	String ename, desg, dname, addrs, email;
	long contactNum;
	double Sal;
	boolean FullTimeStatus;

	public void setData(int id, String name, String desig, String dept, String add, String emailadd, long num,
			double salary, boolean status) {

		eid = id;
		ename = name;
		desg = desig;
		dname = dept;
		addrs = add;
		email = emailadd;
		contactNum = num;
		Sal = salary;
		FullTimeStatus = status;

	}

	public void displaydata() {

		System.out.println("Employee Id " + eid);
		System.out.println("Employee Name " + ename);
		System.out.println("Designation Name " + desg);
		System.out.println("Employee Deartment " + dname);
		System.out.println("Address " + addrs);
		System.out.println("Employee email " + email);
		System.out.println("Employee Contact Number " + contactNum);
		System.out.println("Employee Salary " + Sal);
		System.out.println("Employee Status " + FullTimeStatus);
	}

	public static void main(String[] args) {

		Employee obj = new Employee();
		obj.setData(1, "pankaj kapoor", "Manager", "Television", "Mumbai", "pkapoor@gmail.com", 9324676236l, 6327000,
				true);
		obj.displaydata();
		
		System.out.println("_________________________");
		Employee obj1= new Employee();
		obj1.setData(2, "Sahid Kapoor", "Actor", "Film", "Delhi", "Skapoor@gmail.com", 93242367632l, 9734000, true);
		obj1.displaydata();
		
		System.out.println("_________________________");
		Employee obj2= new Employee();
		obj2.setData(0, null, null, null, null, null, 0, 0, false);
		obj2.displaydata();
	
	}

}
