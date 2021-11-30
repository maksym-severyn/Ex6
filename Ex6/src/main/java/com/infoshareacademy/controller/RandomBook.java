package com.infoshareacademy.controller;

import com.infoshareacademy.domain.Book;
import com.infoshareacademy.repository.Books;
import com.infoshareacademy.util.Randomizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class RandomBook {

    private final Books books;
    private final Randomizer randomizer;

    @Autowired
    public RandomBook(Books books, Randomizer randomizer) {
        this.books = books;
        this.randomizer = randomizer;
    }

    @GetMapping("book-for-today")
    public Book getRandomBook() {
        int bookNumberToChoose = randomizer.getRandomNumberFromOneTo(books.getBooks().size());
        return books.getBooks().get(bookNumberToChoose - 1);
    }
}