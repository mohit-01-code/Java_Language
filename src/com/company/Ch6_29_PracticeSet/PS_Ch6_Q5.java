package com.company.Ch6_29_PracticeSet;

import java.util.Scanner;

public class PS_Ch6_Q5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value in Array.");
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        int[] revArr = new int[arr.length];
        for (int i = 0, j = arr.length - 1; i < revArr.length; i++, j--) {
            revArr[i] = arr[j];
        }

        System.out.println("Displaying the array");
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println("\nDisplaying the reverse array.");
        for (int element : revArr) {
            System.out.print(element + " ");
        }

    }
}
