package com.radwa.book;

public class PaperBook extends Book {
  private int inStock;

  public PaperBook(String ISBN ,String title, String author, int year,double price, int inStock) {

      super(ISBN, title, author, year, price);
      this.inStock = inStock;
  }
  public void buy(String ISBN, int quantity, String email, String address)
  {
      if(quantity > inStock)
      {
          throw new  OutOfStockException("The Book is Out Of Stock");
      }
      inStock -= quantity;
       ShippingService.send(address);
      System.out.println("Paid amount = " + (getPrice() * quantity));

  }

    public int getInStock() {
        return inStock;
    }

}
