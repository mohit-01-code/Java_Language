package com.company;

public class Ch7_32_MethodOverloading {
    static void greet() {// no return type (void) with no parameters
        System.out.println("Hello, Nice to meet you");
    }

    static void add(int x, int y) {// void return with parameter x and y
        int z = x + y;
        System.out.println("The addition of " + x + " and " + y + " is: " + z);
    }

    static void func() {
        System.out.println("The function has no value in it.");
    }

    static void func(int x) {
        System.out.println("The value in the function is : " + x);
    }

    static void func(int x, int y) {
        System.out.println("The value in the function is : " + x + " " + y);
    }

    static void func(int x, int y, int x1) {
        System.out.println("The value in the function is : " + x + " " + y + " " + x1);
    }

    public static void main(String[] args) {
        greet();
        int a = 12, b = 3;
        add(a, b);

        //Method overloading
        func();
        func(200);
        func(500, 1000);
        func(12, 14, 18);

    }
}