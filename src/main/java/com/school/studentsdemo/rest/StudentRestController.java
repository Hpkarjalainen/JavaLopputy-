package com.school.studentsdemo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.school.studentsdemo.data.Student;
import com.school.studentsdemo.service.StudentService;

@RestController
public class StudentRestController {

    //riippuvuusinjektio, dependency injection
    StudentService sc;
    @Autowired
    public StudentRestController(StudentService sc){
        this.sc = sc;
    }

    @GetMapping("/students")
    public List<Student> getStudents(){
        return sc.getStudents();
    }

    //olisi hyvä palauttaa responseEntity, voi palauttaa myös muuta
    @PostMapping("/student")
    public String addStudent(@RequestBody Student student){
        sc.addStudent(student);
        return "Student added";
    }

    @DeleteMapping("/delstudent")
    public String deleteStudent(@RequestBody Student student){
        sc.removeStudent(student.getId());
        return "Student removed";
    }

    //Huom. palauttaa ResponseEntity
    @GetMapping("/student/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable int id){
        Student s = sc.findStudent(id);

        if(s != null){
            return new ResponseEntity<>(s, HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        



    }
}
