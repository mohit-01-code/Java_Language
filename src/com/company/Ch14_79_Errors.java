package com.company;

import java.util.Scanner;

public class Ch14_79_Errors {
    public static void main(String[] args) {
        //Syntax error
//        int a = 5 -->Error: no semicolon!
//        b = 5 ->Error: b not found!

        //Logical error
        //Write prime numbers between 1 and 10
        System.out.println(2);
        for (int i = 1; i < 5; i++) {
            System.out.println(2 * i + 1);
        }

        //Runtime error
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(1000 / a); //there will be run time error(Exception) when a = 0 is entered by user
    }

}
