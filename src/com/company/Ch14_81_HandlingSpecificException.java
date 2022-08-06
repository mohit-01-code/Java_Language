package com.company;

import java.util.Scanner;

public class Ch14_81_HandlingSpecificException {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 12;
        marks[1] = 4;
        marks[2] = 10;

            System.out.println("Enter any index of an array");
            Scanner sc = new Scanner(System.in);
            int index = sc.nextInt();
        try {
            System.out.println("The value at index " + index + " is " + marks[index]);
            System.out.println("Enter any number to divide the value at index " + index + " in array");
            int num = sc.nextInt();
            System.out.println("The result is " + (marks[index] / num));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The length of the array is " + marks.length + ". Enter valid index.");
            System.out.println(e);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception...");
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("Other exception...");
            System.out.println(e);
        }
        System.out.println("Program ended successfully...");
    }
}
