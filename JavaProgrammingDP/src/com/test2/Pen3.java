package com.test2;
/*
 * . A Pen contains variables Refill, capLength and brand. 
		Refill has variables inkColor, length and Nib (tip).
 		Nib has variables materialType and width. 
	Create a Java class structure for above . Write a main method which sets values in all the variables
	using setter methods and prints all the variables using getter methods

 */
public class Pen3 {

	Refill3 rf;
	int capLength;
	String brand;
	
	public Pen3() {
		rf=new Refill3();
		capLength=0;
		brand="";
	}
	
	public Pen3(Refill3 rf, int capLength, String brand) {
		super();
		this.rf = rf;
		this.capLength = capLength;
		this.brand = brand;
	}

	public Refill3 getRf() {
		return rf;
	}

	public void setRf(Refill3 rf) {
		this.rf = rf;
	}

	public int getCapLength() {
		return capLength;
	}

	public void setCapLength(int capLength) {
		this.capLength = capLength;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String toString() {
		return "Pen [ "+  new Refill3() + " Cap Length "+ capLength +" Brand "+ brand + "]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Nib3 obj1= new Nib3();
		obj1.setMaterialType("Plastic");
		obj1.setWidth(2);
		
		Refill3 obj2= new Refill3();
		obj2.setInkColor("Blue");
		obj2.setLength(5);
		obj2.setTip(obj1);
		
		Pen3 obj= new Pen3();
		obj.setRf(obj2);
		obj.setCapLength(2);
		obj.setBrand("Renolds");
		
		System.out.println(obj1.getMaterialType());
		System.out.println(obj1.width);
		System.out.println(obj2.getInkColor());
		System.out.println(obj2.getLength());
		System.out.println(obj.getCapLength());
		System.out.println(obj.getBrand());
		
	}

}
