package com.hamburg.springtekrar.controller;

import com.hamburg.springtekrar.dto.request.TeacherRequest;
import com.hamburg.springtekrar.dto.response.TeacherResponse;
import com.hamburg.springtekrar.service.TeacherService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/teachers")
@RequiredArgsConstructor
public class TeacherController {

    private  final TeacherService teacherService;

    @PostMapping
    public TeacherResponse saveTeacher (TeacherRequest teacherRequest){
        return teacherService.saveTeacher(teacherRequest);
    }
}
