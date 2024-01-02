package com.collection.linkedlist;

public class Student implements Comparable<Student>{
	int id;
	String name;
	int perc;
	int branchId;
	
	public Student() {
		super();
	}

	public Student(int id, String name, int perc, int branchId) {
		super();
		this.id = id;
		this.name = name;
		this.perc = perc;
		this.branchId = branchId;
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

	public int getPerc() {
		return perc;
	}

	public void setPerc(int perc) {
		this.perc = perc;
	}

	public int getBranchId() {
		return branchId;
	}

	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", perc=" + perc + ", branchId=" + branchId + "]";
	}

	@Override
	public int compareTo(Student o) {
		 
		int res= this.name.compareTo(o.name);
		return res;
	}


	
	
}
