package com.company.Ch5_25_PracticeSet;

import java.util.Scanner;

public class PS_Ch5_Q6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = scan.nextInt();
        int factorial = n;
        int i = n - 1;
        while (i >= 1) {
            factorial = factorial * (n - i);
            i--;
        }
        System.out.println("Factorial of " + n + " is: " + factorial);
    }
}
