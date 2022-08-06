package com.company.Ch6_29_PracticeSet;

import java.util.Scanner;

public class PS_Ch6_Q1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float[] arr = new float[5];
        System.out.println("Enter the values in array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextFloat();
        }
        float sum = 0;
        for (float val : arr) {
            sum += val;
        }
        System.out.println(sum);
    }
}
