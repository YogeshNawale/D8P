package com.collection.treemap;



public class Book implements Comparable<Book>{

	private int bid;
	private String bname;
	private double price;

	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(int bid, String bname, double price) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.price = price;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int hashCode() {
		// TODO Auto-generated method stub
		return bid;
	}

	@Override
	public boolean equals(Object obj) {
		Book other= (Book) obj;
		
		if(this.bid==other.bid)
			return true;
		else
			return false;
	}

	
	@Override
	public String toString() {
		return "Book [bid=" + bid + ", bname=" + bname + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		return this.bname.compareTo(o.bname);
	}

}
