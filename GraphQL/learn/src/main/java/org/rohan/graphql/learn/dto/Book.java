package org.rohan.graphql.learn.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    int id;
    String name;
    int pages;
    int authorId;

}
