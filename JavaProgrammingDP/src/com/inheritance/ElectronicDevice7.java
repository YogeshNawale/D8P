package com.inheritance;
/*
 * 	Write a class ElectronicDevice. Inherit subclasses Computer, TV and MobilePhone from above class .Create
 * 	subclass LCDTV and LEDTV from TV.
 */
public class ElectronicDevice7 {

	private int deviceNo;
	private String deviceName;
	private String oS;
	private MyDate7 dom;
	private double price;

	public ElectronicDevice7() {
		System.out.println("Default const of ElectronicDevice7");
		deviceNo=0;
		deviceName="";
		oS="";
		dom=new MyDate7();
		price=0.0;
	}
	
	public ElectronicDevice7(int deviceNo, String deviceName, String oS, MyDate7 dom, double price) {
		System.out.println("Parametric const of ElectronicDevice7");
		this.deviceNo = deviceNo;
		this.deviceName = deviceName;
		this.oS = oS;
		this.dom = dom;
		this.price = price;
	}
	
	public int getDeviceNo() {
		return deviceNo;
	}

	public void setDeviceNo(int deviceNo) {
		this.deviceNo = deviceNo;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getoS() {
		return oS;
	}

	public void setoS(String oS) {
		this.oS = oS;
	}

	public MyDate7 getDom() {
		return dom;
	}

	public void setDom(MyDate7 dom) {
		this.dom = dom;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public String toString() {
		return "Electronic [Device No : " + deviceNo + " Device Name "+ deviceName + " Operating System : "+ oS+
				" Date of Manufacturing : " + dom + " Price : "+ price + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
