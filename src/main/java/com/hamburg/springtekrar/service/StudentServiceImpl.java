package com.hamburg.springtekrar.service;

import com.hamburg.springtekrar.dao.entity.StudentEntity;
import com.hamburg.springtekrar.dao.repo.StudentRepo;
import com.hamburg.springtekrar.dto.request.StudentRequest;
import com.hamburg.springtekrar.dto.response.StudentResponse;
import com.hamburg.springtekrar.exception.NotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public StudentResponse getStudentById(Long id) {

        StudentEntity entity = repo.findById(id).orElseThrow(()
                -> new NotFoundException("Student not found with this id!"));

        StudentResponse studentResponse = new StudentResponse();

        studentResponse.setName(entity.getName());
        studentResponse.setAge(entity.getAge());
        studentResponse.setGpa(entity.getGpa());

        return studentResponse;
    }

    public List<StudentResponse> getAllStudents() {


        List<StudentEntity> entities = repo.findAll();

        List<StudentResponse> responses = entities.stream().map(entity -> mapper(entity)).toList();

        return responses;


    }


    //Mapper ucun
    public StudentResponse mapper(StudentEntity studentEntity) {
        StudentResponse studentResponse = new StudentResponse();

        studentResponse.setName(studentEntity.getName());
        studentResponse.setAge(studentEntity.getAge());
        studentResponse.setGpa(studentEntity.getGpa());

        return studentResponse;
    }

    public String deleteById(Long id) {

        repo.deleteById(id);
        return "Deleted successfully!";

    }

    public StudentResponse updateById(Long id, StudentRequest request) {

        StudentEntity student = repo.findById(id).orElseThrow(()
                -> new NotFoundException("Student not found with this id!"));

        student.setName(request.getName());
        student.setAge(request.getAge());
        student.setGpa(request.getGpa());

        repo.save(student);

        StudentResponse studentResponse=new StudentResponse();

        studentResponse.setName(student.getName());
        studentResponse.setAge(student.getAge());
        studentResponse.setGpa(student.getGpa());

        return studentResponse;
    }


}
