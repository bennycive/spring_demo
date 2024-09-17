package com.amigos.areac.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class StudentService {

    private final StudentRepostory studentRepostory;

    @Autowired
    public StudentService(StudentRepostory studentRepostory) {
        this.studentRepostory = studentRepostory;
    }

    public List<Student> getStudents()
    {
        return studentRepostory.findAll();
    }


}


