package com.company.Ch5_25_PracticeSet;

import java.util.Scanner;

public class PS_Ch5_Q3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = scan.nextInt();
        System.out.println("The multiplication table of " + n + " is:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + "*" + i + " = " + n * i);
        }
    }
}
