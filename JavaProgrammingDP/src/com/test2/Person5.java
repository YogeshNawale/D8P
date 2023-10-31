package com.test2;
/*
 * .  Design  class Job with following fields (  id, Role, salary) [2M]
	Design class Person with following fields (id, name, mobile, Job )
	Relation-Person has a job .Write a program to create 2 person objects (by constructor).

 */
public class Person5 {

	int id;
	String name;
	long mobile;
	Job5 j;
	
	Person5(){
		id=0;
		name="";
		mobile=0 ;
		j=new Job5();
	}
	
	public Person5(int id, String name, long mobile, Job5 j) {
		 
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.j = j;
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

	public double getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public Job5 getJ() {
		return j;
	}

	public void setJ(Job5 j) {
		this.j = j;
	}
	
	@Override
	public String toString() {
		return "Person  [id=" + id + ", name=" + name + ", mobile=" + mobile + ", Job=" + j + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person5 obj= new Person5();
		System.out.println(obj);
		
		Person5 obj1= new Person5(01,"yogesh",979724322,new Job5(101,"Manager",50000));
		System.out.println(obj1);
	}

}
