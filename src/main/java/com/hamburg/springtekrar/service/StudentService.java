package com.hamburg.springtekrar.service;


import com.hamburg.springtekrar.dto.request.StudentRequest;
import com.hamburg.springtekrar.dto.response.StudentResponse;

import java.util.List;

public interface StudentService {

    StudentResponse save(StudentRequest studentRequest);

    StudentResponse getStudentById(Long id);

    List<StudentResponse> getAllStudents();

    String deleteById(Long id);

    StudentResponse updateById(Long id,StudentRequest request);

}
