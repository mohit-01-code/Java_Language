package com.company;

import java.util.Scanner;

class library {
    String[] availableBooks = new String[100];
    int[] bookCode = new int[100];
    int noOfBooks = 0;
    String[] issuedBooks = new String[100];

    public void addBooks(int n) {
        Scanner scan = new Scanner(System.in);
        for (int i = noOfBooks; i < n; i++) {
            System.out.print("Enter the name of book  : ");
            availableBooks[i] = scan.next();
            System.out.print("Enter the code no. of the book \"" + availableBooks[i] + "\" : ");
            bookCode[i] = scan.nextInt();
            noOfBooks++;
        }
    }

    public void returnBook() {
        System.out.print("How many books you want to return : ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        addBooks(n + noOfBooks);
    }

    public void showAvailableBooks() {
        System.out.println("The available books are : ");
        for (int i = 0; i < noOfBooks; i++) {
            System.out.println((i + 1) + ") Books code : " + bookCode[i] + "\t\tBook name : " + availableBooks[i]);
        }
    }
}

class student extends library {
    int enrollment_no;
    int code;

    public void issueBook() {
        System.out.print("Enter your enrollment no : ");
        Scanner scan = new Scanner(System.in);
        enrollment_no = scan.nextInt();
        showAvailableBooks();
        System.out.print("Enter the code of the book you want to issue : ");
        code = scan.nextInt();
        for (int i = 0; i < noOfBooks; i++) {
            if (bookCode[i] == code) {
                System.out.println("**Book Issued**");
                System.out.println("Enrollment no. : " + enrollment_no);
                System.out.println("Book code : " + bookCode[i]);
                System.out.println("Book name : " + availableBooks[i]);
            }
        }
    }
}

public class Ch10_51_Ex4_Library {
    public static void main(String[] args) {
        student Mohit = new student();
        System.out.print("How many books you want to add : ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Mohit.addBooks(n);

        System.out.println("Enter 1 for issue book.\nEnter 2 for return book.\nEnter 3 to see available books.");
        int choice = scan.nextInt();
        switch (choice) {
            case 1 -> Mohit.issueBook();
            case 2 -> Mohit.returnBook();
            case 3 -> Mohit.showAvailableBooks();
            default -> System.out.println("Wrong input.");
        }
    }
}
