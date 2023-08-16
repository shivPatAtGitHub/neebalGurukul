package com.neebal.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "professors")
public class Professor extends Person{

    @Column(nullable = false)
    private String qualification;
    public Professor() {
    }

    public Professor(String studName, Character gender, String qualification) {
        super(studName, gender);
        this.qualification = qualification;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "qualification='" + qualification + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }
}
