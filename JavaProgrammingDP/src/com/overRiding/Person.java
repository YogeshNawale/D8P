package com.overRiding;
/*
 * 8)WAP to create class Person with method readScript().
 * create class Actor which extends Person implement readScript() differently in child.
 */
public class Person {

	public void readScript() {
		System.out.println("Person");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Actor a= new Actor();
		a.readScript();
		a.readScript(1);
		a.readScript(1, 5);
	}

}
class Actor extends Person{
	public void readScript() {
		System.out.println("Actor readScript()");
	}
	public void readScript(int a) {
		System.out.println("Actor readScript(a)");
	}
	public void readScript(int a, int b) {
		System.out.println("Actor readScript(a,b)");
	}
}