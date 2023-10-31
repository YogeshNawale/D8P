package com.test2;

/*
 * .  Design  class Job with following fields (  id, Role, salary) [2M]
	Design class Person with following fields (id, name, mobile, Job )
	Relation-Person has a job .Write a program to create 2 person objects (by constructor).

 */
public class Job5 {

	int id;
	String role;
	double salary;

	Job5() {
		id = 0;
		role = "";
		salary = 0.0;
	}

	Job5(int id, String role, double salary) {
		this.id = id;
		this.role =role;
		this.salary=salary;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return " [ Id=" + id + ", role=" + role + ", salary=" + salary + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
