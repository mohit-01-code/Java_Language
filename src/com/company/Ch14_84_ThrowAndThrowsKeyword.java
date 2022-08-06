package com.company;

class NegativeRadiusException extends Exception {
    public String toString() {
        return "Radius cannot be negative...";
    }

    public String getMessage() {
        return "make sure the radius entered is correct..";
    }
}

public class Ch14_84_ThrowAndThrowsKeyword {
    public static double area(int r) throws NegativeRadiusException {
        if (r < 0) {
            throw new NegativeRadiusException();
        }
        return Math.PI * r * r;
    }

    public static int divide(int a, int b) throws ArithmeticException {
        return a / b;
    }

    public static void main(String[] args) {
        try {
            try {
                System.out.println("The area of circle is " + area(-4));
            } catch (NegativeRadiusException e) {
                System.out.println("Exception 1..");
                System.out.println(e);
                System.out.println(e.getMessage());
            }
            System.out.println(divide(10, 0));
        } catch (ArithmeticException e) {
            System.out.println("Exception 2..");
            System.out.println(e);
        }
    }
}