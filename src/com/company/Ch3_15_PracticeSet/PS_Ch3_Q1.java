package com.company.Ch3_15_PracticeSet;

import java.util.Scanner;

public class PS_Ch3_Q1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any string.");
        String str = scan.nextLine();
        String lowerCase = str.toLowerCase();//Converts string to lower case
        System.out.println("The lower case string is \n" + lowerCase);
    }
}
