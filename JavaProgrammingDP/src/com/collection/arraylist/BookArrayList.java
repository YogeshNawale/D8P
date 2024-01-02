package com.collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

class Book {
	int bookId;
	String bookName;
	String bookAuthor;
	double price;

	public Book() {

	}

	public Book(int id, String name, String author, double price) {
		bookId = id;
		this.bookName = name;
		this.bookAuthor = author;
		this.price = price;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookAuthor=" + bookAuthor + ", price=" + price
				+ "]";
	}

}

public class BookArrayList {

	public static void main(String[] args) {
		Book b1 = new Book(101, "Java Development", "Rayn Gosling", 1500);
		Book b2 = new Book(102, "OCA Java SE 8", "Kathy Sierra", 1000);
		Book b3 = new Book(103, "Java The Complete Reference", "Herbert Schildt", 1200);
		Book b4 = new Book(104, "Core Java An Integrated Approach", " Dr. R. Nageswara Rao", 1100);
		Book b5 = new Book(105, "Head First Java", "Kathy Sierra", 900);

		ArrayList<Book> bl = new ArrayList<>();
		bl.add(b1);
		bl.add(b2);
		bl.add(b3);
		bl.add(b4);
		bl.add(b5);

		Iterator<Book> itr = bl.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		for (int i = 0; i < bl.size(); i++) {
			int count = 0;

			for (int j = 0; j < bl.size(); j++) {
				if (bl.get(i).bookAuthor.equals(bl.get(j).bookAuthor) && j < i) {
					break;
				} else if (bl.get(i).bookAuthor.equals(bl.get(j).bookAuthor)) {
					count++;
				}
			}
			if (count > 0)
				System.out.println(bl.get(i).bookAuthor + " Count is " + count);

		}
//		for (int i = 0; i < bl.size(); i++) {
//			int flag = 0;
//			int count = 0;
//
//			for (int j = i + 1; j <bl.size(); j++) {
//				if (bl.get(i).bookAuthor.equals(bl.get(j).bookAuthor)) {
//					flag = 1;
//					break;
//				}
//			}
//
//			if (flag == 1)
//				continue;
//
//			for (int j = 0; j <= i; j++) {
//				if (bl.get(i).bookAuthor == bl.get(j).bookAuthor)
//					count++;
//			}
//			System.out.println(bl.get(i).bookAuthor + " Count is " + count);
//		}

	}
}
