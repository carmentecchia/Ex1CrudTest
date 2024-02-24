package com.example.Ex1CrudTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1")
public class StudentController {
    @Autowired
    StudentRepository studentRepository;
    @Autowired
    private StudentService studentService;

    @PutMapping("/add")
    public void createStudent(@RequestBody Student student){
        studentRepository.save(student);
    }

    @GetMapping("/list")
    public List<Student> getLista(){
        return studentRepository.findAll();
    }

    @GetMapping("/getStudent/{id}")
    public Student getStudent(@PathVariable Long id){
        Optional<Student> student = studentRepository.findById(id);
        if (student.isPresent()){
            return student.get();
        }else {
            return null;
        }
    }
    @PutMapping("/updateStudent/{id}")
    public void updateStudent(@PathVariable Long id,@RequestBody Student student ){
        student.setId(id);
        studentRepository.save(student);
    }
    @PutMapping("/{id}/working")
    public void setIsWorking(@PathVariable Long id, @PathVariable boolean working){
        studentService.setIsWorking(id,working);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteStudent(@PathVariable Long id){
        studentRepository.deleteById(id);
    }
}