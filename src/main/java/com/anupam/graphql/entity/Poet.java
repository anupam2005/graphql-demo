package com.anupam.graphql.entity;


import jakarta.annotation.Generated;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
@Table(name = "poet_table")
@Data
public class Poet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String genre;
    private String language;
    private int noOfBooksWritten;
}
