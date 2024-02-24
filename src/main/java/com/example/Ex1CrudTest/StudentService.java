package com.example.Ex1CrudTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    public void setIsWorking(Long id, boolean isWorking){
        Optional<Student> student=studentRepository.findById(id);
        if (!student.isPresent()) return;
        student.get().setWorking(isWorking);
        studentRepository.save(student.get());
    }
}
