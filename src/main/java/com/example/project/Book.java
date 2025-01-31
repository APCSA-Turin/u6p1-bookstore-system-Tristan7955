package com.example.project;

public class Book{
    //requires 5 attributes String title, String author, int yearPublished, String isbn, int quantity
    String title;
    String author;
    int yearPublished;
    String isbn;
    int quantity;
    //requires 1 constructor with 5 arguments that intitialize the attribtues of the class.
    public Book(String title, String author, int yearPublished, String isbn, int quantity) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.isbn = isbn;
        this.quantity = quantity;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String name) {
        title = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String name) {
        author = name;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int year) {
        yearPublished = year;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String id) {
        isbn = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int number) {
        quantity = number;
    }

    public String bookInfo(){
        return "Title: " + title + ", Author: " + author + ", Year: " + yearPublished + ", ISBN: " + isbn + ", Quantity: " + quantity;
    } //returns "Title: [], Author: [], Year: [], ISBN: [], Quantity: []"
       
}