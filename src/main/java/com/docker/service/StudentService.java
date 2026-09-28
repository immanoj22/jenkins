package com.docker.service;

import com.docker.model.Student;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    List<Student> students=new ArrayList<>();
    public String loadallStudent() {
        Student st1=new Student();
        st1.setName("manoj");
        st1.setAge(21);

        Student st2=new Student();
        st2.setAge(18);
        st2.setName("srinitha");

        students.add(st1);
        students.add(st2);

        return "success";
    }

    public Object getallStudent() {
        return students;
    }
}
