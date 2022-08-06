package com.company.Ch6_29_PracticeSet;

import java.util.Scanner;

public class PS_Ch6_Q8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the values in array");
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        boolean isSorted = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }
        if (isSorted) {
            System.out.println(
                    "The array is Sorted.");
        } else {
            System.out.println("The array is not Sorted.");
        }
    }
}
