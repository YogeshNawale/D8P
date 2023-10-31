package com.Containment;
/*	WAP to use containment for following hierarchy. Fill all data and print all
	data: (id is a integer number, name is a String)
Class Institute
id	name	Branch
id	name	Subject
id	name	Topic
id	name	SubTopic
id	name	Question
id	name
*/
public class Institute2 {

	private int id;
	private String name;
	private Branch2 branch;
	
	
	public Institute2() {
		 id=0;
		 name="";
		 branch= new Branch2();
	}
	public Institute2(int id, String name, Branch2 branch) {
		this.id=id;
		this.name=name;
		this.branch=branch;
	}
	
	
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setBranch(Branch2 bran) {
		branch=bran;
	}
	public Branch2 getBranch() {
		return branch;
	}
	
	public String toString() {
		return "Institute [ID : "+ id + " Name : " + name + branch +"]";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Institute2 obj= new Institute2(01,"TQ",new Branch2("Java",new Subject2("Core Java", new Topic2("OOPS","Containment","2 "))));
		System.out.println(obj);
		}

}
