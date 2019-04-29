package com.example.abhinav;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="http://localhost:1111", maxAge=3600)
@RequestMapping("book")
public class UserController {
	
	@Autowired
	private Service service;
	
	@PostMapping
	public Book saveBook(@RequestBody Book book) {
		return service.saveBook(book);
		
	}
	
	@GetMapping("/all")
	public List<Book> getAllBooks(){
		
		return service.getAll();
	}
	
	@DeleteMapping("/{id}")
	public void deleteBook(@PathVariable("id") String id) {
		service.deleteBook(id);
	}
	
	

}
