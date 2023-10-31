package com.inheritance;

public class LEDTV7 extends TV7{

	private double sizeinch;
	private int noOfPorts;
	private double discount;
	
	public LEDTV7() {
		System.out.println("Default const of LEDTV7");
		sizeinch=0.0;
		noOfPorts=0;
		discount=0.0;
	}
	
	public LEDTV7(int deviceNo, String deviceName, String oS, MyDate7 dom, double price, String model,double sizeinch, int noOfPorts, double discount) {
		super(deviceNo, deviceName, oS, dom, price, model);
		System.out.println("Parametric const of LEDTV7");
		this.sizeinch = sizeinch;
		this.noOfPorts = noOfPorts;
		this.discount = discount;
		
	}
	
	public double getSizeinch() {
		return sizeinch;
	}

	public void setSizeinch(double sizeinch) {
		this.sizeinch = sizeinch;
	}

	public int getNoOfPorts() {
		return noOfPorts;
	}

	public void setNoOfPorts(int noOfPorts) {
		this.noOfPorts = noOfPorts;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double calculatePrice() {
		double p= super.getPrice()*(1+(discount/100));
		super.setPrice(p);
		return p;
	}
	
	@Override
	public String toString() {
		return super.toString()+"LEDTV [sizeinch=" + sizeinch + ", noOfPorts=" + noOfPorts + ", discount=" + discount + "]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LEDTV7 obj= new LEDTV7(04,"TV","Embedeed",new MyDate7(23,10,2022),30000,"Samsung LED",36.5,5,20);
		obj.calculatePrice();
		System.out.println(obj);
	}

}
