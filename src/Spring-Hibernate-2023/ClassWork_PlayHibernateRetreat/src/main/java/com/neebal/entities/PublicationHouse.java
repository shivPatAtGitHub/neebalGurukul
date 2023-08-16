package com.neebal.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "publication_houses")
public class PublicationHouse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = true)
    @Temporal(TemporalType.DATE)
    private Date estDate;

    @OneToMany(mappedBy = "publicationHouse", cascade = CascadeType.ALL)
    private Set<Book> books;

    public PublicationHouse() {}

    public PublicationHouse(String name, Date estDate) {
        this.name = name;
        this.estDate = estDate;
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

    public Date getEstDate() {
        return estDate;
    }

    public void setEstDate(Date estDate) {
        this.estDate = estDate;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "PublicationHouse{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", estDate=" + estDate +
                ", books=" + books +
                '}';
    }
}
