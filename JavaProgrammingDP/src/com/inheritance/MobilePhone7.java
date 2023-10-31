package com.inheritance;

public class MobilePhone7 extends ElectronicDevice7 {
	private String model;
	private int ram;
	private int memory;
	private double discount;
	
	public MobilePhone7() {
		System.out.println("Default const of MobilePhone7");
		model="";
		ram=0;
		memory=0;
		discount=0.0;
	}
	
	public MobilePhone7(int deviceNo, String deviceName, String oS, MyDate7 dom, double price,
						String model, int ram, int memory, double discount) {
		super(deviceNo,deviceName,oS,dom,price);
		System.out.println("Parametric const of MobilePhone7");
		this.model = model;
		this.ram = ram;
		this.memory = memory;
		this.discount = discount;
	}

	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
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
	public String toString() {
		return super.toString()+" Model : " + model +" RAM : " + ram +" Memory : " + memory	+" Discount : "+ discount;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MobilePhone7 obj= new MobilePhone7(02,"MobilePhone","Android",new MyDate7(25,10,2022),40000,"Samsung",4,16,12);
		obj.calculatePrice();
		System.out.println(obj);
	}

}
