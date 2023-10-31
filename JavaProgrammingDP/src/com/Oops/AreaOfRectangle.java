package com.Oops;

public class AreaOfRectangle {

	float length,breadth, area;
	public  void setData(float l, float b) {
		length = l;
		breadth=b;
	}

	public void calculateArea() {
		
		area=0.5f*(length*breadth);
		
	}

	public void displayData() {
		System.out.println("length of Rectangle is : "+length);
		System.out.println("Breadth of Rectangle is : "+breadth);
		System.out.println("Area of Rectangle is : "+ area);
	}
	public static void main(String[] args) {
		// calculate the area of rectangle
		
		AreaOfRectangle obj= new AreaOfRectangle();
		obj.setData(10f, 7.5f);
		obj.calculateArea();
		obj.displayData();
		
		
		
		
	}

}
