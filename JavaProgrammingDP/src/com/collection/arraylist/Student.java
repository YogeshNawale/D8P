package com.collection.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Student implements Comparable<Student>{

	int rollno;
	String name;
	ArrayList<Integer> marks;
	double perc;
	String grade;
	
	public Student() {
		
	}
	public Student(int rno, String name, ArrayList<Integer> marks) {
		rollno=rno;
		this.name=name;
		this.marks=marks;
		calculatePerc();
		claculateGrade();
	}
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Integer> getMarks() {
		return marks;
	}
	public void setMarks(ArrayList<Integer> marks) {
		this.marks = marks;
	}
	
	public double getPerc() {
		return perc;
	}
	public void setPerc(double perc) {
		this.perc = perc;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public void calculatePerc() {
		int sum=0;
		for(int a:marks)
			sum=sum+a;
		perc=(double)(sum/5);
		 
	}
	public void claculateGrade() {
		
		if(perc>90)
			this.grade="A+";
		
		else if(perc>=90)
		this.grade="A+";
		else if(perc>=80)
			this.grade="A";
		else if(perc>=70)
			this.grade="B+";
		else if(perc>=60)
			this.grade="B";
		else if(perc>=50)
			this.grade="c+";
		else 
			this.grade="c";
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + ", perc=" + perc + ", grade="
				+ grade + "]";
	}
	
	@Override
	public int compareTo(Student o) {
		// sorting using name
//		int res=this.name.compareTo(o.name);
//		System.out.println(res);
//		return res;
		
		//Sorting using rollNo
//		if(this.rollno==o.rollno)
//			return 0;
//		else if(this.rollno >o.rollno)
//			return 1;
//		else
//			return -1;
		
		// Sorting using perc
		if(this.perc==o.perc)
			return 0;
		else if(this.perc >o.perc)
			return 1;
		else
			return -1;
		
		//Sorting using Grade
//		int res=this.grade.compareTo(o.grade);
//		System.out.println(res);
//		return res;
		
	}
	public static void main(String[] args) {
		
		ArrayList<Student> list=new ArrayList<>();
		
		ArrayList<Integer> l1=new ArrayList<>(Arrays.asList(78,56,90,70,78));
		list.add(new Student(1,"Pankaj",l1));
		ArrayList<Integer> l2=new ArrayList<>(Arrays.asList(87,89,90,71,65));
		list.add(new Student(5,"Utkarsha",l2));
		ArrayList<Integer> l3=new ArrayList<>(Arrays.asList(45,58,81,70,67));
		list.add(new Student(8,"Snehal",l3));
		ArrayList<Integer> l4=new ArrayList<>(Arrays.asList(78,56,90,70,78));
		list.add(new Student(2,"Ishawar",l4));
		ArrayList<Integer> l5=new ArrayList<>(Arrays.asList(81,82,90,76,72));
		list.add(new Student(9,"Yogesh",l5));
		ArrayList<Integer> l6=new ArrayList<>(Arrays.asList(78,95,90,90,78));
		list.add(new Student(11,"Sudarshan",l6));
		ArrayList<Integer> l7=new ArrayList<>(Arrays.asList(78,91,90,98,78));
		list.add(new Student(12,"Pankaj",l7));
		ArrayList<Integer> l8=new ArrayList<>(Arrays.asList(88,86,90,90,78));
		list.add(new Student(4,"Medha",l8));
		ArrayList<Integer> l9=new ArrayList<>(Arrays.asList(83,86,90,90,78));
		list.add(new Student(3,"Adarsh",l9));
		ArrayList<Integer> l10=new ArrayList<>(Arrays.asList(76,56,67,45,78));
		list.add(new Student(7,"Prashant",l10));
		
		
		
		//System.out.println(list);
		Iterator<Student> itr= list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("______________________________________________________");
		System.out.println("Sorting by Percentage");
		Collections.sort(list);
		itr= list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("______________________________________________________");
		int count=0;
		itr= list.iterator();
		while(itr.hasNext()) {
			if(itr.next().perc>80)
			count++;
		}
		System.out.println("Number of Students Above 80 perc "+ count);
	}
	

}
