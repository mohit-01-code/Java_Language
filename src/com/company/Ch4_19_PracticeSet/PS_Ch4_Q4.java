package com.company.Ch4_19_PracticeSet;

import java.util.Scanner;

public class PS_Ch4_Q4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Switch case statements
        System.out.println("Enter any number between 1-7 to get day of the week.");
        int day = scan.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Wrong input!!");
        }


    }
}
