package com.neebal.collegemgmt.entities;


import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String username;

    @Column(nullable = false, length = 20)
    private String password;

    @Column(nullable = false, length = 1)
    private Character gender;

    @OneToMany(mappedBy = "student")
    private Set<BookStudent> booksIssued;



    public Student() {
    }

    public Student(String username, String password, Character gender) {
        this.username = username;
        this.password = password;
        this.gender = gender;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    public Set<BookStudent> getBooksIssued() {
        return booksIssued;
    }

    public void setBooksIssued(Set<BookStudent> booksIssued) {
        this.booksIssued = booksIssued;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", gender=" + gender +
                '}';
    }
}
