package com.test2;
/*
 * .  Design a class to overload a function volume() as follows:  [2]
i) double volume(double r) – with radius ‘r’ as an argument, returns the volume of sphere using the formula:
v = 4 / 3 × 22 / 7 × r3
ii)double volume(double h, double r) – with height ‘h’ and radius ‘r’ as the arguments, returns the volume of a cylinder using the
 formula: v = 22 / 7 × r2 × h
iii) double volume(double l, double b, double h) – with length ‘l’, breadth ‘b’ and height ‘h’ as the arguments, returns the
 volume of a cuboid using the formula: v = l × b × h

 */
public class Q4MethodOverloading {

	double r,l,b,h,vol;
	
	
	public double volume(double r) {
		vol=(4/3)*(22/7)*(r*r*r);
		return vol;
		
	}
	public double volume(double h,double r) {
		vol=(22/7)*r*r*h;
		return vol;
		
	}
	public double volume(double l,double b,double h) {
		vol= l*b*h;
		return vol;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q4MethodOverloading obj= new Q4MethodOverloading();
		obj.volume(15, 5.5);
		System.out.println(obj.vol);
		
		obj.volume(10.5);
		System.out.println(obj.vol);
		
	}

}
