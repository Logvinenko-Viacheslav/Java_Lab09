package com.example.lab09.beans;

import com.example.lab09.entities.Book;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Named
@ApplicationScoped
public class StorageBean {
    @Getter
    @Setter
    private List<Book> books;

    @Getter
    @Setter
    private String userInput="";
    @Getter
    @Setter
    private String userChoice="";

    @PostConstruct
    public void init(){
        books = new ArrayList<>();
    }

    public void setAuthors(List<String> authors){
        books = new ArrayList<Book>();
        Iterator<String> iterator = authors.listIterator();
        while(iterator.hasNext()){
            Book tmp = new Book();
            tmp.setAuthor(iterator.next());
            books.add(tmp);
        }
    }
    public void setPublishing(List<String> publishing){
        books = new ArrayList<Book>();
        Iterator<String> iterator = publishing.listIterator();
        while(iterator.hasNext()){
            Book tmp = new Book();
            tmp.setPublisher(iterator.next());
            books.add(tmp);
        }
    }
}
