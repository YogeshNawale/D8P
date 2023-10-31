package com.inheritance;
/*
 * Create Parent class Item and subclass  Book, MusicCD and Software
 */
public class Item10 {

	private String title;
	private String publisher;
	private MyDate1 dop ;
	private String ISBN;
	private double price;
	
	public Item10() {
		title="";
		publisher="";
		dop=new MyDate1();
		ISBN="";
		price=0.0;
	}
	
	public Item10(String title, String publisher, MyDate1 dop, String ISBN, double price) {
		
		this.title=title;
		this.publisher=publisher;
		this.dop=dop;
		this.ISBN=ISBN;
		this.price=price;
	}
	
	
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public MyDate1 getDop() {
		return dop;
	}

	public void setDop(MyDate1 dop) {
		this.dop = dop;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	@Override
	public String toString() {
		return "Item  [title=" + title + ", publisher=" + publisher + ", Date of Publishing=" + dop + ", ISBN=" + ISBN + ", price="
				+ price + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
