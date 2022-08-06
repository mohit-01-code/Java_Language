package com.company;

import java.util.Scanner;

public class Ch4_18_SwitchCase {
    public static void main(String[] args) {
        //If-else if-else ladder
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = scan.nextInt();
        if (age < 18) {
            System.out.println("You are a kid ! Under 18.");
        } else if (age == 18) {
            System.out.println("You are exactly 18.");
        } else if (age > 18 && age < 100) {
            System.out.println("You are an Adult! Above 18");
        } else {
            System.out.println("Wrong input!!");
        }

        //Switch case statements
        System.out.println("Enter any number between 1-7 to get day of the week.");
        int day = scan.nextInt();
        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Wrong input!!");
        }


    }
}
