package com.training.classes;

import java.util.NoSuchElementException;

import com.training.exceptions.MyCustomException;
import com.training.services.BookService;

public class Application {
	
	public static void main(String [] args) {
		BookService service = new BookService();
		int index = 0;

		try {
				Book headFirstJava = new Book();
				headFirstJava.setBookId(101);
				headFirstJava.setBookName("a");
				headFirstJava.setAuthorName("XYZ");
				headFirstJava.setPrice(400);
				index = service.addBook(headFirstJava,index);
				
				Book spring = new Book();
				spring.setBookId(102);
				spring.setBookName("spring");
				spring.setAuthorName("WXY");
				spring.setPrice(500);
				index = service.addBook(spring, index);
				
				Book book = service.getOne(11);
				
		} catch (MyCustomException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		try {
			Book book = service.getOne(101);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("eNo such book");
		}
		
		Book[] bookList = service.getAll();
		for(int i = 0 ; i < index; i++)
			System.out.println(bookList[i].toString());
	}

}
