package com.hamburg.springtekrar.service;

import com.hamburg.springtekrar.dto.request.TeacherRequest;
import com.hamburg.springtekrar.dto.response.TeacherResponse;

public interface TeacherService {
    TeacherResponse saveTeacher (TeacherRequest teacherRequest);
}
