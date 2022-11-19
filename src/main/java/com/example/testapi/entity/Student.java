package com.example.testapi.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String studentId;
    private String firstName;
    private String lastName;
    private int year;

    public Student(String s, String jon, String snow, int i) {
    }

    public Student() {

    }
}