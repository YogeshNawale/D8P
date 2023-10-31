package com.test2;
/*
 * . A Pen contains variables Refill, capLength and brand. 
		Refill has variables inkColor, length and Nib (tip).
 		Nib has variables materialType and width. 
	Create a Java class structure for above . Write a main method which sets values in all the variables
	using setter methods and prints all the variables using getter methods

 */
public class Refill3 {

	String inkColor;
	int length;
	Nib3 tip; 
	
	Refill3(){
		inkColor="";
		length=0;
		tip=new Nib3(); 
	}
	
	public Refill3(String inkColor, int length, Nib3 tip) {
		this.inkColor = inkColor;
		this.length = length;
		this.tip = tip;
	}

	public String getInkColor() {
		return inkColor;
	}

	public void setInkColor(String inkColor) {
		this.inkColor = inkColor;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public Nib3 getTip() {
		return tip;
	}

	public void setTip(Nib3 tip) {
		this.tip = tip;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
