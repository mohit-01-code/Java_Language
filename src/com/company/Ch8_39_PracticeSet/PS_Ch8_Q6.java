package com.company.Ch8_39_PracticeSet;

class circle {
    float radius;

    void getRadius(float r) {
        radius = r;
    }

    void area() {
        System.out.println("The area of circle having radius " + radius + " is : " + (3.14 * radius * radius));
    }

    void circumfernce() {
        System.out.println("The circumfernce of circle having radius " + radius + " is : " + (2 * 3.14 * radius));
    }
}

public class PS_Ch8_Q6 {
    public static void main(String[] args) {
        circle c1 = new circle();
        c1.getRadius(5);
        c1.area();
        c1.circumfernce();

        circle c2 = new circle();
        c2.getRadius(11);
        c2.circumfernce();
        c2.area();
    }
}
