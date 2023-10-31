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
public class Branch2 {

	private String branch;
	private Subject2 sub;
	
	Branch2(){
		branch="";
		sub= new Subject2();
	}
	
	Branch2(String bra, Subject2 s){
		branch=bra;
		sub=s;
	}
	
	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public Subject2 getSub() {
		return sub;
	}

	public void setSub(Subject2 sub) {
		this.sub = sub;
	}

	public String toString() {
		return " Branch : "+ branch+ sub;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
