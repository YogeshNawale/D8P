package com.abstraction;
/*
 * Create 2 abstract classes Abs1 and Abs2 each with different implemented methods doAbs1() and doAbs2() 
 * respectively. Check if you can create a class Test1 which extends both the abstract classes. 
 * (Note- A class cannot extend 2 classes simultaneously)
 */

abstract class Abs1{
	public void doAbs1() {
		System.out.println("doAbs1");
	}
}
abstract class Abs2{
	public void doAbs1() {
		System.out.println("doAbs2");
	}
	
}
public class Test1 extends Abs1 {

}
