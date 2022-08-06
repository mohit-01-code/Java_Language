package com.company;

import java.util.Scanner;
import java.util.Random;

public class Ch4_20_Ex2_RockPaperScissor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String u_name = scan.nextLine();
        System.out.print("Enter any name for Computer : ");
        String c_name = scan.nextLine();

        int u_point = 0, c_point = 0;//Initially zero points for both players
        System.out.print("How many Rounds you want play : ");
        int rounds = scan.nextInt();
        int roundNumber = 1;
        while (roundNumber <= rounds) {
            System.out.println("\nRound " + roundNumber);
            Random rand = new Random();//object is created of Random class
            int c_choice = rand.nextInt(4 - 1) + 1;// Int random number is generated between 1-3

            String comp_choice = null;
            if (c_choice == 1) {
                comp_choice = "Rock";
            }
            if (c_choice == 2) {
                comp_choice = "Paper";
            }
            if (c_choice == 3) {
                comp_choice = "Scissor";
            }

            System.out.print("\t\tEnter your choice : ");
            String user_choice = scan.next();
            System.out.println("\t\t" + c_name + "'s choice is : " + comp_choice);


            if (user_choice.equals(comp_choice)) {
                System.out.println("Tied");
                System.out.println(u_name + "'s point : " + u_point);
                System.out.println(c_name + "'s point : " + c_point);
            } else if (user_choice.equals("Rock") && comp_choice.equals("Paper")) {
                System.out.println(c_name + " got 1 point");
                c_point++;
                System.out.println(u_name + "'s point : " + u_point);
                System.out.println(c_name + "'s point : " + c_point);
            } else if (user_choice.equals("Rock") && comp_choice.equals("Scissor")) {
                System.out.println(u_name + " got 1 point.");
                u_point++;
                System.out.println(u_name + "'s point : " + u_point);
                System.out.println(c_name + "'s point : " + c_point);
            } else if (user_choice.equals("Paper") && comp_choice.equals("Rock")) {
                System.out.println(u_name + " got 1 point");
                u_point++;
                System.out.println(u_name + "'s point : " + u_point);
                System.out.println(c_name + "'s point : " + c_point);
            } else if (user_choice.equals("Paper") && comp_choice.equals("Scissor")) {
                System.out.println(c_name + " got 1 point");
                c_point++;
                System.out.println(u_name + "'s point : " + u_point);
                System.out.println(c_name + "'s point : " + c_point);
            } else if (user_choice.equals("Scissor") && comp_choice.equals("Rock")) {
                System.out.println(c_name + " got 1 point");
                c_point++;
                System.out.println(u_name + "'s point : " + u_point);
                System.out.println(c_name + "'s point : " + c_point);
            } else if (user_choice.equals("Scissor") && comp_choice.equals("Paper")) {
                System.out.println(u_name + " got 1 point");
                u_point++;
                System.out.println(u_name + "'s point : " + u_point);
                System.out.println(c_name + "'s point : " + c_point);
            }
            roundNumber++;
        }
        System.out.println("\n\t\tGAME OVER");
        System.out.println("\t\t" + u_name + " got point : " + u_point);
        System.out.println("\t\t" + c_name + " got point : " + c_point);

        if (u_point > c_point) {
            System.out.println("\t\t" + u_name + " won the game.");
        } else if (c_point > u_point) {
            System.out.println("\t\t" + c_name + " won the game");
        } else {
            System.out.println("\n\t\tTIE!!");
        }

    }
}
