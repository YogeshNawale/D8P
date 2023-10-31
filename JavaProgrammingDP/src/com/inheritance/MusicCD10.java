package com.inheritance;

public class MusicCD10 extends Item10 {

	private String artist;
	private String volume;
	
	public MusicCD10() {
		artist="";
		volume="";
	}
	public MusicCD10(String title, String publisher, MyDate1 dop, String ISBN, double price,String artist, String volume) {
		super(  title, publisher, dop, ISBN, price);
		this.artist = artist;
		this.volume = volume;
	}
	
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getVolume() {
		return volume;
	}
	public void setVolume(String volume) {
		this.volume = volume;
	}
	
	@Override
	public String toString() {
		return super.toString()+"MusicCD [artist=" + artist + ", volume=" + volume + "]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
