package com.hamburg.springtekrar.service;


import com.hamburg.springtekrar.dto.request.StudentRequest;
import com.hamburg.springtekrar.dto.response.StudentResponse;

public interface StudentService {

    StudentResponse save(StudentRequest studentRequest);
}
