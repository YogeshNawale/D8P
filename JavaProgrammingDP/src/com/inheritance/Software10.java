package com.inheritance;

public class Software10 extends Item10 {

	private String version;
	
	public Software10() {
		super();
		version="";
		
	}
	public Software10(String title, String publisher, MyDate1 dop, String ISBN, double price,String version) {
		super(  title, publisher, dop, ISBN, price);
		this.version = version;
		
	}
	
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	@Override
	public String toString() {
		return super.toString()+"Software10 [version=" + version + "]";
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
