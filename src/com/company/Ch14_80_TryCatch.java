package com.company;

import java.util.Scanner;

public class Ch14_80_TryCatch {
    public static void main(String[] args) {
        int a = 19;
        Scanner sc = new Scanner(System.in);
        int b = 0;
        //Without try
//        int d = a / b; //throws an exception and program would terminate here only
//        System.out.println(d);
        try {
            int c = a / b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Program finished...");
    }
}
