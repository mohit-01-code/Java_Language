package com.company.Ch14_86_PracticeSet;

import java.util.Scanner;

class MaxRetriesReachedException extends Exception {
    public String toString() {
        return "MaxRetriesReachedException : you have entered 5 incorrect inputs.";
    }
}


public class PS_Ch14_Q3Q4andQ5 {
    public static void ArrayIndex(int[] arr) throws MaxRetriesReachedException {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("Enter the index of an array");
                int ind = sc.nextInt();
                System.out.println("valid index .." + arr[ind]);
                break;
            } catch (Exception e) {
                System.out.println(e);
            }
            if (i == 4) {
                System.out.println("Error...");
                throw new MaxRetriesReachedException();
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 12;
        arr[1] = 2;
        arr[2] = 4;

        try {
            ArrayIndex(arr);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
