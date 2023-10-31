package com.overRiding;
/*
 * WAP to create class shape with method draw().create class circle, square, Rectangle which extends Shape 
 * implement draw() differently in each child.
 */
public class Shape {
	
	public void draw() {
		System.out.println("Shape");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape a= new Shape();
		Shape b= new Circle();
		Shape c= new Square();
		Rectangle d= new Rectangle();
		
		a.draw();
		b.draw();
		c.draw();
		d.draw();
	}

}
class Circle extends Shape{
	public void draw() {
		System.out.println("Shape Circle");
	}
}
class Square extends Shape{
	public void draw() {
		System.out.println("Shape Square");
	}
}
class Rectangle extends Shape{
	public void draw() {
		System.out.println("Shape Rectangle");
	}
}