package com.arrayOfObjects;
/*
 * 5.	Create array of students, student has (roll, name, age, marks). Print only
		those students who have marks more than 60 and age is less than 15.

 */

public class Student5 {

	private int rollNo;
	private String name;
	private int age;
	private double marks;
	
	
	public Student5() {
		rollNo=0;
		name="";
		age=0;
		marks=0.0;
			
	}
	public Student5(int rollNo, String name, int age, double marks ) {
		this.rollNo=rollNo;
		this.name=name;
		this.age=age;
		this.marks=marks;
	
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
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
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public String toString() {
		return "Student [RollNo : "+ rollNo + " Name : "+ name + " Age : "+ age + " Marks : "+ marks+"]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student5[] arr= new Student5[5];
		arr[0]=new Student5(01,"Amit",16,70);
		arr[1]=new Student5(02,"Aman",15,55);
		arr[2]=new Student5(03,"Ashok",12,65);
		arr[3]=new Student5(04,"Yogesh",14,62);
		arr[4]=new Student5(05,"Amol",16,66);
		
		for (Student5 a: arr)
			if(a.getAge()<15 && a.getMarks()>60)
			System.out.println(a);
		
	}

}
