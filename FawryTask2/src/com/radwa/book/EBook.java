package com.radwa.book;

public class EBook extends Book {
    private String  filetype;

    public EBook(String ISBN ,String title, String author, int year,double price,String filetype) {

        super(ISBN, title, author, year, price);
        this.filetype = filetype;

    }

    public void buy(String ISBN,int quantity, String email, String address)
    {
        if(quantity>1)
        {
            throw new RuntimeException(" EBook can only be bought one at a time.");
        }

        System.out.println(" Sending the "+getTitle()+" book to " + email);
        System.out.println(" Paid amount = " + price);
    }
}
