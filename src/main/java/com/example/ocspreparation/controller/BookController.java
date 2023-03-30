package com.example.ocspreparation.controller;

import com.example.ocspreparation.collection.Book;
import com.example.ocspreparation.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookService bookService;
    @GetMapping
    public ResponseEntity<List<Book>> getAllBook(){
        return bookService.getAllBook();
    }

    @PostMapping
    public ResponseEntity<Book> addBook(@RequestBody Book book) {
        return bookService.saveBook(book);
    }

    @GetMapping("/test")
    public String getTestK8s() {
        return "Hai Nguyen Dinh";
    }
}
