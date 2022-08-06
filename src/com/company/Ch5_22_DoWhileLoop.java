package com.company;

import java.util.Scanner;

public class Ch5_22_DoWhileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any to get natural numbers: ");
        int n = scan.nextInt();
        int i = 0;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= n);
    }
}
