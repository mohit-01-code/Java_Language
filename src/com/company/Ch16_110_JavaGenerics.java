package com.company;

class MyGeneric<T1> { //T1 expects the primitive data type...
    int a = 12;
    T1 t1;

    public void setT1(T1 t) {
        this.t1 = t;
    }

    public T1 getT1() {
        return t1;
    }
}

class MyGeneric2<T1, T2> {
    T1 t1;
    T2 t2;

    MyGeneric2(T1 t1, T2 t2) {
        this.t1 = t1;
        this.t2 = t2;
    }

    public void display() {
        System.out.println("The value for T1 is " + t1 + ".\nThe value for T2 is " + t2 + ".");
    }
}

public class Ch16_110_JavaGenerics {
    public static void main(String[] args) {
        MyGeneric<String> strGen = new MyGeneric<>(); //Here String is primitive data type passed to generic
        strGen.setT1("I am String passes to generic..");
        System.out.println(strGen.getT1() + "\nThe value of a is " + strGen.a);

        MyGeneric<Integer> intGen = new MyGeneric<>();
        intGen.setT1(0);
        System.out.println("The value of integer passed to generic is " + intGen.getT1() + "\nThe value of a is " + intGen.a);

        MyGeneric2<String, Float> StrIntGen = new MyGeneric2<>("I am String, Integer generic", 0.25f);
        StrIntGen.display();
    }
}
