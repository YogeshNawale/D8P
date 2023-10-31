package com.overRiding;
/*
 * 5)WAP to create class Programmer with Method workingHours().
 * 		create class Employee which extends Programmer implement workingHours()differently in child.
 */
public class Programmer {

	public void workingHours() {
		System.out.println("In Programmer");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Employee extends Programmer{
	
	public void workingHours() {
		System.out.println("In Employee workingHours()");
	}
	public void workingHours(int a) {
		System.out.println("In Employee workingHours(a)");
	}
	public void workingHours(int a , double b) {
		System.out.println("In Employee workingHours(a,b)");
	}
}