package com.company.Ch5_25_PracticeSet;

import java.util.Scanner;

public class PS_Ch5_Q4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = scan.nextInt();
        System.out.println("The reverse multiplication table of " + n + " is:");
        for (int i = 10; i >= 1; i--)
            System.out.println(n + "*" + i + " = " + n * i);
    }
}
