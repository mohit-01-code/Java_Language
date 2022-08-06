package com.company;

public class Ch2_08_OperatorsAndExpressions {
    public static void main(String[] args) {
        //Arithmetic operator
        int a = 9;
        int b = 4;
        System.out.println("a+b = " + (a + b)); //'+' operator for addition
        System.out.println("a-b = " + (a - b));
        System.out.println("a*b = " + (a * b));
        System.out.println("a/b = " + (a / b));
        System.out.println("a%b = " + (a % b)); //'%' modulus operator

        //Assignment operator
        int x;
        x = 1; // 1 is assigned to x using '=' operator
        x += 5; //Increment 5 by 1 then assign to x
        System.out.println(x);

        //Comparison operator
        System.out.println("2==4 ? -> " + (2 == 4));
        System.out.println("2==2 ? -> " + (2 == 2));
        System.out.println("2<=5 ? -> " + (2 <= 5));
        System.out.println("2>=5 ? -> " + (2 >= 5));

        //Logical operators
        System.out.println("2==2? And 2<=5? ->" + (2 == 2 && 2 <= 5));// '&&' Logical AND operator
        System.out.println("4>5? And 2<=5? ->" + (4 > 5 && 2 <= 5));
        System.out.println("10>=20? And 5==50? ->" + (10 >= 20 && 5 == 50));

        System.out.println("2==2? Or 2<=5? ->" + (2 == 2 || 2 <= 5));// '||' Logical Or operator
        System.out.println("4>5? Or 2<=5? ->" + (4 > 5 || 2 <= 5));
        System.out.println("10>=20? Or 5==50? ->" + (10 >= 20 || 5 == 50));
    }
}
