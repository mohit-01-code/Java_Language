package com.company.Ch7_35_PracticeSet;

import java.util.Scanner;

public class PS_Ch7_Q3 {
    static int sum(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 0) {
            return 0;
        } else {
            return n + sum(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = scan.nextInt();
        System.out.println("The sum of " + n + " natural numbers is : " + sum(n));
    }
}
