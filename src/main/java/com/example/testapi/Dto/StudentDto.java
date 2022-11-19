package com.example.testapi.Dto;

import com.example.testapi.entity.Student;
import lombok.Data;

@Data
public class StudentDto {
    private String studentId;
    private String firstName;
    private String lastName;
    private int year;

    public StudentDto(Student entity) {
        this.studentId = entity.getStudentId();
        this.firstName = entity.getFirstName();
        this.lastName = entity.getLastName();
        this.year = entity.getYear();
    }

    public StudentDto(String s, String jon, String snow, int i) {
    }

    public StudentDto() {

    }
}