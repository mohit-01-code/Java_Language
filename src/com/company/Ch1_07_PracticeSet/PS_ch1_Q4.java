package com.company.Ch1_07_PracticeSet;

import java.util.Scanner;

public class PS_ch1_Q4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the distance in km ");
        float km = scan.nextFloat();
        float miles = km * 0.621f;
        System.out.print(km);
        System.out.print("km = " + miles + " miles");
    }
}
