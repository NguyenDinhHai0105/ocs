package com.example.ocspreparation.collection;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "book")
@AllArgsConstructor
@Getter
@Setter
public class Book {

    @Id
    private int id;
    private String name;
    private String authorName;
}
