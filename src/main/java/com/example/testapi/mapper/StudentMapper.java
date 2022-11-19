package com.example.testapi.mapper;

import com.example.testapi.Dto.StudentDto;
import com.example.testapi.entity.Student;

public class StudentMapper {

    public StudentDto toDto(Student entity) {
        StudentDto dto = new StudentDto();
        dto.setStudentId(entity.getStudentId());
        dto.setFirstName(entity.getFirstName());
        dto.setLastName(entity.getLastName());
        dto.setYear(entity.getYear());

        return dto;
    }

    public Student toEntity(StudentDto dto) {
        Student entity = new Student();
        entity.setStudentId(dto.getStudentId());
        entity.setFirstName(dto.getFirstName());
        entity.setLastName(dto.getLastName());
        entity.setYear(dto.getYear());

        return entity;
    }
}