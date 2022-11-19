package com.example.testapi.TestDto;


import com.example.testapi.Dto.StudentDto;
import com.example.testapi.entity.Student;
import com.example.testapi.mapper.StudentMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentMapperTest {

    @Test
    public void testToEntity() {
        StudentDto dto = new StudentDto("123", "Jon", "Snow", 2450);

        StudentMapper mapper = new StudentMapper();
        Student entity = mapper.toEntity(dto);

        assertEquals(entity.getStudentId(), dto.getStudentId());
        assertEquals(entity.getFirstName(), dto.getFirstName());
        assertEquals(entity.getLastName(), dto.getLastName());
        assertEquals(entity.getYear(), dto.getYear());
    }

    @Test
    public void testToDto() {
        Student entity = new Student("123", "Jon", "Snow", 2450);

        StudentMapper mapper = new StudentMapper();
        StudentDto dto = mapper.toDto(entity);

        assertEquals(dto.getStudentId(), entity.getStudentId());
        assertEquals(dto.getFirstName(), entity.getFirstName());
        assertEquals(dto.getLastName(), entity.getLastName());
        assertEquals(dto.getYear(), entity.getYear());
    }
}


