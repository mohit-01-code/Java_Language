package com.company.Ch2_12_PracticeSet;

import java.util.Scanner;

public class PS_Ch2_Q_1To5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Question 1
        float a = 7 / 4.0f * 9.0f / 2;//(7/5) * (9/2)
        System.out.println("The result of exp a is : " + a);

        //Question 2
        char grade = 'D';
        grade = (char) (grade + 8);//Encrypted grade by 8
        System.out.println("Encrypted grade : " + (grade));
        System.out.println("Decrypted grade : " + (char) (grade - 8));

        //Question 3
        System.out.print("Enter any number : ");
        int num = scan.nextInt();
        System.out.println(num + " is greater than 25 ?");
        System.out.println(num > 25);

        //Question 4
        float v = 9.0f, u = 1.0f, a1 = 15.0f, s = 2.0f;
        float exp1 = (v * v - u * u) / (2 * a1 * s);
        System.out.println(exp1);

        //Question 5
        int x = 7;
        int exp = 7 * 49 / 7 + 35 / 7;//[(7*49)/7] + (35/7)
        System.out.println(exp);
    }
}
