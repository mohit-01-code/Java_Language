package com.company;

public class Ch5_24_BreakAndContinue {
    public static void main(String[] args) {
        //Break
        int i = 1;
        while (i <= 5) {
            System.out.println("while loop execute: " + i);
            i++;
            if (i == 3) {
                System.out.println("loop breaks: " + i);
                break;
            }
        }

        do {
            System.out.println("Do-while loop execute: " + i);
            i++;
            if (i == 7) {
                System.out.println("loop break: " + i);
                break;
            }
        } while (i <= 10);

        for (int j = 10; j != 5; j--) {
            System.out.println("For loop execute: " + j);
            if (j == 6) {
                System.out.println("loop break: " + j);
                break;
            }
        }

        //Continue
        i = 0;
        while (i != 8) {
            i++;
            if (i == 2 || i == 5 || i == 7) {
                System.out.println("loop continue: " + i);
                continue;
            }
            System.out.println("While loop execute: " + i);
        }

        do {
            i++;
            if (i == 11) {
                System.out.println("loop continue: " + i);
                continue;
            }
            System.out.println("Do-While execute: " + i);
        } while (i <= 12);

        for (i = 10; i >= 5; i--) {
            if (i == 7) {
                System.out.println("loop continue: " + i);
                continue;
            }
            System.out.println("For loop execute: " + i);
        }
    }
}
