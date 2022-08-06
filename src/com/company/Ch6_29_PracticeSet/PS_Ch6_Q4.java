package com.company.Ch6_29_PracticeSet;

import java.util.Scanner;

public class PS_Ch6_Q4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] matrix1 = new int[2][3];
        int[][] matrix2 = new int[2][3];
        int[][] sum = new int[2][3];

        System.out.println("Enter the elements for matrix 1");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.print("Enter the element for R" + (i + 1) + "C" + (j + 1) + " : ");
                matrix1[i][j] = scan.nextInt();
            }
        }
        System.out.println("Enter the elements for matrix 2");
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                System.out.print("Enter the element for R" + (i + 1) + "C" + (j + 1) + " : ");
                matrix2[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {

                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println("\nMatrix A");
        for (int[] val1 : matrix1) {
            for (int val2 : val1) {
                System.out.print(val2 + " ");
            }
            System.out.println();
        }

        System.out.println("\nMatrix B");
        for (int[] val1 : matrix2) {
            for (int val2 : val1) {
                System.out.print(val2 + " ");
            }
            System.out.println();
        }

        System.out.println("\nMatrix (A + B)");
        for (int[] ints : sum) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

    }
}
