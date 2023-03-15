package net.javaguides.springboot.model;

import javax.persistence.*;

@Entity
public class Review {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user;
    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "book_id")
    private Book book;
    public Book getBook() { return book; }
    public void setBook(Book book) { this.book = book; }

    private Integer rate;
    public Integer getRate() { return rate; }
    public void setRate(Integer rate) { this.rate = rate; }


    private String comment;
    public String getComment() { return comment; }
    public void setComment(String comment) { this.comment = comment; }


    private String date; // of the form yyyy/mm/dd, exp: 2023/12/27
    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }

    public Review() {
    }

    public Review(User user, Book book, Integer rate, String comment, String date) {
        this.user = user;
        this.book = book;
        this.rate = rate;
        this.comment = comment;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Review{" +
                "rate=" + rate +
                ", comment='" + comment + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
