package com.inheritance;

public class Book10 extends Item10{

	private String author;
	private int edition;
	private String volume;
	
	public Book10() {
		super();
		author="";
		edition=0;
		volume="";
	}
	public Book10(String title, String publisher, MyDate1 dop, String ISBN, double price,String author, int edition, String volume) {
		super(  title, publisher, dop, ISBN, price);
		this.author = author;
		this.edition = edition;
		this.volume = volume;
	}
	
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getEdition() {
		return edition;
	}
	public void setEdition(int edition) {
		this.edition = edition;
	}
	public String getVolume() {
		return volume;
	}
	public void setVolume(String volume) {
		this.volume = volume;
	}
	@Override
	public String toString() {
		return super.toString()+"Book [author=" + author + ", edition=" + edition + ", volume=" + volume + "]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
