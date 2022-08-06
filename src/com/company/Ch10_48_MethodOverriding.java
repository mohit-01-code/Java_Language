package com.company;

class A {
    int a;

    public A(int a) {
        this.a = a;
    }

    public void display() {
        System.out.println("The value of a is : " + a);

    }
}

class B extends A {
    int b;

    public B(int b) {
        super(5);
        this.b = b;
    }

    public void display() {// Override method
        System.out.println("The value of b is : " + b);
    }
}

public class Ch10_48_MethodOverriding {
    public static void main(String[] args) {
        B b = new B(12);
        b.display();
    }
}
