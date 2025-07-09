package com.radwa.book;

public abstract class Book {
    protected String ISBN;
    protected String title;
    protected String author;
    protected int year;
    protected double price;


    public Book(String ISBN, String title, String author, int year, double price) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.year = year;
        this.price = price;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }

    public abstract void buy( String ISBN,int quantity, String email, String address) ;
}
