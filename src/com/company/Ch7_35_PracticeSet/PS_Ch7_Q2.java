package com.company.Ch7_35_PracticeSet;

import java.util.Scanner;

public class PS_Ch7_Q2 {
    static void pattern() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        pattern();

    }

}
