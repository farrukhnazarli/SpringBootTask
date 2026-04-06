package com.hamburg.springtekrar.service;

import com.hamburg.springtekrar.dao.entity.TeacherEntity;
import com.hamburg.springtekrar.dao.repo.TeacherRepo;
import com.hamburg.springtekrar.dto.request.TeacherRequest;
import com.hamburg.springtekrar.dto.response.TeacherResponse;
import com.hamburg.springtekrar.mapper.TeacherMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class TeacherServiceImpl implements TeacherService {

    private final TeacherRepo teacherRepo;

    @Override
    public TeacherResponse saveTeacher(TeacherRequest teacherRequest) {
        TeacherEntity entity = TeacherMapper.toEntity(teacherRequest);
        teacherRepo.save(entity);

        TeacherResponse response = TeacherMapper.toResponse(entity);
        return response;
    }
}
