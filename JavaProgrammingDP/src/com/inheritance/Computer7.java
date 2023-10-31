package com.inheritance;

public class Computer7 extends ElectronicDevice7 {

	private String processor;
	private int ram;
	private int ssd;
	private double discount;
	
	public Computer7() {
		super();
		processor="";
		ram=0;
		ssd=0;
		discount=0.0;
	}
	public Computer7(int deviceNo, String deviceName, String oS, MyDate7 dom, double price,String model, String processor, int ram, int ssd, double discount) {
		super(deviceNo, deviceName, oS, dom, price);
		this.model = model;
		this.processor = processor;
		this.ram = ram;
		this.ssd = ssd;
		this.discount = discount;
	}

	private String model;
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getSsd() {
		return ssd;
	}

	public void setSsd(int ssd) {
		this.ssd = ssd;
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
		return super.toString()+ "Computer processor=" + processor + ", ram=" + ram + ", ssd=" + ssd + ", discount=" + discount
				+ ", model=" + model ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer7 obj= new Computer7(01,"Dell","Windows",new MyDate7(25,10,2023),50000,"I5","Intel",8,500,10);
		obj.calculatePrice();
		System.out.println(obj);
	}

}
