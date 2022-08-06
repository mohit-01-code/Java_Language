package com.company.Ch6_29_PracticeSet;

import java.util.Scanner;

public class PS_Ch6_Q2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the values in array:");
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("Enter the value you want check in array:");
        int chk = scan.nextInt();

        int i = 0;
        int j = 0;
        do {
            if (arr[i] == chk) {
                j++;
                break;
            }
            i++;

        } while (i < arr.length);


        if (j == 1) {
            System.out.println("Element found...!");
        } else {
            System.out.println("Element not found...!");
        }

    }
}