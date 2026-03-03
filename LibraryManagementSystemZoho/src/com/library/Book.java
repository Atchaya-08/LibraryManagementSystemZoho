package com.library;

public class Book {
    private int bookId;
    private String title;
    private String author;
    private int totalCopies;
    private int availableCopies;

    public Book(int bookId, String title, String author, int copies) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.totalCopies = copies;
        this.availableCopies = copies;
    }

    public int getBookId() { return bookId; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getAvailableCopies() { return availableCopies; }

    public void borrowBook() {
        if (availableCopies > 0)
            availableCopies--;
    }

    public void returnBook() {
        if (availableCopies < totalCopies)
            availableCopies++;
    }
}