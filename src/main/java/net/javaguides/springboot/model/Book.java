package net.javaguides.springboot.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long book_id;

    public Long getBook_id() { return book_id; }
    public void setBook_id(Long book_id) { this.book_id = book_id; }


//    @OneToMany(mappedBy = "primaryKey.book", cascade = CascadeType.ALL)
    @OneToMany(mappedBy = "book")
    private Set<Review> reviews = new HashSet<>();

    public Set<Review> getReviews() { return reviews; }
    public void setReview(Set<Review> reviews) { this.reviews = reviews; }

    public void addReview(Review review) { this.reviews.add(review); }


    private String title;

    public String getTitle() { return title; }

    public void setTitle(String title) { this.title = title; }

    private String author;
    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    private Integer year;
    public Integer getYear() { return year; }

    public void setYear(Integer year) { this.year = year; }


    public Book() {}
    public Book(String title, String author, Integer year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }










}
