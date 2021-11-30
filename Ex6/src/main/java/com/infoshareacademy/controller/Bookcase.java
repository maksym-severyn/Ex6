package com.infoshareacademy.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.infoshareacademy.repository.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class Bookcase {

    private final Books books;

    private final ObjectMapper objectMapper;

    @Autowired
    public Bookcase(Books books, ObjectMapper objectMapper) {
        this.books = books;
        this.objectMapper = objectMapper;
    }

    @GetMapping("books")
    public Books displayBooks() {
        return books;
    }

}
