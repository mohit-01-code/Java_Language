package com.company.Ch7_35_PracticeSet;

import java.util.Scanner;

public class PS_Ch7_Q10 {
    static int sum(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += i;
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println("Enter the value of n:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("The sum of " + n + " natural numbers is : " + sum(n));
    }
}
