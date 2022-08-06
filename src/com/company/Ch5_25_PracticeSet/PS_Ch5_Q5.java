package com.company.Ch5_25_PracticeSet;

import java.util.Scanner;

public class PS_Ch5_Q5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = scan.nextInt();
        int factorial = n;
        for (int i = n - 1; i >= 1; i--) {
            factorial = factorial * (n - i);
        }
        System.out.println("Factorial of " + n + " is: " + factorial);
    }
}
