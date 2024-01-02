package com.librarymanagementsystem;
/*
 * Create a Book class with the following attributes:

	ISBN (International Standard Book Number, a unique identifier)
	Title
	Author
	Publication Year
	Genre
	Number of Copies Available
 */
public class Book {
	int iSBN; 
	String title;
	String author;
	int publicationYear;
	String genre;
	int numberOfCopiesAvailable;
	
	public Book() {
		iSBN=0; 
		title="";
		author="";
		publicationYear=0;
		genre="";
		numberOfCopiesAvailable=0;
	}
	public Book(int iSBN, String title, String author, int publicationYear,	String genre, 
				int numberOfCopiesAvailable) {
		this.iSBN=iSBN; 
		this.title=title;
		this.author=author;
		this.publicationYear=publicationYear;
		this.genre=genre;
		this.numberOfCopiesAvailable=numberOfCopiesAvailable;
	}

	
	public int getiSBN() {
		return iSBN;
	}
	public void setiSBN(int iSBN) {
		this.iSBN = iSBN;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPublicationYear() {
		return publicationYear;
	}
	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getNumberOfCopiesAvailable() {
		return numberOfCopiesAvailable;
	}
	public void setNumberOfCopiesAvailable(int numberOfCopiesAvailable) {
		this.numberOfCopiesAvailable = numberOfCopiesAvailable;
	}
	
	
	@Override
	public String toString() {
		return "Book [ISBN=" + iSBN + ", Title=" + title + ", Author=" + author + ", Publication Year=" + publicationYear
				+ ", Genre=" + genre + ", Number Of Copies Available=" + numberOfCopiesAvailable + "]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
