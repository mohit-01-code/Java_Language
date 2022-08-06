package com.company.Ch4_19_PracticeSet;

import java.util.Scanner;

public class PS_Ch4_Q6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any URL.");
        String url = scan.nextLine();
        if (url.endsWith(".com"))
            System.out.println("Its a Commercial website.");
        else if (url.endsWith(".org"))
            System.out.println("Its an Organization website.");
        else if (url.endsWith(".in"))
            System.out.println("Its an Indian website.");
        else if (url.endsWith(".edu"))
            System.out.println("Its an Education website.");
        else {
            System.out.println("Incorrect URL! Please enter valid url.");
        }
    }
}
