package com.Assignments;
/* Create one class Employee (emp_id, name, sal) with private access specifier and create getter and setter. 
 * Create 2 objects
•	One  by default  constructor and then set data using setters
•	Create second object by parameterized constructor.
•	Call display on both objects 
 	Compare Salary of both objects 		*/

public class Employee {

	private int emp_id;
	private String name;
	private double sal;
	
	public Employee(){
		int emp_id;
		String name;
		double sal;
	}
	
	public Employee(int id, String n, double s ) {
		emp_id=id;
		name=n;
		sal=s;
	}
	
	public void setEmp_id(int id) {
		emp_id=id;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setName(String n) {
		name=n;
	}
	public String getName() {
		return name;
	} 
	public void setSal(double s) {
		sal=s;
	}
	public double getSal() {
		return sal;
	}
	
	public void setData(int id, String n, double s) {
		emp_id=id;
		name=n;
		sal=s;
		
	}
	
	public void displayData() {
		System.out.println("Employee ID is : "+ emp_id);
		System.out.println("Employee Name is : "+ name);
		System.out.println("Employee Salary is : "+ sal);
	}
	
	public void compareSal(Employee obj1) {
		if(this.sal>obj1.sal)
			System.out.println(this.emp_id+"."+this.name +" has greater salary than "+ obj1.emp_id+"."+ obj1.name);
		else
			System.out.println(obj1.emp_id+"."+ obj1.name +" has greater salary than "+ this.emp_id+"."+this.name);
	}
	
	public static void main(String[] args) {
		
		Employee obj= new Employee();
		obj.setEmp_id(1);
		obj.setName("Yogesh");
		obj.setSal(50000);
		obj.displayData();
		
		Employee obj1= new Employee(2,"Sumit",40000);
		obj1.displayData();
		
		obj.compareSal(obj1);
		
	}

}
