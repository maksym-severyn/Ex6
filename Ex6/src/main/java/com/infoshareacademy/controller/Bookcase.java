package com.infoshareacademy.controller;

import com.infoshareacademy.repository.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Bookcase {

    private final Books books;

    @Autowired
    public Bookcase(Books books) {
        this.books = books;
    }

    @GetMapping("books")
    public ModelAndView displayBooks() {
        ModelAndView modelAndView = new ModelAndView("books");
        modelAndView.addObject("allBooks", books.getBooks());
        return modelAndView;
    }

}
