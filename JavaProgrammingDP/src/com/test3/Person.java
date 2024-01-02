package com.test3;

import java.util.Arrays;

/*
 * 9)	Write a java program to create a array of 3 person .
 * Take input or hardcode  for all  three person from console. Person class is as follows 
     Person (int id, String name, Vehicle v[] )
     Vehicle (int vid, String vname) [2M]

 */
class Vehicle{
	int vid;
	String vname;
	
	public Vehicle( ) {
		 
		vid=0;
		vname="";
	}
	
	public Vehicle(int vid, String vname) {
		super();
		this.vid = vid;
		this.vname = vname;
	}
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}
	
	@Override
	public String toString() {
		return "Vehicle [ Id=" + vid + ", Name=" + vname + "]";
	}
	
	
}
public class Person {

	int id;
	String name;
	Vehicle v[];
	
	public Person() {
		
		id=0;
		name="";
		v=new Vehicle[0];
	}
	public Person(int id, String name, Vehicle[] v) {
		super();
		this.id = id;
		this.name = name;
		this.v = v;
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
	public Vehicle[] getV() {
		return v;
	}
	public void setV(Vehicle[] v) {
		this.v = v;
	}
	
	@Override
	public String toString() {
		return "Person [ Id=" + id + ", Name=" + name + ", Vehicle " + Arrays.toString(v) + "]";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehicle[] v1= new Vehicle[3];
		v1[0]=new Vehicle(01,"Bajaj");
		v1[1]=new Vehicle(02,"Hero");
		v1[2]=new Vehicle(03,"Yamaha");
		
		Vehicle[] v2= new Vehicle[2];
		v2[0]=new Vehicle(04,"Maruti");
		v2[1]=new Vehicle(05,"Toyata");
		
		Person[] p= new Person[3];
		p[0]=new Person(101,"Yogesh",v1);
		p[1]=new Person(102,"Amit",v2);
		p[2]=new Person(103,"Sumit",v1);
		
		System.out.println(Arrays.toString(p));
		
		
		
		
		
	}

}
