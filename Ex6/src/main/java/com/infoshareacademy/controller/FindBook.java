package com.infoshareacademy.controller;

import com.infoshareacademy.repository.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FindBook {

    private final Books books;

    @Autowired
    public FindBook(Books books) {
        this.books = books;
    }

    @GetMapping("book/{title}/search")
    public ModelAndView findByTitle(@PathVariable(name = "title") String searchingTitle){
        ModelAndView modelAndView = new ModelAndView("founded_books");
        modelAndView.addObject("foundedBooksByTitle", books.findBooksByTitle(searchingTitle));
        return modelAndView;
    }

}
