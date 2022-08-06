package com.company;

import java.util.Scanner;

class cricket {
    int run;
    String name;
    float strikeRate;

    public cricket(String n, int r, float sr) { //Constructor
        run = r;
        name = n;
        strikeRate = sr;
    }

    public cricket(int r, float sr) { //Constructor overloading
        run = r;
        strikeRate = sr;
    }

    public cricket(float sr) {
        System.out.println("Enter the player name : ");
        Scanner scan = new Scanner(System.in);
        name = scan.nextLine();
        strikeRate = sr;
    }

    public cricket() {
        System.out.print("Enter the player name : ");
        Scanner scan = new Scanner(System.in);
        name = scan.nextLine();
        System.out.print("Enter run made : ");
        run = scan.nextInt();
        System.out.print("Enter the Strike rate : ");
        strikeRate = scan.nextFloat();
    }

    public void displayDetail() {
        System.out.println("Player name : " + name);
        System.out.println("Run made : " + run);
        System.out.println("Strike rate : " + strikeRate);
    }
}

public class Ch9_42_Constructors {
    public static void main(String[] args) {
        cricket player1 = new cricket("Mohit", 150, 141.21f);
        player1.displayDetail();

        cricket player2 = new cricket(78, 99.9f);
        player2.name = "Captain MSD";
        player2.displayDetail();

        cricket player3 = new cricket(111.1f);
        player3.run = 100;
        player3.displayDetail();

        cricket player4 = new cricket();
        player4.displayDetail();
    }
}
