package com.hamburg.springtekrar.dao.repo;

import com.hamburg.springtekrar.dao.entity.TeacherEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepo extends JpaRepository<TeacherEntity,Long> {
}
