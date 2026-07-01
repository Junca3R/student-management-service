package com.ms_students.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ms_students.model.Grade;
import com.ms_students.repository.GradeRepository;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Service
@Data
@RequiredArgsConstructor

public class GradeServiceImpl implements GradeService {

    private final GradeRepository gradeRepository;

    @Override
    public List<Grade> getAllGrades() {
        return gradeRepository.findAll();
    }


    @Override

    public Grade getGradeById(Long id) {
        return gradeRepository.findById(id)
        .orElseThrow(() -> new RuntimeException("Grade not found with id: " + id));
        
    }

    @Override
    public Grade createGrade(Grade grade) {
        return gradeRepository.save(grade);
    }

    @Override
    public Grade updateGrade(Long id, Grade grade) {
        Grade existingGrade = gradeRepository.findById(id)
        .orElseThrow(() -> new RuntimeException("Grade not found with id: " + id));
    
        return gradeRepository.save(existingGrade); 
    }

    @Override
    public Grade deleteGrade(Long id) {
        Grade existingGrade = gradeRepository.findById(id)
        .orElseThrow(() -> new RuntimeException("Grade not found with id: " + id));
        gradeRepository.delete(existingGrade);
        return existingGrade;
    }

}


    

