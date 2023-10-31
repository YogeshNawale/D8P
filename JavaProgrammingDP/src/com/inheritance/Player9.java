package com.inheritance;
/*
 * Write a class player and inherit HockeyPlayer, Cricketer, FootBallPlayer classes. Derive Batsman and
 * Bowler classes from cricketer.  
 */
public class Player9 {

	private String name;
	private int age;
	private String gender;
	private double salary;
	
	public Player9() {
		System.out.println("Default const of Player9");
		name="";
		age=0;
		gender="";
		salary=0.0;
	}
	public Player9(String name, int age, String gender, double sal) {
		System.out.println("Parameterised const of Player9");
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.salary=sal;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String toString() {
		return " Player [ Name : "+ name + " Age : "+ age + " Gender : "+ gender + " Salary : "+ salary + "]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
