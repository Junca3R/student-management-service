package com.ms_students.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ms_students.model.Student;
import com.ms_students.repository.StudentRepository;

import lombok.Data;
import lombok.RequiredArgsConstructor;



@Data
@Service
@RequiredArgsConstructor
public class StudentsServiceImpl implements StudentService {// implementa el metodo definido en la interfaz StudentService

private final StudentRepository studentRepository;


@Override
public List<Student> getAllStudents() {
    return studentRepository.findAll();

}

@Override
public Student getStudentById(Long id) {
    return studentRepository.findById(id)
    .orElseThrow(() -> new RuntimeException("Student not found with id: " + id));
}

@Override
public Student createStudent(Student student) {
    return studentRepository.save(student);
}

@Override
public Student updateStudent(Long id, Student student) {
    Student existingStudent = studentRepository.findById(id)
    .orElseThrow(() -> new RuntimeException("Student not found with id: " + id));
    return studentRepository.save(existingStudent);
}

@Override
public Student deleteStudent(Long id) {
    Student existingStudent = studentRepository.findById(id)
    .orElseThrow(() -> new RuntimeException("Student not found with id: " + id));
    studentRepository.delete(existingStudent);
    return existingStudent;
}


    
}
