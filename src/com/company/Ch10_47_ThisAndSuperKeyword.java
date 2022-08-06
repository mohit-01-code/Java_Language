package com.company;

class baseClass {
    int a;
    int b;

    baseClass(int a) {
        System.out.println("Base class constructor");
        this.a = a; // 'this' is a reference to the object of baseClass
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}

class derivedClass extends baseClass {
    int c;

    derivedClass(int a, int b, int c) {
        super(a);// refer to immediate parent class constructor
        super.b = b; //refer to immediate parent class variable
        System.out.println("b = " + super.getB());// refer to immediate parent class method
        this.c = c;
    }

    public int getC() {
        return c;
    }
}

public class Ch10_47_ThisAndSuperKeyword {
    public static void main(String[] args) {
//        baseClass b = new baseClass(10);
//        System.out.println(b.getA());
        derivedClass d = new derivedClass(12, 10, 5);
        System.out.println("c = " + d.getC());
        System.out.println("a = " + d.getA());

    }
}
