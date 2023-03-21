package com.example.lab09.dao;

import com.example.lab09.entities.Book;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.List;

@Stateless
public class BookDao {
    @PersistenceContext()
    private EntityManager em;
    public List<Book> findAll(){
        return em.createNamedQuery("Book.findAll", Book.class).getResultList();
    }

    public List authorSortByYearAscending(String author){
        Query query =  em.createNamedQuery("Book.authorSortByYearAscending", Book.class);
        query.setParameter("author", author);
        return query.getResultList();
    }

    public List byPublishing(String publishing){
        Query query =  em.createNamedQuery("Book.byPublish", Book.class);
        query.setParameter("publish", publishing);
        return query.getResultList();
    }

    public List afterYear(int year){
        Query query = em.createNamedQuery("Book.afterYear", Book.class);
        query.setParameter("year", year);
        return query.getResultList();
    }

    public List authorList(){
        return em.createNamedQuery("Book.authorList", Book.class).getResultList();
    }

    public List publishingByNotDuplicate(){
        return  em.createNamedQuery("Book.publishingByNotDuplicate", Book.class).getResultList();
    }
    public List sortByPublish(){
        return em.createNamedQuery("Book.sortByPublish", Book.class).getResultList();
    }
}
