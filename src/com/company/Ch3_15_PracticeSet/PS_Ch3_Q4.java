package com.company.Ch3_15_PracticeSet;

import java.util.Scanner;

public class PS_Ch3_Q4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any string.");
        String str = scan.nextLine();
        int index = str.indexOf("  ");
        System.out.println("Double or triple spaces are at index : " + index);
    }
}
