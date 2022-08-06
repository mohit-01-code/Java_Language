package com.company.Ch9_44_PracticeSet;

class sphere {
    float radius;

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public float surfaceArea() {
        return 4 * 3.14f * radius * radius;
    }

    public float volume() {
        return (4.0f / 3) * 3.14f * radius * radius * radius;
    }

    public void display() {
        System.out.printf("The surface area of sphere having radius %.2f is : %.2f", this.getRadius(), this.surfaceArea());
        System.out.printf("\nThe volume of sphere having radius %.2f is : %.2f", this.getRadius(), this.volume());
    }
}

public class PS_Ch9_Q5 {
    public static void main(String[] args) {
        sphere s1 = new sphere();
        s1.setRadius(5.13f);
        s1.display();
    }
}
