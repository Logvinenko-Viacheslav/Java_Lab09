package com.example.lab09.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    private int id;
    private String title;
    private String author;
    private String publisher;
    private int publicationYear;
    private int numberPages;
    private double price;

    public boolean correctFieldData(){
        boolean results = true;
        if(numberPages<1 || price<0) results = false;
        if(title.length()==0) results = false;
        return results;
    }
}
