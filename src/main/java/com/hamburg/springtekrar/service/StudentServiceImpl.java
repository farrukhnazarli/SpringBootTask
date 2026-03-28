package com.hamburg.springtekrar.service;

import com.hamburg.springtekrar.dao.entity.StudentEntity;
import com.hamburg.springtekrar.dao.repo.StudentRepo;
import com.hamburg.springtekrar.dto.request.StudentRequest;
import com.hamburg.springtekrar.dto.response.StudentResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepo repo;

    @Override
    public StudentResponse save(StudentRequest studentRequest) {

        StudentEntity studentEntity = new StudentEntity();

        studentEntity.setName(studentRequest.getName());
        studentEntity.setAge(studentRequest.getAge());
        studentEntity.setGpa(studentRequest.getGpa());

        StudentEntity entity = repo.save(studentEntity);

        StudentResponse studentResponse = new StudentResponse();
        studentResponse.setName(entity.getName());
        studentResponse.setAge(entity.getAge());
        studentResponse.setGpa(entity.getGpa());

        return studentResponse;

    }
}
