package com.radwa.book;

public class DemoBook extends Book {
    public DemoBook(String ISBN, String title, String author, int year)  {
        super(ISBN, title, author,year ,0.0);
    }


    public void buy(String ISBN,
                    int quantity, String email, String address) {
        throw new RuntimeException("Showcase book is not for sale.");
    }
}
