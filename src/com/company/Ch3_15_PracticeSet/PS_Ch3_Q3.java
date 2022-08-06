package com.company.Ch3_15_PracticeSet;

import java.util.Scanner;

public class PS_Ch3_Q3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("PLease Enter your name.");
        String name = scan.nextLine();
        String str = "Dear <|name|>, Thanks a lot";
        String newStr = str.replace("<|name|>", name);
        System.out.println(newStr);
    }
}
