package com.test5;

import java.util.Comparator;

public class Shipment {
	private int shipid;
	private String cust_name;
	private Address addr;
	private MyDate shipDate;

	public Shipment() {
		// TODO Auto-generated constructor stub
	}

	public Shipment(int shipid, String cust_name, Address addr, MyDate shipDate) {
		super();
		this.shipid = shipid;
		this.cust_name = cust_name;
		this.addr = addr;
		this.shipDate = shipDate;
	}

	public int getShipid() {
		return shipid;
	}

	public void setShipid(int shipid) {
		this.shipid = shipid;
	}

	public String getCust_name() {
		return cust_name;
	}

	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	public MyDate getShipDate() {
		return shipDate;
	}

	public void setShipDate(MyDate shipDate) {
		this.shipDate = shipDate;
	}

	@Override
	public String toString() {
		return "Shipment [shipid=" + shipid + ", cust_name=" + cust_name + ", addr=" + addr + ", shipDate=" + shipDate
				+ "]";
	}

}

class MyDate {
	private int dd, mm, yy;

	public MyDate() {
		// TODO Auto-generated constructor stub
	}

	public MyDate(int dd, int mm, int yy) {
		super();
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}

	public int getDd() {
		return dd;
	}

	public void setDd(int dd) {
		this.dd = dd;
	}

	public int getMm() {
		return mm;
	}

	public void setMm(int mm) {
		this.mm = mm;
	}

	public int getYy() {
		return yy;
	}

	public void setYy(int yy) {
		this.yy = yy;
	}

	@Override

	public String toString() {
		return " Date [dd=" + dd + ", mm=" + mm + ", yy=" + yy + "]";
	}

}

class Address {
	private String addr, city, state;

	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(String addr, String city, String state) {
		super();
		this.addr = addr;
		this.city = city;
		this.state = state;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [addr=" + addr + ", city=" + city + ", state=" + state + "]";
	}

}
