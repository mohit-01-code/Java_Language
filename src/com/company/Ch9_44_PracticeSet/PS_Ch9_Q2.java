package com.company.Ch9_44_PracticeSet;

class cylinder {
    float radius;
    float height;

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getHeight() {
        return height;
    }

    public float volume() {
        return (3.14f * radius * radius * height);
    }

    public float surfaceArea() {
        return (2 * 3.14f * radius * height);
    }
}

public class PS_Ch9_Q2 {
    public static void main(String[] args) {
        cylinder c1 = new cylinder();
        c1.setRadius(5.12f);
        c1.setHeight(12.22f);
        System.out.println("The volume of cylinder having radius " + c1.getRadius() + " and height " + c1.getHeight() + " is : " + c1.volume());
        System.out.println("The Surface area of cylinder having radius " + c1.getRadius() + " and height " + c1.getHeight() + " is : " + c1.surfaceArea());
    }
}
