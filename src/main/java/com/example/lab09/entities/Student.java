package com.example.lab09.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private int id;
    private String name;
    private String surname;
    private String patronymic;
    private String birthDate;
    private String address;
    private String mobilePhone;
    private String faculty;
    private int course;
    private String clas;

    public boolean correctFieldData(){
        boolean results = true;
        if(course<0 || course>6) results = false;
        if(birthDate.length() == 10) {
            if (birthDate.charAt(2) != '/' || birthDate.charAt(5) != '/' ||
                    birthDate.charAt(0) < '0' || birthDate.charAt(0) > '9' ||
                    birthDate.charAt(1) < '0' || birthDate.charAt(1) > '9' ||
                    birthDate.charAt(3) < '0' || birthDate.charAt(3) > '9' ||
                    birthDate.charAt(4) < '0' || birthDate.charAt(4) > '9' ||
                    birthDate.charAt(6) < '0' || birthDate.charAt(6) > '9' ||
                    birthDate.charAt(7) < '0' || birthDate.charAt(7) > '9' ||
                    birthDate.charAt(8) < '0' || birthDate.charAt(8) > '9' ||
                    birthDate.charAt(9) < '0' || birthDate.charAt(9) > '9') results = false;
        }
        return results;
    }
}
