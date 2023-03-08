package com.example.lab09.beans;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

import com.example.lab09.entities.Student;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Named
@ApplicationScoped
public class StorageBean {
    @Getter
    private List<Student> students;

    @PostConstruct
    public void init(){
        students = new ArrayList<>();
    }


}
