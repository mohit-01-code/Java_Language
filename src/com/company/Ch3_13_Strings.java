package com.company;

import java.util.Scanner;

public class Ch3_13_Strings {
    public static void main(String[] args) {
        String str;
        str = new String("Hello Harry");
        System.out.println(str);

        String name = "Harry";
        System.out.println(name);

        Scanner scan = new Scanner(System.in);
        String S = scan.next();//Scans a String from user input
        System.out.println(S);

        System.out.print("No new line here.");
        System.out.println("New line");
        int a = 10;
        float b = 12.21f;
        System.out.printf("The value of a is %d and b is %f.\n", a, b);
        System.out.format("The value of b is %.2f and a is %d.", b, a);
    }
}
