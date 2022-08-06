package com.company;
import java.util.Scanner; //import scanner class
public class Ch1_05_GettingUserInput {
    public static void main(String[] args){
        System.out.println("Taking input from the user");
        Scanner scan = new Scanner(System.in); //Creating object of scanner class

        //String str = scan.next();//Will take only single word
        String str1 = scan.nextLine(); //will take full line
        System.out.println(str1);

        System.out.println("Enter an integer number 1 ");
        int num1 = scan.nextInt();//calling nextInt() method from scanner class using object
        System.out.println("Enter an integer number 2");
        int num2 = scan.nextInt();//calling nextInt() method from scanner class using object
        int sum = num1 + num2;
        System.out.println(sum);

        System.out.println("Enter float number 1");
        float f1 = scan.nextFloat();
        System.out.println("Enter float number 2");
        float f2 = scan.nextFloat();
        float sum1 = f1+f2;
        System.out.println(sum1);

        System.out.println("Check integer value");
        boolean b1 = scan.hasNextInt(); //check for input value(int or not)
        System.out.println(b1);
    }
}