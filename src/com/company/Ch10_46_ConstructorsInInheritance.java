package com.company;

class base1 {
    int x;

    base1() {// Default constructor having zero parameter
        x = 5;
    }

    base1(int x) {//Constructor having one parameter
        this.x = x;
    }

    public int getX() {
        return x;
    }
}

class derived1 extends base1 {
    int y;

    public derived1() {// invokes default base class constructor having zero parameter
        this.y = 10;
    }

    public derived1(int y) {
        super(60);// invokes base class constructor having one parameter
        this.y = y;
    }

    public derived1(int x, int y) {
        super(x);
        this.y = y;
    }

    public int getY() {
        return y;
    }
}

class derived2 extends derived1 {
    int z;

    public derived2(int z, int y, int x) {
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }
}

public class Ch10_46_ConstructorsInInheritance {
    public static void display(derived1 d) {
        System.out.println("\nThe value of x is : " + d.getX());
        System.out.println("The value of y is : " + d.getY());
    }

    public static void display2(derived2 d) {
        System.out.println("\nThe value of x is : " + d.getX());
        System.out.println("The value of y is : " + d.getY());
        System.out.println("The value of z is : " + d.getZ());
    }

    public static void main(String[] args) {
        derived1 d = new derived1();
        display(d);

        derived1 d1 = new derived1(50);
        display(d1);

        derived1 d2 = new derived1(1, 2);
        display(d2);

        derived2 d3 = new derived2(100, 200, 300);
        display2(d3);

    }
}
