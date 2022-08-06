package com.company.Ch9_44_PracticeSet;

class CylinderMain {
    int height;
    int radius;

    public void setHeight(int h) {
        height = h;
    }

    public int getHeight() {
        return height;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }
}

public class PS_Ch9_Q1 {
    public static void main(String[] args) {
        CylinderMain c = new CylinderMain();
        c.setHeight(14);
        c.setRadius(6);
        System.out.println("The radius of the Cylinder is : " + c.getRadius());
        System.out.println("The Height of the Cylinder is : " + c.getHeight());
    }
}
