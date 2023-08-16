package com.neebal.entities;

import javax.persistence.*;

@Entity
@Table(name = "questions_options")
public class QuestionOption {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String questionOption;

    @Column(nullable = false)
    private Boolean correctAnswer;

   @ManyToOne
    private Question question;

    public QuestionOption() {
    }

    public QuestionOption(String option, Boolean correctAnswer) {
        this.questionOption = option;
        this.correctAnswer = correctAnswer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestionOption() {
        return questionOption;
    }

    public void setQuestionOption(String questionOption) {
        this.questionOption = questionOption;
    }

    public Boolean getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(Boolean correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

   public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    @Override
    public String toString() {
        return "Question_Option{" +
                "id=" + id +
                ", option='" + questionOption + '\'' +
                ", correctAnswer=" + correctAnswer +
                ", question=" + question +
                '}';
    }
}
