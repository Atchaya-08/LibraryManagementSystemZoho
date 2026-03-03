package com.library;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class LibrarySystem {

    private List<Book> books = new ArrayList<>();
    private List<Member> members = new ArrayList<>();

    
    public void addBook(int id, String title, String author, int copies) {
        books.add(new Book(id, title, author, copies));
        System.out.println("Book Added Successfully!");
    }

    
    public void registerMember(int id, String name) {
        members.add(new Member(id, name));
        System.out.println("Member Registered Successfully!");
    }

    
    private Book findBook(int id) {
        for (Book b : books)
            if (b.getBookId() == id)
                return b;
        return null;
    }

   
    private Member findMember(int id) {
        for (Member m : members)
            if (m.getMemberId() == id)
                return m;
        return null;
    }

    
    public void borrowBook(int memberId, int bookId) {
        Member m = findMember(memberId);
        Book b = findBook(bookId);

        if (m == null || b == null) {
            System.out.println("Member or Book not found!");
            return;
        }

        if (b.getAvailableCopies() <= 0) {
            System.out.println("No copies available!");
            return;
        }

        if (m.borrowBook(b)) {
            b.borrowBook();
            System.out.println("Book Borrowed Successfully!");
        } else {
            System.out.println("Cannot borrow more than 3 books!");
        }
    }

    
    public void returnBook(int memberId, int bookId) {
        Member m = findMember(memberId);
        Book b = findBook(bookId);

        if (m == null || b == null) {
            System.out.println("Member or Book not found!");
            return;
        }

        LocalDate borrowDate = m.returnBook(b);

        if (borrowDate == null) {
            System.out.println("This book was not borrowed!");
            return;
        }

        b.returnBook();

        long days = ChronoUnit.DAYS.between(borrowDate, LocalDate.now());
        if (days > 14) {
            long fine = (days - 14) * 2;
            System.out.println("Book returned with fine: Rs." + fine);
        } else {
            System.out.println("Book returned successfully!");
        }
    }
}