package com.amigos.areac.student;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table
public class Student {

    @Id
    @SequenceGenerator(
            name="student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator ="student_sequence"
    )

    private Long id;
    private String name;
    private String email;
    private Integer phone;
    private LocalDate dob;
    private  Integer age;

    public Student() {

    }

    public Student(
            Long id, String name,
            String email, Integer phone,
            LocalDate dob, Integer age)
    {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.dob = dob;
        this.age = age;
    }

    public Student(String name,
                   String email,
                   Integer phone,
                   LocalDate dob,
                   Integer age)
    {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.dob = dob;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                ", dob=" + dob +
                ", age=" + age +
                '}';
    }

}

