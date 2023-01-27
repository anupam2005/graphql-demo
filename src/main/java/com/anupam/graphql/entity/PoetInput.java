package com.anupam.graphql.entity;

import lombok.Data;

@Data
public class PoetInput {

    private String name;
    private String genre;
    private String language;
    private int noOfBooksWritten;
}
