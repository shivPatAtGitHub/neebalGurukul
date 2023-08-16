package com.neebal.entities;

import javax.persistence.*;


import java.util.Set;

@Entity
@Table(name = "exams")
public class Exam {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = true, unique = true)
    private String name;


    @Column(nullable = true)
    private Double duration;


    @Column(nullable = true)
    private Long totalMarks;

    @OneToMany(mappedBy = "exam")
    private Set<ExamQuestion> examQuestionSet;

    @OneToMany(mappedBy = "exam")
    private Set<StudentExam> studentExamSet;

    public Exam() {
    }

    public Exam(String name, Double duration, Long totalMarks) {
        this.name = name;
        this.duration = duration;
        this.totalMarks = totalMarks;
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

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }

    public Long getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(Long totalMarks) {
        this.totalMarks = totalMarks;
    }

    public Set<ExamQuestion> getExamQuestionSet() {
        return examQuestionSet;
    }

    public void setExamQuestionSet(Set<ExamQuestion> examQuestionSet) {
        this.examQuestionSet = examQuestionSet;
    }

    public Set<StudentExam> getStudentExamSet() {
        return studentExamSet;
    }

    public void setStudentExamSet(Set<StudentExam> studentExamSet) {
        this.studentExamSet = studentExamSet;
    }

    @Override
    public String toString() {
        return "Exam{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", duration=" + duration +
                ", totalMarks=" + totalMarks +
                '}';
    }
}






