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
public class Subject2 {

	private String subject;
	private Topic2 top;
	
	
	public Subject2() {
		subject="";
		top=new Topic2();
	}
	public Subject2(String subject, Topic2 top) {
		
		this.subject = subject;
		this.top = top;
	}
	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public Topic2 getTop() {
		return top;
	}
	public void setTop(Topic2 top) {
		this.top = top;
	}
	public String toString() {
		return " Subject : " + subject + top;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
