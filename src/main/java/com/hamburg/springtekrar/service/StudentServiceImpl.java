package com.hamburg.springtekrar.service;

import com.hamburg.springtekrar.dao.entity.StudentEntity;
import com.hamburg.springtekrar.dao.repo.StudentRepo;
import com.hamburg.springtekrar.dto.request.StudentRequest;
import com.hamburg.springtekrar.dto.response.StudentResponse;
import com.hamburg.springtekrar.exception.NotFoundException;
import com.hamburg.springtekrar.mapper.StudentMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepo repo;

    @Override
    public StudentResponse save(StudentRequest studentRequest) {

        StudentEntity entity = StudentMapper.toEntity(studentRequest);
        repo.save(entity);

        StudentResponse response = StudentMapper.toResponse(entity);

        return response;

    }

    public StudentResponse getStudentById(Long id) {

        StudentEntity studentEntity = repo.findById(id).orElseThrow(()
                -> new NotFoundException("Student can not found!"));

        StudentResponse response = StudentMapper.toResponse(studentEntity);

        return response;

    }

    public List<StudentResponse> getAllStudents() {

        List<StudentEntity> entities = repo.findAll();

        List<StudentResponse> responses = entities.stream().map(entity
                -> StudentMapper.toResponse(entity)).toList();

        return responses;

    }




    public String deleteById(Long id) {

        repo.deleteById(id);

        return "deleted successfully!";

    }

    public StudentResponse updateById(Long id, StudentRequest request) {


        StudentEntity studentEntity = repo.findById(id).orElseThrow(()
                -> new NotFoundException("Student can not found!"));

        studentEntity.setName(request.getName());
        studentEntity.setAge(request.getAge());
        studentEntity.setGpa(request.getGpa());

        repo.save(studentEntity);


        StudentResponse response = StudentMapper.toResponse(studentEntity);

        return response;


    }


}
