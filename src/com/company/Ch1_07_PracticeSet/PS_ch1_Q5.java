package com.company.Ch1_07_PracticeSet;

import java.util.Scanner;

public class PS_ch1_Q5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number to check for the integer");
        boolean b = scan.hasNextInt();
        System.out.println(b);
    }
}
