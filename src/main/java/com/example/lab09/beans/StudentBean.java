package com.example.lab09.beans;

import com.example.lab09.entities.Student;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import lombok.Data;

import java.io.Serializable;

@Data
@Named
@SessionScoped
public class StudentBean implements Serializable {

    @Inject
    private StorageBean storageBean;
    private Student student = new Student();

    public String sayHello() {
        return "hello";
    }
    public void add(){
        //check student
        if(student.correctFieldData()) {
            storageBean.getStudents().add(student);
            student = new Student();
        }
        else{
            //to do: incorrect data case
        }

    }
}
