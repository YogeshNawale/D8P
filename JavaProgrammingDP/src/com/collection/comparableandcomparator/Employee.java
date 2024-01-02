package com.collection.comparableandcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Department {

	int deptId;
	String deptName;
	String location;

	public Department() {

	}

	public Department(int deptId, String deptName, String location) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.location = location;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + ", location=" + location + "]";
	}

}

public class Employee implements Comparable<Employee> {
	int empId;
	String empName, empDesignation;
	double empSalary;
	int age;
	Department dept;

	public Employee() {

	}

	public Employee(int empId, String empName, String empDesignation, double empSalary, int age, Department dept) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDesignation = empDesignation;
		this.empSalary = empSalary;
		this.age = age;
		this.dept = dept;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpDesignation() {
		return empDesignation;
	}

	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	@Override
	public int compareTo(Employee o) {
		//Sorting on id based on logic in compareTo method
//		if (this.empId == o.empId)
//			return 0;
//		else if (this.empId > o.empId)
//			return 1;
//		else
//			return -1;

//		// Sorting on id based on build in compareTo method
//		Integer i1=this.empId;
//		Integer i2=o.empId;
//		return i1.compareTo(i2);

		// Sorting in descending order on id based on logic in compareTo method
//		if (this.empId == o.empId)
//			return 0;
//		else if (this.empId > o.empId)
//			return -1;
//		else 
//			return 1;

		// Sorting Employee ArrayList based on Location in compareTo method

		int res = this.getDept().location.compareTo(o.getDept().location);
		return res;

	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empDesignation=" + empDesignation
				+ ", empSalary=" + empSalary + ", age=" + age + ", dept=" + dept + "]";
	}

	public static void main(String[] args) {

		ArrayList<Employee> emp = new ArrayList<>();
		emp.add(new Employee(1, "Yogesh", "Manager", 70000, 28, new Department(101, "Development", "Pune")));
		emp.add(new Employee(5, "Amit", "Developer", 60000, 25, new Department(104, "Sales", "Banglore")));
		emp.add(new Employee(7, "Sumit", "Supervisor", 40000, 23, new Department(501, "IT", "Hydyabad")));
		emp.add(new Employee(2, "Ishwar", "Tester", 45000, 32, new Department(102, "PostDevelopment", "Pune")));
		emp.add(new Employee(4, "Bhakti", "Manager", 70000, 54, new Department(121, "Development", "Mumbai")));
		emp.add(new Employee(8, "Sudarshan", "Manager", 70000, 23, new Department(401, "AfterSalesService", "Pune")));
		emp.add(new Employee(6, "Amit", "PostDevelopment", 55000, 44, new Department(101, "Developer", "Banglore")));
		emp.add(new Employee(3, "Utkarsha", "Supervisor", 45000, 22, new Department(161, "IT", "Pune")));
		emp.add(new Employee(9, "Sudarshan", "PostDevelopment", 45000, 26,
				new Department(201, "AfterSalesService", "Hydrabad")));
		emp.add(new Employee(10, "Abhishek", "Developer", 50000, 20, new Department(211, "Sales", "Pune")));

		Iterator<Employee> itr = emp.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("***************************************************************************");

		Collections.sort(emp);
		itr = emp.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("***************************************************************************");

		EmployeeSortUsingNameAndSalary obj = new EmployeeSortUsingNameAndSalary();
		Collections.sort(emp, obj);
		System.out.println("Sorting by name and salary");
		itr = emp.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("*****************************************************************************");
		EmployeeSortUsingAge obj1 = new EmployeeSortUsingAge();
		Collections.sort(emp, obj1);
		itr = emp.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("*********************************************************************************");
		System.out.println("Employees Working in Banglore Location");
		String str = "Banglore";
		for (int i = 0; i < emp.size(); i++) {
			if (emp.get(i).getDept().location == str)
				System.out.println(emp.get(i));
		}
		System.out.println("*********************************************************************************");
		System.out.println("Max Salary  Employee Working in IT dept");
		String str1 = "IT";
		double max = 0;
		Employee e1 = null;
		for (int i = 0; i < emp.size(); i++) {
			if (emp.get(i).getDept().deptName == str1) {

				if (emp.get(i).empSalary > max) {
					max = emp.get(i).empSalary;
					e1 = emp.get(i);
				}
			}
		}
		System.out.println(max + " is Maximum Salary in " + str1 + " Department " + e1);

		System.out.println("*********************************************************************************");
		System.out.println("Employees whoose name start with 'A' ");

		for (int i = 0; i < emp.size(); i++) {
			if (emp.get(i).empName.charAt(0) == 'A') {
				System.out.println(emp.get(i));
			}
		}

	}
}

	class EmployeeSortUsingNameAndSalary implements Comparator<Employee> {

		@Override
		public int compare(Employee o1, Employee o2) {
			int res;
			if (o1.empName.equals(o2.empName)) {
				return res = (int) (o1.empSalary - o2.empSalary);
			} else
				return res = o1.empName.compareTo(o2.empName);

		}
	}

class EmployeeSortUsingAge implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {

		if (o1.age == o2.age)
			return 0;
		else if (o1.age > o2.age)
			return 1;
		else
			return -1;
	}

}
