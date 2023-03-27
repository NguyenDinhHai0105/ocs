package com.example.ocspreparation.service;

import com.example.ocspreparation.collection.Book;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface BookService {
    public ResponseEntity<Book> saveBook(Book book);
    public ResponseEntity<List<Book>> getAllBook();
    public ResponseEntity<String> deleteBook(int id);
}
