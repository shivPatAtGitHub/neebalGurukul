package com.neebal.collegemgmt.entities;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "books_students")
public class BookStudent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Student student;

    @ManyToOne
    private Book book;

    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date issueDate;

    @Temporal(TemporalType.DATE)
    @Column(nullable = true)
    private Date returnDate;

    public BookStudent() {
    }

    public BookStudent(Student student, Book book, Date issueDate) {
        this.student = student;
        this.book = book;
        this.issueDate = issueDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    @Override
    public String toString() {
        return "BookStudent{" +
                "id=" + id +
                ", student=" + student +
                ", book=" + book +
                ", issueDate=" + issueDate +
                ", returnDate=" + returnDate +
                '}';
    }
}
