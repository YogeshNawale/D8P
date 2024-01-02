package com.arrayOfObjects;

import java.util.Arrays;

public class StudentPerc {
	int rollNo;
	String name;
	double perc;
	double marks[];

	public StudentPerc() {
		rollNo = 0;
		name = "";
		perc = 0.0;
		marks = new double[5];
	}

	public StudentPerc(int rollNo, String name, double marks[]) {
		this.rollNo = rollNo;
		this.name = name;
		this.perc = calculatePerc(marks);
		this.marks = marks;
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

	public double getPerc() {
		return perc;
	}

	public void setPerc(double perc) {
		this.perc = perc;
	}

	public double[] getMarks() {
		return marks;
	}

	public void setMarks(double[] marks) {
		this.marks = marks;
	}

	public double calculatePerc(double arr[]) {
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		double perc = sum / 5;
		return perc;
	}

	public static void printMaxPerc(StudentPerc[] s) {
		StudentPerc[] n= new StudentPerc[1];
		double max=s[0].perc;
		n[0] =s[0];
		for(int i=0; i<s.length; i++) {
			if(s[i].perc>max) {
				max=s[i].perc;
				n[0]=s[0];
			}
		}
		System.out.println("Maximum percentage is "+ max +" of "+ Arrays.toString(n) );
	}

	@Override
	public String toString() {
		return "Student  [rollNo=" + rollNo + ", name=" + name + ", perc=" + perc + ", marks="
				+ Arrays.toString(marks) + "]\n";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a1[] = { 67, 65, 55, 78, 55 };
		double a2[] = { 34, 54, 43, 23, 43 };
		double a3[] = { 67, 57, 77, 78, 88 };
		double a4[] = { 92, 77, 54, 78, 67 };
		double a5[] = { 91, 89, 90, 76, 77 };

		StudentPerc[] student = new StudentPerc[5];
		student[0] = new StudentPerc(01, "Yogesh", a1);
		student[1] = new StudentPerc(02, "Amit", a2);
		student[2] = new StudentPerc(03, "Ashish", a3);
		student[3] = new StudentPerc(04, "Akash", a4);
		student[4] = new StudentPerc(05, "Suraj", a5);

		System.out.println(Arrays.toString(student));
		
		printMaxPerc(student);

	}

}
