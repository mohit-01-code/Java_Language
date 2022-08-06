package com.company.Ch5_25_PracticeSet;

import java.util.Scanner;

public class PS_Ch5_Q11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = scan.nextInt();
        int i = 1;
        do {
            System.out.println(n + "*" + i + " = " + (n * i));
            i++;
        } while (i <= 10);
    }
}
