package com.company.Ch3_15_PracticeSet;

import java.util.Scanner;

public class PS_Ch3_Q2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any string.");
        String str = scan.nextLine();
        String newStr = str.replace(' ', '_');
        System.out.println("The new string is \n" + newStr);
    }

}
