package com.example.lab09.beans;

import com.example.lab09.dao.BookDao;
import jakarta.ejb.EJB;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Named
@SessionScoped
public class BookBean implements Serializable {

    @Inject
    private StorageBean storageBean;
    @EJB
    private BookDao bookDao;

    public void process(){
        switch (storageBean.getUserChoice()){
            case "1":
                storageBean.setBooks(bookDao.findAll());
                break;
            case "2":
                storageBean.setBooks(bookDao.authorSortByYearAscending(storageBean.getUserInput()));
                break;
            case "3":
                storageBean.setBooks(bookDao.byPublishing(storageBean.getUserInput()));
                break;
            case "4":
                storageBean.setBooks(bookDao.afterYear(Integer.parseInt(storageBean.getUserInput())));
                break;
            case "5":
                storageBean.setAuthors(bookDao.authorList());
                break;
            case "6":
                storageBean.setPublishing(bookDao.publishingByNotDuplicate());
                break;
            case "7":
                storageBean.setBooks(bookDao.sortByPublish());
                break;
        }
        storageBean.setUserInput("");
    }

}
