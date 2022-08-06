package com.company;

import java.util.Scanner;

public class Ch4_17_RelationalAndLogicalOperator {
    public static void main(String[] args) {
        System.out.println("Enter two numbers");
        System.out.println("Number 1 : ");
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        System.out.println("Number 2 : ");
        int num2 = scan.nextInt();
        if (num1 > 10 && num2 < 25) {//&& requires both condition to be true for execute
            System.out.println(num1 + " is greater than 10.\n" + num2 + " is less than 25.");
        } else {
            System.out.println("False values");
        }
        int a = 10;
        int b = 12;
        int c = 1;
        if (a == 12 || b == 12 || c < 1) {// '||' requires one of the condition to be true
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
