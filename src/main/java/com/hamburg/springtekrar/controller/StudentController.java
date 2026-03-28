package com.hamburg.springtekrar.controller;

import com.hamburg.springtekrar.dao.entity.StudentEntity;
import com.hamburg.springtekrar.dto.request.StudentRequest;
import com.hamburg.springtekrar.dto.response.StudentResponse;
import com.hamburg.springtekrar.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//@Controller
@RestController
@RequestMapping("/api/v1/students")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;


    @PostMapping
    public StudentResponse saveStudent(@RequestBody StudentRequest request) {
        return studentService.save(request);
    }

}
