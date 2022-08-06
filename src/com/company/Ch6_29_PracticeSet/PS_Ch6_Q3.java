package com.company.Ch6_29_PracticeSet;

import java.util.Scanner;

public class PS_Ch6_Q3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int students = scan.nextInt();
        int[] marks = new int[students];

        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter the marks of roll no. " + (i + 1) + ": ");
            marks[i] = scan.nextInt();
        }
        int sum = 0;
        for (int val : marks) {
            sum += val;
        }
        float avg = (float) (sum) / students;
        System.out.println("The average marks obtained by all students in Physics is : " + avg);
    }
}
