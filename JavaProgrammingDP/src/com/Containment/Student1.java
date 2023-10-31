package com.Containment;
/*	WAP to have Department class created with id, name . Student class has roll, name and 
 *  Department object should have id and name. Assign and print individual values in main method
*/
public class Student1 {
	private int rollNo;
	private String name;
	
	
	public Student1() {
		rollNo=0;
		name="";
			
	}
	public Student1(int rollNo, String name) {
		this.rollNo=rollNo;
		this.name=name;
	
	}
	
	public void setRollNo(int rollNo) {
		this.rollNo=rollNo;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	
	public String toString() {
		return " Student Roll No : "+ rollNo + " Student Name : "+ name ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Student1 obj= new Student1(10,"yogesh" );
		System.out.println(obj);
		
		 
		Student1 obj1= new Student1(15,"Amit");
		System.out.println(obj1);
	}

}
