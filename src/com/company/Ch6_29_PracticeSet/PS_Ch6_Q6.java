package com.company.Ch6_29_PracticeSet;

import java.util.Scanner;

public class PS_Ch6_Q6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the values in array.");
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        int max = 0;
        for (int val : arr) {
            if (val >= max) {
                max = val;
            }
        }
        System.out.println("The maximum value in the array is : " + max);
    }
}
