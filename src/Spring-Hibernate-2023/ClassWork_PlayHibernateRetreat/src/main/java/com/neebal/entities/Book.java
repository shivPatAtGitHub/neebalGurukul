package com.neebal.entities;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "books")
@NamedQueries({
        @NamedQuery(
                name = "Book.findTitlePrice",
                query = "select b.title, b.price, b.pages from Book b"
        ),

        @NamedQuery(
                name = "Book.TitlePricePages>500OrderByPagesDESC",
                query = "select b.title, b.price, b.pages from Book b where b.pages > 500 order by b.price desc"
        ),

        @NamedQuery(
                name = "Book.TitlePricePages>500OrderByPagesDESCUsingVariables",
                query = "select b.title, b.price, b.pages from Book b where b.pages > :pages order by b.price desc"
        ),

        @NamedQuery(
                name = "Book.bookCountWithPages>500",
                query = "select count(b.pages) from Book b where b.pages > :pages"
        )
})
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50 , nullable = false, unique = true)
    private String title;

    @Column(nullable = false)
    private Integer pages;

    @Column(nullable = true)
    private Double price;

    @ManyToOne
    private PublicationHouse publicationHouse;

    @ManyToMany(mappedBy = "books")
    private Set<Author> authors;

    @OneToMany(mappedBy = "book")
    private Set<BookStudent> studentsIssued;

    public PublicationHouse getPublicationHouse() {
        return publicationHouse;
    }

    public void setPublicationHouse(PublicationHouse publicationHouse) {
        this.publicationHouse = publicationHouse;
    }

    public Book() {}

    public Book(String title, Integer pages, Double price) {
        this.title = title;
        this.pages = pages;
        this.price = price;
    }
//
//    public Book(String title, Integer pages, Double price, PublicationHouse publicationHouse) {
//        this.title = title;
//        this.pages = pages;
//        this.price = price;
//        this.publicationHouse = publicationHouse;
//    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", pages=" + pages +
                ", price=" + price +
                '}';
    }
}
