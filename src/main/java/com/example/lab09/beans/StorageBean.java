package com.example.lab09.beans;

import com.example.lab09.entities.Book;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Named
@ApplicationScoped
public class StorageBean {
    @Getter
    private List<Book> books;

    @PostConstruct
    public void init(){
        books = new ArrayList<>();
    }


}
