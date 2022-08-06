package com.company.Ch4_19_PracticeSet;

import java.util.Scanner;

public class PS_Ch4_Q2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the maximum marks of the examination : ");
        float max_marks = scan.nextFloat();
        System.out.print("Enter your marks in Subject 1 : ");
        int sub1 = scan.nextInt();
        System.out.print("Enter your marks in Subject 2 : ");
        int sub2 = scan.nextInt();
        System.out.print("Enter your marks in Subject 3 : ");
        int sub3 = scan.nextInt();

        float total = sub1 + sub2 + sub3;
        float percentage = ((total) / (max_marks * 3)) * 100;
        float sub1_percent = (sub1 / max_marks) * 100;
        float sub2_percent = (sub2 / max_marks) * 100;
        float sub3_percent = (sub3 / max_marks) * 100;

        System.out.println("Subject         Marks     Percentage    Result");
        System.out.println("===============================================");
        if (sub1_percent < 33)
            System.out.println("Science         " + sub1 + "        " + sub1_percent + "        Fail");
        else
            System.out.println("Science         " + sub1 + "        " + sub1_percent + "        Pass");

        if (sub2_percent < 33)
            System.out.println("Mathematics     " + sub2 + "        " + sub2_percent + "        Fail");
        else
            System.out.println("Mathematics     " + sub2 + "        " + sub2_percent + "        Pass");

        if (sub3_percent < 33)
            System.out.println("English         " + sub3 + "        " + sub3_percent + "        Fail");
        else
            System.out.println("English         " + sub3 + "        " + sub3_percent + "        Pass");

        System.out.println("\nTotal : " + (int) total + "/" + (int) (max_marks * 3));
        System.out.println("Percentage : " + percentage + "%");
        if (sub1_percent < 33 || sub3_percent < 33 || sub2_percent < 33 || percentage < 40)
            System.out.println("Result : Fail");
        else
            System.out.println("Result : Pass");

    }
}
