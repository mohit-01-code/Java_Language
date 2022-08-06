package com.company;

public class Ch7_34_Recursion {
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    static int fibbonaci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibbonaci(n - 1) + fibbonaci(n - 2);
        }
    }

    //0 1 1 2 3 5 8 13
    public static void main(String[] args) {
        System.out.println("The factorial of 4 is : " + factorial(4));
        System.out.println("The factorial of 5 is : " + factorial(5));
        System.out.println("The factorial of 7 is : " + factorial(7));

        //Quick Quiz
        System.out.println(fibbonaci(3));
    }
}
