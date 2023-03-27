package com.example.ocspreparation.repository;

import com.example.ocspreparation.collection.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, Integer> {
}
