package com.training.classes;

import com.training.exceptions.MyCustomException;
import com.training.exceptions.RangeCheckException;

public class Book {
	
	private int bookId;
	private String bookName;
	private String authorName;
	private double price;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int bookId, String bookName, String authorName, double price) throws RangeCheckException{
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.authorName = authorName;
		if(price < 100 || price > 500) {
			throw new RangeCheckException("Book price should be in between 100 and 500");
		}
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
	public void setBookName(String bookName) throws MyCustomException{
		boolean check = (bookName == null) ? true : false;
		if(check) {
			try {
				throw new NullPointerException();
			} catch (Exception e) {
				throw new MyCustomException("Book Name is Empty", e);
			}
		}
		else {
			this.bookName = bookName;
		}
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price){
		
		int check = (price < 100 || price > 500) ? 1 : 0;
		if(check == 1) {
			try {
				throw new RangeCheckException("Price should be in between 100 to 500");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		else {
			this.price = price;
		}
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", authorName=" + authorName + ", price=" + price
				+ "]";
	}
	
}
