package com.company;

public class Ch7_31_Methods {
    int func2(int x1, int x2) {
        int z1;
        z1 = x1 + x2;
        return z1;
    }

    static int func(int x, int y) { //Static function is associate with class rather than the object
        int z;
        z = x * y;
        return z;
    }

    public static void main(String[] args) {
        int a = 12, b = 2;
        int c;
        c = func(a, b);
        System.out.println(c);

        //Process of method invocation
        Ch7_31_Methods obj = new Ch7_31_Methods(); //Created object of the class
        c = obj.func2(a, b); // Function call using object
        System.out.println(c);
    }
}
