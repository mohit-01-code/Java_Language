package com.company;

import java.util.Random;
import java.util.Scanner;

public class Ch9_43_Ex3_GuessTheNumber {

    public static void main(String[] args) {
        Random rand = new Random();
        int rand_num = rand.nextInt(100);
        System.out.println(rand_num);

        Scanner scan = new Scanner(System.in);
        int guessed_num = -1;
        int numberOfGuesses = 1;

        while (guessed_num != rand_num) {
            System.out.println("Guess the number: ");
            guessed_num = scan.nextInt();
            if (guessed_num > rand_num) {
                System.out.println("Aww ...Too big number.");
                numberOfGuesses++;
            } else if (guessed_num < rand_num) {
                System.out.println("Oops...its a small number.");
                numberOfGuesses++;
            }
        }
        System.out.println("yehh...You got the number in " + numberOfGuesses + " guesses.");
    }
}
