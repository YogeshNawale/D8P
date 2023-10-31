package com.overRiding;
/*
 * 5)WAP to create class Bike with fields color ,speed and  method bikeInfo() which is show color and 
 * speed of bike .
 * create class Pulsar which extends Bike implement bikeInfo() differently child 
 */
public class Bike {
	String colour;
	int speed;
	
	public void bikeInfo() {
		System.out.println(colour +","+ speed);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pulsar obj= new Pulsar();
		obj.bikeInfo();
		obj.bikeInfo(100);
		obj.bikeInfo("Red");
		obj.bikeInfo("Red", 80);
	}

}
class Pulsar extends Bike{
	
	public void bikeInfo() {
		System.out.println(colour +","+ speed);
	}
	public void bikeInfo(int speed) {
		System.out.println(colour +","+ speed);
	}
	public void bikeInfo(String colour) {
		System.out.println(colour +","+ speed);
	}
	public void bikeInfo(String colour,int speed) {
		System.out.println(colour +","+ speed);
	}
	
}