package it.ioprogrammatore.model;

import it.ioprogrammatore.model.abstracts.Media;

public class Book extends Media {

    private String author;

    public Book() {
    }

    public Book(String author) {
        this.author = author;
    }

    public Book(String title, String publisher, String author) {
        super(title, publisher);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book author(String author) {
        this.author = author;
        return this;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                '}';
    }
}
