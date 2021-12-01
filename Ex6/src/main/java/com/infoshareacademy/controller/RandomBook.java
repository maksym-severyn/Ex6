package com.infoshareacademy.controller;

import com.infoshareacademy.repository.Books;
import com.infoshareacademy.util.Randomizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RandomBook {

    private final Books books;
    private final Randomizer randomizer;

    @Autowired
    public RandomBook(Books books, Randomizer randomizer) {
        this.books = books;
        this.randomizer = randomizer;
    }

    @GetMapping("book-for-today")
    public ModelAndView getRandomBook() {
        int bookNumberToChoose = randomizer.getRandomNumberFromOneTo(books.getBooks().size());
        ModelAndView modelAndView = new ModelAndView("random_book");
        modelAndView.addObject("selected_random_book", books.getBooks().get(bookNumberToChoose - 1));
        return modelAndView;
    }
}