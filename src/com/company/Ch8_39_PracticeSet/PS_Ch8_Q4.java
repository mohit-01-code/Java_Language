package com.company.Ch8_39_PracticeSet;

class rectangle {
    int length, breadth;

    void getSide(int l, int b) {
        length = l;
        breadth = b;
    }

    void perimeter() {
        System.out.println("The perimeter of rectangle having length " + length + " and breadth " + breadth + " is : " + (2 * (length + breadth)));
    }

    void area() {
        System.out.println("The area of rectangle having length " + length + " and breadth " + breadth + " is : " + (length * breadth));
    }
}

public class PS_Ch8_Q4 {
    public static void main(String[] args) {
        rectangle r1 = new rectangle();
        r1.getSide(5, 9);
        r1.area();
        r1.perimeter();

        rectangle r2 = new rectangle();
        r2.getSide(10, 55);
        r2.area();
        r2.perimeter();
    }
}
