package com.example.lab09.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "books")
@NamedQueries({
        @NamedQuery(name = "Book.findAll", query = "select b from Book b"),
        @NamedQuery(name = "Book.authorSortByYearAscending", query = "select b from Book b WHERE b.author = :author order by b.publicationYear asc"),
        @NamedQuery(name = "Book.byPublish", query = "select b from Book b WHERE b.publisher = :publish"),
        @NamedQuery(name = "Book.afterYear", query = "select b from Book b WHERE b.publicationYear > :year"),
        @NamedQuery(name = "Book.authorList", query = "select b.author from Book b order by b.author asc"),
        @NamedQuery(name = "Book.publishingByNotDuplicate", query = "select distinct b.publisher from Book b"),
        @NamedQuery(name = "Book.sortByPublish", query = "select b from Book b order by b.publisher"),
})
public class Book {
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Size(max = 100)
    @Column(name = "Title", length = 100)
    private String title;

    @Size(max = 100)
    @Column(name = "Author", length = 100)
    private String author;

    @Size(max = 100)
    @Column(name = "Publisher", length = 100)
    private String publisher;

    @Column(name = "PublicationYear")
    private Integer publicationYear;

    @Column(name = "`Number of Pages`")
    private Integer numberOfPages;

    @Column(name = "Price")
    private Double price;

}