package com.company;

import java.util.Scanner;

public class Ch1_06_Ex1_CbseBoardPercentage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the maximum marks for the subjects");
        int max = scan.nextInt();
        System.out.print("Enter the marks obtained in subject code 120042 : ");
        int sub1 = scan.nextInt();
        System.out.print("Enter the marks obtained in subject code 120043 : ");
        int sub2 = scan.nextInt();
        System.out.print("Enter the marks obtained in subject code 120044 : ");
        int sub3 = scan.nextInt();
        System.out.print("Enter the marks obtained in subject code 120045 : ");
        int sub4 = scan.nextInt();
        System.out.print("Enter the marks obtained in subject code 120046 : ");
        int sub5 = scan.nextInt();

        float percentage;
        float total = sub1 + sub2 + sub3 + sub4 + sub5;
        percentage = ((total) / (max * 5)) * 100;
        System.out.println("Subject_name        Subject_code        Marks_obtained      Max_marks ");
        System.out.println("======================================================================");
        System.out.println("Science             120042              " + sub1 + "                  " + max);
        System.out.println("Maths               120043              " + sub2 + "                  " + max);
        System.out.println("History             120044              " + sub3 + "                  " + max);
        System.out.println("English             120045              " + sub4 + "                  " + max);
        System.out.println("Hindi               120046              " + sub5 + "                  " + max);

        System.out.println("Total marks : " + (int) (total) + "/" + max * 5);

        System.out.println("Percentage : " + percentage + "%");
    }
}