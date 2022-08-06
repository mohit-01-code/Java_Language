package com.company.Ch5_25_PracticeSet;

import java.util.Scanner;

public class PS_Ch5_Q2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = scan.nextInt();
        int i = 0;
        int sum = 0;
        while (i < n) {
            sum = sum + 2 * i;
            System.out.print(2 * i + "+");
            i++;
        }
        System.out.println("\b = " + sum + "\nThe sum of " + n + " even numbers is: " + sum);
    }

}
