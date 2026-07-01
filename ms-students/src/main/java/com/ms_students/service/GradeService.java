package com.ms_students.service;

import java.util.List;

import com.ms_students.model.Grade;

public interface GradeService {
    List <Grade> getAllGrades();
    Grade getGradeById(Long id);
    Grade createGrade(Grade grade);
    Grade updateGrade(Long id, Grade grade);
    Grade deleteGrade(Long id);
}
