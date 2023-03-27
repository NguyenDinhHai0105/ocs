package com.example.ocspreparation.service.Impl;

import com.example.ocspreparation.collection.Book;
import com.example.ocspreparation.repository.BookRepository;
import com.example.ocspreparation.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookRepository bookRepository;
    @Override
    public ResponseEntity<Book> saveBook(Book book) {
        bookRepository.save(book);
        return ResponseEntity.ok(book);
    }

    @Override
    public ResponseEntity<List<Book>> getAllBook() {
        List<Book> bookList = bookRepository.findAll();
        return ResponseEntity.ok(bookList);
    }

    @Override
    public ResponseEntity<String> deleteBook(int id) {
        bookRepository.deleteById(id);
        return ResponseEntity.ok("book deleted");
    }
}
