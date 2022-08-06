package com.company.Ch5_25_PracticeSet;

import java.util.Scanner;

public class PS_Ch5_Q9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = scan.nextInt();
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum = sum + n * i;
            System.out.print(n * i + "+");
        }
        System.out.println("\b = " + sum + "\nThe sum of multiplication table of " + n + " is: " + sum);
    }
}
