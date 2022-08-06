package com.company.Ch9_44_PracticeSet;

import java.util.Scanner;

class rectangle {
    int length;
    int breadth;

    public rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }

    public rectangle() {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nEnter the length of rectangle: ");
        length = scan.nextInt();
        System.out.println("Enter the breadth of rectangle : ");
        breadth = scan.nextInt();
    }

    public int area() {
        return length * breadth;
    }

    public int perimeter() {
        return 2 * (length + breadth);
    }

    public void display() {
        System.out.println("The area of rectangle having length " + this.getLength() + " and breadth " + this.getBreadth() + " is : " + this.area());
        System.out.println("The perimeter of rectangle having length " + this.getLength() + " and breadth " + this.getBreadth() + " is : " + this.perimeter());
    }
}

public class PS_Ch9_Q4 {
    public static void main(String[] args) {
        rectangle r1 = new rectangle(4, 5);
        r1.display();
        rectangle r2 = new rectangle();
        r2.display();
    }
}
