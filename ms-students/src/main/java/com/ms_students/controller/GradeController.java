package com.ms_students.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ms_students.model.Grade;
import com.ms_students.service.GradeService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/grades")
@RequiredArgsConstructor
public class GradeController {

    private final GradeService gradeService;

    @GetMapping
    public ResponseEntity<List<Grade>> getAllGrades() {
        return ResponseEntity.ok(gradeService.getAllGrades());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Grade> getGradeById(@PathVariable Long id) {
        return ResponseEntity.ok(gradeService.getGradeById(id));
    }

    @PostMapping
    public ResponseEntity<Grade> createGrade(@RequestBody Grade grade) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(gradeService.createGrade(grade));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Grade> updateGrade(@PathVariable Long id, @RequestBody Grade grade) {
        return ResponseEntity.ok(gradeService.updateGrade(id, grade));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Grade> deleteGrade(@PathVariable Long id) {
        return ResponseEntity.ok(gradeService.deleteGrade(id));
    }
}