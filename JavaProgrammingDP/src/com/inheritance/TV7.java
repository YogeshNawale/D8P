package com.inheritance;

public class TV7 extends ElectronicDevice7 {

	private String model;
	
	public TV7() {
		System.out.println("Default const of TV7");

		model="";
	}
	
	public TV7(int deviceNo, String deviceName, String oS, MyDate7 dom, double price,String model) {
		super(deviceNo,deviceName,oS,dom,price);
		this.model = model;
	}
	

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	public String toString() {
		return super.toString()+ " Model : "+ model;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
