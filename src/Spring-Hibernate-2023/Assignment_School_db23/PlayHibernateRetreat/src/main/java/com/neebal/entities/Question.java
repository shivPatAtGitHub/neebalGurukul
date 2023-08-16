package com.neebal.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "questions")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String description;

    @Column(nullable = false)
    private Integer marks;

    @ManyToOne
    private Topic topic;

    @OneToMany(mappedBy = "question", cascade = CascadeType.ALL)
    private Set<QuestionOption> questionOptionSet;

    @OneToMany(mappedBy = "question")
    private Set<ExamQuestion> examQuestionSet;

    public Question() {
    }

    public Question(String description, Integer marks) {
        this.description = description;
        this.marks = marks;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getMarks() {
        return marks;
    }

    public void setMarks(Integer marks) {
        this.marks = marks;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

   public Set<QuestionOption> getQuestionOptionSet() {
        return questionOptionSet;
    }

    public void setQuestionOptionSet(Set<QuestionOption> questionOptionSet) {
        this.questionOptionSet = questionOptionSet;
    }

    public Set<ExamQuestion> getExamQuestionSet() {
        return examQuestionSet;
    }

    public void setExamQuestionSet(Set<ExamQuestion> examQuestionSet) {
        this.examQuestionSet = examQuestionSet;
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", marks=" + marks +
                ", topic=" + topic +
                '}';
    }
}
