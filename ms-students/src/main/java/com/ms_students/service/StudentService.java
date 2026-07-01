package com.ms_students.service;

import java.util.List;

import com.ms_students.model.Student;

public interface StudentService {
List<Student> getAllStudents();
    Student getStudentById(Long id);
    Student createStudent(Student student);
    Student updateStudent(Long id, Student student);
    Student deleteStudent(Long id);








}
