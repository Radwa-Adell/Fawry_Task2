package com.radwa.book;

import java.util.*;

public class BookServices {

        private Map<String, Book> books = new HashMap<>();

        public void addBook(Book book) {
            books.put(book.getISBN(), book);
            System.out.println( book.getTitle() + " is added to the list.");
        }

        public Book removeBook(String ISBN) {
            return books.remove(ISBN);
        }

        public List<Book> removeOutdatedBooks(int maxYears) {
            List<Book> removedBooks = new ArrayList<>();
            int currentYear = Calendar.getInstance().get(Calendar.YEAR);

            for (String isbn : new ArrayList<>(books.keySet())) {
                Book book = books.get(isbn);
                if ((currentYear - book.getYear()) > maxYears) {
                    removedBooks.add(book);
                    books.remove(isbn);
                    System.out.println( "Book " + book.getTitle() + " is outdated and removed.");
                }
            }
            return removedBooks;
        }

        public void buyBook(String ISBN, int quantity, String email, String address) throws Exception {
            Book book = books.get(ISBN);
            if (book == null) {
                throw new Exception(" Book not found.");
            }
            book.buy(ISBN,quantity, email, address);
        }
    }


