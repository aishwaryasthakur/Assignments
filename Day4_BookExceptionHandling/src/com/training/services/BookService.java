package com.training.services;

import java.util.NoSuchElementException;

import com.training.classes.Book;

public class BookService {
	
	Book bookList [] = new Book[10];

	public int addBook(Book book, int index) {
		bookList[index] = book;
		return index+1;
	}
	
	public Book getOne(int bookId) throws NoSuchElementException{
		
		for(int i=0; i < bookList.length; i++) {
			if(bookList[i].getBookId() == bookId) {
				return bookList[i];
			}
		}
		throw new NoSuchElementException();
	}
	
	public Book[] getAll() {
		return bookList;
	}

}
