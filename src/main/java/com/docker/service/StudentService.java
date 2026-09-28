package com.docker.service;

import com.docker.model.Student;
import com.docker.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;
    public List<Student> getallStudent() {
        return studentRepository.findAll();
    }

    public String loadallStudent() {
        Student st1=new Student();
        st1.setName("manoj");
        st1.setAge(21);

        Student st2=new Student();
        st2.setAge(18);
        st2.setName("srinitha");

        List<Student> students=new ArrayList<>(List.of(st1,st2));
        studentRepository.saveAll(students);
        return "success";
    }
}
