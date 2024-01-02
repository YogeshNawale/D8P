package com.test6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/*
 * Q8>There is a HashSet which has student objects. Create two ArrayLists from this HashSet. 
 * WAP to iterate and remove all the students in HashSet such that in one ArrayList
 *  called “placed” Students insert students who have been placed and in another ArrayList
 *   add un-“placed” Students. In the end, the HashSet should contain nothing.
 *    
	Student class fields: (id, name, degree, passingYear, placed (true/false) ). 

 */
public class Student {

	private int id;
	private String name;
	private String degree;
	private int passingYear;
	private boolean placed;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, String degree, int passingYear, boolean placed) {
		super();
		this.id = id;
		this.name = name;
		this.degree = degree;
		this.passingYear = passingYear;
		this.placed = placed;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public int getPassingYear() {
		return passingYear;
	}

	public void setPassingYear(int passingYear) {
		this.passingYear = passingYear;
	}

	public boolean isPlaced() {
		return placed;
	}

	public void setPlaced(boolean placed) {
		this.placed = placed;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", degree=" + degree + ", passingYear=" + passingYear
				+ ", placed=" + placed + "]";
	}

	public static void main(String[] args) {

		HashSet<Student> hm = new HashSet<>();
		hm.add(new Student(101, "Yogesh", "BE Mech", 2020, true));
		hm.add(new Student(102, "Suraj", "BE IT", 2022, true));
		hm.add(new Student(103, "Prasad", "BE CSE", 2021, false));
		hm.add(new Student(104, "Ishwar", "BE Mech", 2022, true));
		hm.add(new Student(105, "Ganesh", "BE CSE", 2021, false));
		hm.add(new Student(106, "Snehal", "BE IT", 2022, true));
		hm.add(new Student(107, "Utkarsha", "BE CSE", 2021, false));
		hm.add(new Student(108, "Sudarshan", "BE Mech", 2023, true));

		for (Student s : hm)
			System.out.println(s);

		System.out.println("_________________________________________________________");

		ArrayList<Student> placed = new ArrayList<>();
		ArrayList<Student> unplaced = new ArrayList<>();

//		for (Student s : hm) {
//			if (s.isPlaced() == true) {
//				placed.add(s);
//				//hm.remove(s);
//			} else {
//				unplaced.add(s);
//				//hm.remove(s);
//			}
//		}
		
		Iterator<Student> itr = hm.iterator();
		while(itr.hasNext()) {
			Student s=itr.next();
			if (s.isPlaced() == true) {
				placed.add(s);
				itr.remove();
			} else {
				unplaced.add(s);
				itr.remove();
			}
		}
		System.out.println(placed);
		System.out.println(unplaced);
		//hm.clear();
		System.out.println( hm);

	}

}
