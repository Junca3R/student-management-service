package com.ms_students.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ms_students.model.Grade;


@Repository
public interface  GradeRepository extends JpaRepository<Grade, Long> {

    
    
}
