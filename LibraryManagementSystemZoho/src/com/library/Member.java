package com.library;

import java.time.LocalDate;
import java.util.*;

public class Member {
    private int memberId;
    private String name;
    private Map<Book, LocalDate> borrowedBooks = new HashMap<>();
    private int totalBooksBorrowed = 0;

    public Member(int memberId, String name) {
        this.memberId = memberId;
        this.name = name;
    }

    public int getMemberId() { return memberId; }
    public String getName() { return name; }
    public Map<Book, LocalDate> getBorrowedBooks() { return borrowedBooks; }
    public int getTotalBooksBorrowed() { return totalBooksBorrowed; }

    public boolean borrowBook(Book book) {
        if (borrowedBooks.size() >= 3)
            return false;

        borrowedBooks.put(book, LocalDate.now());
        totalBooksBorrowed++;
        return true;
    }

    public LocalDate returnBook(Book book) {
        return borrowedBooks.remove(book);
    }
}