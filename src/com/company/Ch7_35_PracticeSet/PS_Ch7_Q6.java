package com.company.Ch7_35_PracticeSet;

import java.util.Scanner;

public class PS_Ch7_Q6 {
    static float average(int[] num) {
        float total = 0;
        for (int i = 0; i < num.length; i++) {
            total += num[i];
        }
        float avg = total / num.length;
        return avg;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any 5 numbers to get their average:");
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scan.nextInt();
        }
        System.out.printf("The average of the numbers is : %.2f", average(numbers));
    }
}
