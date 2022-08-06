package com.company.Ch4_19_PracticeSet;

import java.util.Scanner;

public class PS_Ch4_Q3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your income slab ");
        int income_slab = scan.nextInt();
        if (income_slab < 250000)
            System.out.println("You have not to pay tax to government");
        else if (income_slab >= 250000 && income_slab < 500000)
            System.out.println("You have to pay Rs." + (income_slab / 100) * 5 + " as an income tax to Government.");
        else if (income_slab >= 500000 && income_slab < 1000000)
            System.out.println("You have to pay Rs." + (income_slab / 100) * 20 + " as an income tax to Government.");
        else if (income_slab >= 100000)
            System.out.println("You have to pay Rs." + (income_slab / 100) * 30 + " as an income tax to Government.");

    }
}
