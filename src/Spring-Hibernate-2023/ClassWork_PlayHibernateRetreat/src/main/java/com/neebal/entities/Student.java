package com.neebal.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "students")
public class Student extends Person{

    @Column(nullable = true)
    private Integer roll;

    @OneToMany(mappedBy = "student")
    private Set<StudentExam> studentExamSet;


    public Set<BookStudent> getBooksIssued() {
        return booksIssued;
    }

    public void setBooksIssued(Set<BookStudent> booksIssued) {
        this.booksIssued = booksIssued;
    }

    @OneToMany(mappedBy = "student")
    private Set<BookStudent> booksIssued;


    public Student() {
    }

    public Student(String name, Character gender,Integer roll) {
        super(name,gender);
        this.roll = roll;
    }


    public Integer getRoll() {
        return roll;
    }

    public void setRoll(Integer roll) {
        this.roll = roll;
    }

    public Set<StudentExam> getStudentExamSet() {
        return studentExamSet;
    }

    public void setStudentExamSet(Set<StudentExam> studentExamSet) {
        this.studentExamSet = studentExamSet;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }
}
