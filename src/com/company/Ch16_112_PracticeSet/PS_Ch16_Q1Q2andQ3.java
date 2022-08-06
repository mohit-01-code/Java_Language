package com.company.Ch16_112_PracticeSet;

interface sampleInterface {
    public void meth1();

    public void meth2(int a);
}

class random {
    int a;

    random(int a) {
        this.a = a;
    }

    @Deprecated //Question 2
    public void display() {
        System.out.println("The value of a is " + a);
    }
}

public class PS_Ch16_Q1Q2andQ3 {
    @SuppressWarnings("Mathod deprecated") //Question 3
    public static void main(String[] args) {
        random obj = new random(12);
        obj.display(); //It throws warning as the method has deprecated annotation

        sampleInterface objInter = new sampleInterface() {
            @Override
            public void meth1() {
                System.out.println("I am method from interface..");
            }

            @Override
            public void meth2(int a) {
                System.out.println("The value of a from interface is " + a);
            }
        };
        objInter.meth1();
        objInter.meth2(12);
    }
}
