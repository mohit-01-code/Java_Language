package com.company.Ch1_07_PracticeSet;

import java.util.Scanner;

public class PS_ch1_Q2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter marks of subject 1 : ");
        float sub1 = scan.nextFloat();
        System.out.print("Enter marks of subject 2 : ");
        float sub2 = scan.nextFloat();
        System.out.print("Enter marks of subject 3 : ");
        float sub3 = scan.nextFloat();
        float cgpa = (sub1 + sub2 + sub3) / 30;
        System.out.println("Your CGPA is : " + cgpa);
    }
}
