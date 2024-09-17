package com.amigos.areac.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

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


    public void addNewStudent(Student student) {
        Optional<Student> studentOptional = StudentRepostory.findStudentByEmail(student.getEmail());
        if(studentOptional.isPresent())
        {
            throw new IllegalStateException("The email already in use ..!");
        }

         studentRepostory.save(student);

    }


}


