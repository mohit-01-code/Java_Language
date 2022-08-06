package com.company.Ch7_35_PracticeSet;

import java.util.Scanner;

public class PS_Ch7_Q1 {
    static void table(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " X " + i + " = " + (n * i));
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number for multiplication table: ");
        int a = scan.nextInt();
        table(a);
    }


}
