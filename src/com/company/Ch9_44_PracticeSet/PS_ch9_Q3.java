package com.company.Ch9_44_PracticeSet;

class cylinder1 {
    int radius;
    int height;

    public cylinder1(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public int getHeight() {
        return height;
    }
}

public class PS_ch9_Q3 {
    public static void main(String[] args) {
        cylinder1 c1 = new cylinder1(7, 15);
        System.out.println("The radius of cylinder is : " + c1.getRadius());
        System.out.println("The height of cylinder is : " + c1.getHeight());

    }
}
