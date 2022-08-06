package com.company.Ch10_52_PracticeSet;

class rectangle {
    int length;
    int breadth;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int area() {
        return this.length * this.breadth;
    }

    public void display() {
        System.out.format("The area of rectangle having length %d and breadth %d is %d.\n", this.getLength(), this.getBreadth(), this.area());
    }
}

class cuboid extends rectangle {
    int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int volume() {
        return this.length * this.breadth * this.height;
    }

    public void display() {
        System.out.format("The volume of cuboid having length %d, breadth %d and height %d is %d.\n", this.getLength(), this.getBreadth(), this.getHeight(), this.volume());
    }
}

public class PS_Ch10_Q2andQ4 {
    public static void main(String[] args) {
        rectangle r1 = new rectangle();
        r1.setLength(10);
        r1.setBreadth(5);
        r1.display();
        cuboid c1 = new cuboid();
        c1.setHeight(5);
        c1.setLength(9);
        c1.setBreadth(10);
        c1.display();
    }
}
