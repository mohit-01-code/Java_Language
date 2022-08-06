package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

class libraryManagement { //library management
    String book_name;
    String book_author;
    String issued_to;
    int book_code;
    String issued_on;

    public libraryManagement(String book_name, String book_author, int book_code) {
        this.book_name = book_name;
        this.book_author = book_author;
        this.book_code = book_code;
        this.setIssued_on();
    }

    public void setIssued_on() {
        LocalDate d = LocalDate.now();
        DateTimeFormatter dfd = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalTime t = LocalTime.now();
        DateTimeFormatter dft = DateTimeFormatter.ofPattern("HH:mm:ss a");
        this.issued_on = " " + d.format(dfd) + " " + t.format(dft);
    }
}

class book extends libraryManagement { //book

    public book(String book_name, String book_author, int book_code) {
        super(book_name, book_author, book_code);
    }

    public void addBook(ArrayList<book> bl, book b) {
        bl.add(b);
    }

    public void returnBook(ArrayList<book> bk, book b) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String returned_by = sc.next();
        System.out.println("Book Return Successfully");
        System.out.println("Book Name : " + b.book_name);
        System.out.println("Book Author : " + b.book_author);
        System.out.println("Returned by : " + returned_by);
        System.out.println("Return on : " + b.issued_on);
        bk.add(b);
    }

    public void issueBook(ArrayList<book> b) {
        showAvailableBooks(b);
        Scanner sc = new Scanner(System.in);
        System.out.println("Which number of book you want to issue: ");
        int bookNumber = sc.nextInt();
        System.out.println("Enter your name to issue book : ");
        b.get(bookNumber).issued_to = sc.next();
        System.out.println("**Book Issued**");
        System.out.println("Book Name : " + b.get(bookNumber).book_name);
        System.out.println("Book Author : " + b.get(bookNumber).book_author);
        System.out.println("Issued To : " + b.get(bookNumber).issued_to);
        System.out.println("Issued on : " + b.get(bookNumber).issued_on);
        b.remove(b.get(bookNumber));
    }

    public void showAvailableBooks(ArrayList<book> b) {
        int i = 0;
        System.out.println("Available books are:");
        System.out.println("Sr.No.\t\tBook Name\t\tAuthor Name\t\tBook Code\t\tAdded on");
        for (book bk : b) {
            System.out.println(i + "\t\t\t" + bk.book_name + "\t\t\t" + bk.book_author + "\t\t\t" + bk.book_code + "\t\t\t" + bk.issued_on);
            i++;
        }
    }
}

public class Ch15_104_Ex7_LibraryManagementSystem { //main class
    public static book enterDetail() {
        String book_Name, book_author;
        Scanner sc = new Scanner(System.in);
        System.out.print("Book Name : ");
        book_Name = sc.next();
        System.out.print("Author Name : ");
        book_author = sc.next();
        System.out.print("Book Code : ");
        int book_code = sc.nextInt();
        return new book(book_Name, book_author, book_code);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
/*
        book b1 = new book("Book1", "Author1", 101);
        book b2 = new book("Book2", "Author2", 102);
        book b3 = enterDetail();
        book b4 = enterDetail();

        book b1 = new book("Amazing fact", "Cane Williams", 111);
        book b2 = new book("Theory of relativity", "Albert Einstein", 112);
        book b3 = new book("Money Heist", "Professor", 113);
        book b4 = new book("Avengers", "Marvel", 114);
*/
        book b1 = enterDetail();
        book b2 = enterDetail();
        book b3 = new book("Book3", "Author3", 103);
        book b4 = new book("Book4", "Author4", 104);
        ArrayList<book> bookList = new ArrayList<>(4);
        bookList.add(b1);
        bookList.add(b2);
        bookList.add(b3);
        bookList.add(b4);

        for (int i = 0; i < 4; i++) {
            System.out.println("Student " + (i + 1));
            System.out.println("Enter 1 for add book.\nEnter 2 for issue book.\nEnter 3 for return book.\nEnter 4 to see available books.");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> bookList.get(i).addBook(bookList, enterDetail());
                case 2 -> bookList.get(i).issueBook(bookList);
                case 3 -> {
                    bookList.get(i).returnBook(bookList, enterDetail());
                    bookList.get(i).showAvailableBooks(bookList);
                }
                case 4 -> bookList.get(i).showAvailableBooks(bookList);
                default -> System.out.println("Wrong input.");
            }
        }
    }
}