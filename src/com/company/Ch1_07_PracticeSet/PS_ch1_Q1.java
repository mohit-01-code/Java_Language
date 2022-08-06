package com.company.Ch1_07_PracticeSet;

import java.util.Scanner;

public class PS_ch1_Q1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any three numbers");
        System.out.print("Number 1 : ");
        int num1 = scan.nextInt();
        System.out.print("Number 2 : ");
        int num2 = scan.nextInt();
        System.out.print("Number 2 : ");
        int num3 = scan.nextInt();
        int sum = num1 + num2 + num3;
        System.out.print("The sum of three numbers is : " + sum);
    }
}
