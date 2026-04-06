package com.hamburg.springtekrar.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TeacherResponse {
    String name;
    int age;
    int numberOfStudents;
}
