package com.library;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LibrarySystem library = new LibrarySystem();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Library Menu =====");
            System.out.println("1. Add Book");
            System.out.println("2. Register Member");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Book ID: ");
                    int bid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Title: ");
                    String title = sc.nextLine();
                    System.out.print("Author: ");
                    String author = sc.nextLine();
                    System.out.print("Copies: ");
                    int copies = sc.nextInt();
                    library.addBook(bid, title, author, copies);
                    break;

                case 2:
                    System.out.print("Member ID: ");
                    int mid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    library.registerMember(mid, name);
                    break;

                case 3:
                    System.out.print("Member ID: ");
                    mid = sc.nextInt();
                    System.out.print("Book ID: ");
                    bid = sc.nextInt();
                    library.borrowBook(mid, bid);
                    break;

                case 4:
                    System.out.print("Member ID: ");
                    mid = sc.nextInt();
                    System.out.print("Book ID: ");
                    bid = sc.nextInt();
                    library.returnBook(mid, bid);
                    break;

                case 5:
                    System.out.println("Thank You!");
                    sc.close();
                    System.exit(0);
            }
        }
    }
}