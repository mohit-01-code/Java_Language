package com.company;

public class Ch2_09_PrecedenceAndAssociativity {
    public static void main(String[] args) {
        int x = 1 - 4 * 5;//precedence of '*' is more than '-'
        System.out.println(x);
        int a = 50 / 5 - 2 * 5;//Associativity is applied left to right
        int b = 5 * 4 - 20 / 2;
        System.out.println(a);
        System.out.println(b);
        int x1, y1;
        x1 = y1 = 10; //10 is assigned to y1 than value of y1 is assigned to x1(L to R)
        System.out.println("x1 = " + x1 + ", y1 = " + y1);

        //Quick quiz
        int x2 = 4, y2 = 8;
        int exp1 = (x2 - y2) / 2;
        System.out.println(exp1);

        int a1 = 8, b1 = 10, c = 20;
        int exp2 = (b1 * b1 - 4 * a1 * c) / (2 * a1);
        System.out.println(exp2);

        int v = 5, u = 3;
        int exp3 = v * v - u * u;
        System.out.println(exp3);

        int A = 9, B = 1, D = 8;
        int exp4 = A * B - D;
        System.out.println(exp4);
    }
}
