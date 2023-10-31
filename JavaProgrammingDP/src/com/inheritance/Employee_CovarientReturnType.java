package com.inheritance;

public class Employee_CovarientReturnType {

	public Employee_CovarientReturnType getEmployee() {
		return new Employee_CovarientReturnType();
	}
	
}

class Manager5 extends Employee_CovarientReturnType{
	
	public Manager5 getEmployee() {
		return new Manager5();
	}
}
