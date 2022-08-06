package com.company.Ch7_35_PracticeSet;

import java.util.Scanner;

public class PS_Ch7_Q9 {
    static float conversion(int celsius) {
        return celsius * 33.8f;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the temperature in Celsius:");
        int cel = scan.nextInt();
        System.out.println("" + cel + " Celsius = " + conversion(cel) + " Fahrenheit");
    }
}
