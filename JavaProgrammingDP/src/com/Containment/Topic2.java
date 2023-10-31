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
public class Topic2 {

	private String topic;
	private String subtopic;
	private String questions;
	
	Topic2(){
		
	}
	Topic2(String topic,String subtopic,String quo){
		this.topic=topic;
		this.subtopic=subtopic;
		this.questions=quo;
	}
	
	
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public String getSubtopic() {
		return subtopic;
	}
	public void setSubtopic(String subtopic) {
		this.subtopic = subtopic;
	}
	public String getQuestions() {
		return questions;
	}
	public void setQuestions(String questions) {
		this.questions = questions;
	}
	public String toString() {
		return " Topic : "+ topic + " SubTopic : "+ subtopic + " Questions : " + questions; 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

}
