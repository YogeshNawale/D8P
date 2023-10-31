package com.Oops;

public class AdditionOverloading {
	
	public void add(int i, int j) {
		System.out.println("Addition (int, int) is : "+ (i+j));
	}
	
	private void add(float f1, float f2) {
		System.out.println("Addition (float, float) is : "+ (f1+f2));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AdditionOverloading obj = new AdditionOverloading();
		obj.add(5, 19);
		obj.add(5, 5.5f);
	}

}
