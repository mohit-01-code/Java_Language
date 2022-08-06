package com.company;

public class Ch2_10_IncrementAndDecrement {
    public static void main(String[] args) {
        //Quick quiz
        int a = 5;
        System.out.println("a is : " + a);//Initial value of a
        System.out.println("a++ is : " + a++);//first use the value then increment
        System.out.println("a is : " + a);//Value of a after increment
        System.out.println("++a is : " + (++a));//First increment then use the value of a
        System.out.println("a is : " + a);//Value of a after increment

        int y = 7;
        int x = ++y * 8;
        System.out.println("The value of x is : " + x);

        char a1 = 'B';
        System.out.println("a1 is : " + a1);
        a1++;
        System.out.println("a1++ is : " + a1);
        System.out.println("--a1 is : " + (--a1));

    }
}
