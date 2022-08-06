package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

class MaxInputException extends Exception {
    public String toString() {
        return "MaxInputException : Input cannot be greater than 100000";
    }
}

class MaxMultiplierReachedException extends Exception {
    public String toString() {
        return "MaxMultiplierReachedException : Multiplier input cannot be greater than 7000";
    }
}

public class Ch14_87_Ex6_CustomCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        try {
            System.out.println("Enter the value of a");
            a = sc.nextInt();
            System.out.println(a);
            System.out.println("Enter the value of b");
            b = sc.nextInt();
            System.out.println(b);
            if (a > 100000 && b > 100000) {
                throw new MaxInputException();
            }
            System.out.println("a + b = " + (a + b));
            System.out.println("a - b = " + (a - b));
            System.out.println("a / b = " + (a / b));
            if (a > 7000 || b > 7000) {
                throw new MaxMultiplierReachedException();
            }
            System.out.println("a * b = " + (a * b));
        } catch (InputMismatchException e) {
            System.out.println("Exception 1");
            System.out.println(e);
        } catch (ArithmeticException e) {
            System.out.println("Exception 2");
            System.out.println(e);
        } catch (MaxInputException e) {
            System.out.println("Exception 3");
            System.out.println(e);
        } catch (MaxMultiplierReachedException e) {
            System.out.println("Exception 4");
            System.out.println(e);
        }
    }
}