package com.neebal.entities;

import javax.persistence.*;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "students_exams")
public class StudentExam implements Serializable {

    @Id
    @ManyToOne
    private Exam exam;

    @Id
    @ManyToOne
    private Student student;

    @Column(nullable = true)
    private Long score;

    @Temporal(TemporalType.DATE)
    @Column(nullable = true)
    private Date date;


    public StudentExam() {
    }

    public StudentExam(Exam exam, Student student, Long score, Date date) {
        this.exam = exam;
        this.student = student;
        this.score = score;
        this.date = date;
    }

    public Exam getExam() {
        return exam;
    }

    public void setExam(Exam exam) {
        this.exam = exam;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Long getScore() {
        return score;
    }

    public void setScore(Long score) {
        this.score = score;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "StudentExam{" +
                "exam=" + exam +
                ", student=" + student +
                ", score=" + score +
                ", date=" + date +
                '}';
    }
}
