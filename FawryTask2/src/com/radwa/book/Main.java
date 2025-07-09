package com.radwa.book;

public class Main {
    public static void main(String[] args) {
        BookServices bookService = new BookServices();
        try {

            System.out.println("Add Books...");
            Book paperBook = new PaperBook("A-001", "Java Basics", "Herbert Schildt", 2017, 100.0, 5);
            Book ebook = new EBook("B-002", "Spring Boot", "Craig Walls", 2022, 50.0, "PDF");
            Book demoBook = new DemoBook("C-003", "Python Basics", "Barry Burd", 2018);

            bookService.addBook(paperBook);
            bookService.addBook(ebook);
            bookService.addBook(demoBook);

            System.out.println();
            System.out.println();


            System.out.println("test buy Books");
            bookService.buyBook("A-001", 2, "Radwa@mail.com", "Cairo");
            System.out.println();
            bookService.buyBook("B-002", 1, "Norhan@mail.com", "");
            System.out.println();
            bookService.buyBook("C-003", 1, "", "");

            System.out.println();
            System.out.println();

        }
        catch (OutOfStockException e) {
            System.out.println(  e.getMessage());
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(  e.getMessage());
        }

        bookService.addBook(new PaperBook("D-004", "C++ Baiscs", "Tony Gaddis", 2010, 80.0, 3));
        System.out.println();
        System.out.println();

        System.out.println("test remove books");
        bookService.removeOutdatedBooks(10);
    }
}
