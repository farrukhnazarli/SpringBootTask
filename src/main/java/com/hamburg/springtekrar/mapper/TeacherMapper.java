package com.hamburg.springtekrar.mapper;

import com.hamburg.springtekrar.dao.entity.TeacherEntity;
import com.hamburg.springtekrar.dto.request.TeacherRequest;
import com.hamburg.springtekrar.dto.response.TeacherResponse;

public class TeacherMapper {
    public  static TeacherEntity toEntity (TeacherRequest teacherRequest){
       return TeacherEntity.builder()
                .name(teacherRequest.getName())
                .age(teacherRequest.getAge())
                .numberOfStudents(teacherRequest.getNumberOfStudents())

                .build();
    }
        public  static TeacherResponse toResponse (TeacherEntity teacherEntity){
        return TeacherResponse.builder()
                .name(teacherEntity.getName())
                .age(teacherEntity.getAge())
                .numberOfStudents(teacherEntity.getNumberOfStudents())
                .build();
        }
}
