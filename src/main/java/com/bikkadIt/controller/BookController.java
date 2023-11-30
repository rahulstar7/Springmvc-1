package com.bikkadIt.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bikkadIt.model.Book;

@Controller
public class BookController {

	@GetMapping("/getBookData")
	public String getBookData(Model model) {
		
		Book bookdata=new Book(001,"Java SPring Boot",999.00);
		
		
		return "book";
	}
	
	@GetMapping("/books")
	public ModelAndView getAllBookData() {
		
		Book bookdata=new Book(111,"Spring",450.00);
		Book bookdata1=new Book(222,"Hibernate",550.00);
		Book bookdata2=new Book(333,"Core Java",600.00);
		List<Book> listbook=new ArrayList<>();
		listbook.add(bookdata);
		listbook.add(bookdata1);
		listbook.add(bookdata2);
		
		ModelAndView m=new ModelAndView();
		m.addObject("listbook",listbook);
		m.setViewName("books");
		
		return m;
	}
	
	
	
}
