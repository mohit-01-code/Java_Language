package com.company;

import java.util.Scanner;

public class Ch5_23_ForLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Quick quiz 1
        System.out.println("Enter any number to get odd numbers:");
        int n = scan.nextInt();
        for (int i = 0; i <= n; i++) {
            System.out.println(2 * i + 1);
        }

        //Quick Quiz 2
        System.out.println("Enter any number to get reverse natural numbers:");
        int n1 = scan.nextInt();
        for (int i = n1; i != 0; i--) {
            System.out.println(i);
        }
    }
}
