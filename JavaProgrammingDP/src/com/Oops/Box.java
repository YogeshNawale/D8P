package com.Oops;

public class Box {
	int length, width, height,volume;

	public  void setData(int l, int w, int h) {
		length = l;
		width = w;
		height = h;
	}

	public void calculateVolume() {
		
		volume=length* width* height;
		
	}

	public void displayData() {
		System.out.println("length of Box is : "+length);
		System.out.println("Width of Box is : "+width);
		System.out.println("Height of Box is : "+height);
		System.out.println("Volume of Box is : "+ volume);
	}
	public static void main(String[] args) {
		// Create class Box and calculate the volume of box volume=length x width x
		// height

		Box obj= new Box();
		obj.setData(10, 7, 5);
		obj.calculateVolume();
		obj.displayData();
		
	}

}
