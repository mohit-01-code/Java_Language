package com.company.Ch14_86_PracticeSet;

import java.util.Scanner;

public class PS_Ch14_Q1 {

    public static void main(String[] args) {
//        Syntax Error
//        a = 5
//        System.out.println("This is syntax error...put semicolon at the end")

//        Logical Error
//        Print natural number between 1 and 10
        for (int i = 1; i < 11; i++) {
            System.out.print((2 * i) + ", ");//getting logical error that it prints even numbers not natural numbers
        }
        System.out.println();

//        Runtime Error
        Scanner sc = new Scanner(System.in);
        try {
            int num = sc.nextInt(); //if user enters float value it throws a runtime error(Exception)
        } catch (Exception e) {
            System.out.println("Runtime error...");
            System.out.println(e);
        }
        System.out.println("End of the program..");
    }
}
