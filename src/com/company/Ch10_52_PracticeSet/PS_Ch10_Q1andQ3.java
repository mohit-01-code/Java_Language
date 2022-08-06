package com.company.Ch10_52_PracticeSet;

class circle {
    int r;

    public circle(int r) {
        this.r = r;
    }

    public int getR() {
        return r;
    }

    public double area() {// Question 3
        return Math.PI * this.r * this.r;
    }

    public void display() {
        System.out.format("The area of circle having radius %d is : %.2f.\n", this.getR(), this.area());
    }
}

class cylinder_Q1 extends circle {
    int h;

    public cylinder_Q1(int r, int h) {
        super(r);
        this.h = h;
    }

    public int getH() {
        return h;
    }

    public double volume() {// Question 3
        return Math.PI * this.r * this.r * this.h;
    }

    public void display() {
        System.out.format("The volume of cylinder having radius %d and height %d is %.2f.\n", this.getR(), this.getH(), this.volume());
    }
}

public class PS_Ch10_Q1andQ3 {
    public static void main(String[] args) {
        circle c1 = new circle(7);
        c1.display();
        cylinder_Q1 c2 = new cylinder_Q1(3, 9);
        c2.display();
    }
}
