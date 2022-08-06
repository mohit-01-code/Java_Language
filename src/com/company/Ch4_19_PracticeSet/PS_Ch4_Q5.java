package com.company.Ch4_19_PracticeSet;

import java.util.Scanner;

public class PS_Ch4_Q5 {
    public static void main(String[] args) {
        System.out.println("Enter any year ");
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        if ((year % 4) == 0) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
