package com.company.Ch7_35_PracticeSet;

import java.util.Scanner;

public class PS_Ch7_Q4 {
    static void pattern() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern();
        System.out.println("Enter the number of rows for pattern:");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        pattern(num);
    }
}
