package com.docker.controller;

import com.docker.model.Student;
import com.docker.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;
    @GetMapping
    public ResponseEntity getStudent(){
        return new ResponseEntity(studentService.getallStudent(), HttpStatus.OK);
    }

    @GetMapping("/load")
    public ResponseEntity loadStudent(){
        return new ResponseEntity(studentService.loadallStudent(), HttpStatus.OK);
    }

    @GetMapping("/m")
    public ResponseEntity loadm(){
        return new ResponseEntity("amnoj", HttpStatus.OK);
    }
}
