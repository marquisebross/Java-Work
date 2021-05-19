package com.company.electricrentalsysytem;



public class Library {

    String address;
    java.util.ArrayList<Book> books;
    public static  String openTime = "9am";
    public static  String closeTime = "5am";





    public Library(String libraryAddy) {
        this.address = libraryAddy;
        this.books = new java.util.ArrayList<Book>();
    }
    public void printAddress(){
        System.out.println(address);

    }

        public static void printOpeningHours() {
            System.out.println("Libraries are open daily from " + openTime + " to " + closeTime + ".");
        }

        public void addBook(Book bookTitle) {
        books.add(bookTitle);
    }


    public void borrowBook(String title) {
        int found = 0;
        for (Book bookTitle : books) {
            if (bookTitle.getTitle().equals(title)) {
                if (found == 0) {
                    found = 1;
                }
                if (!bookTitle.isBorrowed()) {
                    bookTitle.borrowed();
                    found = 2;
                    break;
                }
            }
        }
        if (found == 0) {
            System.out.println("Sorry, this book is not in our catalog.");
        } else if (found == 1) {
            System.out.println("Sorry, this book is already borrowed.");
        } else if (found == 2) {
            System.out.println("You successfully borrowed " + title);
        }
    }

    public void printAvailableBooks() {
        boolean bookAvailable = false;
        for (Book bookTitle : books) {
            if (!bookTitle.isBorrowed()) {
                System.out.println(bookTitle.getTitle());
                bookAvailable = true;
            }
        }
        if (!bookAvailable) {
            System.out.println("No book in catalog");
        }
    }

    public void returnBook(String title) {
        boolean found = false;
        for (Book bookTitle : books) {
            if (bookTitle.getTitle().equals(title) && bookTitle.isBorrowed()) {
                bookTitle.returned();
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("You successfully returned " + title);
        }
    }

}
