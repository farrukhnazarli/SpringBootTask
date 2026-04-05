package com.hamburg.springtekrar.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
//@Builder
public class StudentResponse {

    String name;

    int age;

    double gpa;

}
