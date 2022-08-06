package com.company;

public class Ch7_33_VariableArguments {
    static void sum(int... arr) { //Variable arguments (varArgs)
        int sum = 0;
        for (int e : arr) {
            sum += e;
        }
        System.out.println("The sun is : " + sum);
    }

    static void addNumber(int x, int... arr) {
        for (int e : arr) {
            x += e;
        }
        System.out.println("The sum after adding number is : " + x);
    }

    public static void main(String[] args) {
        sum(2, 4);
        sum(2, 3, 4);
        sum(1, 2, 3, 4, 5);

        addNumber(2, 4, 5);
        addNumber(4, 5, 6);
        //addNumber(); //Requires atleast 1 argument
    }
}
