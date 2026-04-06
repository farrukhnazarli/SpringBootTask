package com.hamburg.springtekrar.mapper;

import com.hamburg.springtekrar.dao.entity.StudentEntity;
import com.hamburg.springtekrar.dto.request.StudentRequest;
import com.hamburg.springtekrar.dto.response.StudentResponse;

public class StudentMapper {


    public static StudentEntity toEntity(StudentRequest request) {
        return StudentEntity.builder()
                .name(request.getName())
                .age(request.getAge())
                .gpa(request.getGpa())
                .build();
    }


    public static StudentResponse toResponse(StudentEntity studentEntity) {
       return StudentResponse.builder()
                .name(studentEntity.getName())
                .age(studentEntity.getAge())
                .gpa(studentEntity.getGpa())

                .build();
    }
}
