package com.example.lab09.beans;

import com.example.lab09.entities.Book;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import lombok.Data;

import java.io.Serializable;

@Data
@Named
@SessionScoped
public class BookBean implements Serializable {

    @Inject
    private StorageBean storageBean;
    private Book book = new Book();

    public String sayHello() {
        return "hello";
    }
    public void add(){
        //check book
        if(book.correctFieldData()) {
            storageBean.getBooks().add(book);
            book = new Book();
        }
        else{
            //to do: incorrect data case
        }

    }
}
