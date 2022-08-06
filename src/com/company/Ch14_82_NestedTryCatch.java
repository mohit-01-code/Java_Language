package com.company;

import java.util.Scanner;

public class Ch14_82_NestedTryCatch {
    public static void QuickQuiz(int[] arr) {
        System.out.println("Enter the index ");
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        try {
            System.out.println("valid index...\nThe value at index " + index + " is " + arr[index]);
        } catch (Exception e) {
            System.out.println("Invalid index...");
            System.out.println(e);
            QuickQuiz(arr);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 12;
        arr[1] = 5;
        arr[2] = 10;

        System.out.println("enter the index of an array");
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();

        System.out.println("enter the value to divide ");
        int num = sc.nextInt();

        try {
            try {
                System.out.println("The value at index " + index + " is " + arr[index]);
            } catch (Exception e) {
                System.out.println("Exception at level 2");
                System.out.println(e);
            }
            System.out.println("The result is " + (19 / num));
        } catch (Exception e) {
            System.out.println("Exception at level 1");
            System.out.println(e);
        }
        //Quick quiz
        QuickQuiz(arr);
    }
}
