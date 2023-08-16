package com.neebal.entities;

import javax.persistence.*;

//@MappedSuperclass

@Entity
@Table(name = "People")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    @Column(nullable = false)
    protected String name;

    @Column(nullable = false)
    protected Character gender;

    public Person() {
    }

    public Person(String name, Character gender) {
        this.name = name;
        this.gender = gender;
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

    public void setStudName(String studName) {
        this.name = studName;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    public Person(Long id, String name, Character gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }
}
