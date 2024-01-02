package com.collection.hashmap;

import java.util.HashMap;

//10. WAP to create a map using Custom class as key and any other JDK provided object as value
public class Employee {

	int eid;
	String name;
	double sal;

	public Employee() {
		super();
	}

	public Employee(int eid, String name,double sal) {
		super();
		this.eid = eid;
		this.name = name;
		this.sal=sal;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", sal=" + sal + "]";
	}

	

}

class Department {

	int did;
	String dname;
	String location;

	public Department() {
		super();
	}

	public Department(int did, String dname, String location) {
		super();
		this.did = did;
		this.dname = dname;
		this.location = location;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Department [did=" + did + ", dname=" + dname + ", location=" + location + "]";
	}

}
