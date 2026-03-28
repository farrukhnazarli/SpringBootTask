package com.hamburg.springtekrar.dao.repo;

import com.hamburg.springtekrar.dao.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<StudentEntity,Long> {
}
