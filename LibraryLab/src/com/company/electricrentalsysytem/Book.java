package com.company.electricrentalsysytem;

public class Book {
    String title;
    boolean borrowed = false;
   boolean returned = true;


    // Creates a new Book
    public Book(String bookTitle) {
        this.title = bookTitle;
       

    }


    public String getTitle() {
        return title;
    }
    
    public boolean getBorrowed() {
        return false;
    }

    // Marks the book as rented
    public void borrowed() {

    }


    
    public boolean getReturned() {
        return true;
    }

//     Marks the book as not rented
    public void returned() {

    }
    
    public boolean isBorrowed() {
        return false;
    }
}

