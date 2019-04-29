package com.example.abhinav;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;

@org.springframework.stereotype.Service
public class Service {
	
	@Autowired
	private UserRepo urepo;
	@Autowired
	private BookRepo brepo;;
	
	public Book saveBook(Book book) {
		return brepo.save(book);
	}
	
	
	public void deleteBook(String id) {
		 brepo.deleteById(id);
	}
	

	
	public List<Book> getAll() {
		List<Book> books = new ArrayList<>();
 		 brepo.findAll().forEach(books::add);
 		 return books;
	}

}
