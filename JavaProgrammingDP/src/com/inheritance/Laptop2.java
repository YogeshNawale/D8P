package com.inheritance;

/*Create Class Laptop which has variables noOfUSBPort, processorSpeed of
type int. Create getter, setter methods for the variables. In main method,
1> create Laptop object 2> set values of variables noOfUSBPort,
processorSpeed using setter methods. 3> print variables noOfUSBPort,
processorSpeed using getter methods.*/
public class Laptop2 {

	private int noOfUSBPort;
	private int processorSpeed;
	
	public Laptop2() {
		noOfUSBPort=0;
		processorSpeed=0;
	}
	public Laptop2(int noOFUSBPort, int processorSpeed) {
		this.noOfUSBPort=noOFUSBPort;
		this.processorSpeed=processorSpeed;
	}
	public void setUSBPort(int noOFUSBPort) {
		this.noOfUSBPort=noOFUSBPort;
	}
	public int getUSBPort() {
		return noOfUSBPort;
	}
	public void setProcessorSpeed(int speed) {
		this.processorSpeed=speed;
	}
	public int getProcessorSpeed() {
		return processorSpeed;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Laptop2 obj= new Laptop2();
		obj.setUSBPort(5);
		obj.setProcessorSpeed(2);
		System.out.println("No. of USB Ports : "+obj.getUSBPort());
		System.out.println("Processor Speed : "+obj.getProcessorSpeed());
		
	}

}
