package com.company.Ch10_52_PracticeSet;

class base_ch10 {
    public base_ch10() {
        System.out.println("Base class constructor.");
    }
}

class derived1_ch10 extends base_ch10 {
    public derived1_ch10() {
        System.out.println("Derived1 class constructor.");
    }
}

class derived2_ch10 extends derived1_ch10 {
    public derived2_ch10() {
        System.out.println("Derived2 class constructor.");
    }
}

public class PS_Ch10_Q5 {
    public static void main(String[] args) {
        derived2_ch10 obj = new derived2_ch10();
    }
}
