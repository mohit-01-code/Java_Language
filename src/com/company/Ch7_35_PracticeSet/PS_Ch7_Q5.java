package com.company.Ch7_35_PracticeSet;

import java.util.Scanner;

public class PS_Ch7_Q5 {
    static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = scan.nextInt();
        System.out.println("The " + n + " term of fibonacci sequence is : " + fibonacci(n));
    }
}
