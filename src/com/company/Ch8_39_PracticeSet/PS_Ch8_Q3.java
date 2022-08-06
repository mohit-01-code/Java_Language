package com.company.Ch8_39_PracticeSet;

class square {
    int side;

    void getSide(int s) {
        side = s;
    }

    void area() {
        System.out.println("The area of square having side " + side + " is : " + (side * side));

    }

    void perimeter() {
        System.out.println("The perimeter of square having side " + side + " is : " + (side * 4));
    }
}

public class PS_Ch8_Q3 {
    public static void main(String[] args) {
        square s1 = new square();
        s1.getSide(5);
        s1.area();
        s1.perimeter();

        square s2 = new square();
        s2.getSide(20);
        s2.perimeter();
        s2.area();
    }
}
