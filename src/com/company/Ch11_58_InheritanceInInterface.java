package com.company;

interface sampleInterface {
    public void meth1();

    public void meth2();
}

interface childSampleInterface extends sampleInterface {// Inheritance in interface

    public void meth3();

    public void meth4();
}

class sampleClass implements childSampleInterface {

    @Override
    public void meth3() {
        System.out.println("Meth 3");
    }

    @Override
    public void meth4() {
        System.out.println("Meth 4");
    }

    public void meth1() {
        System.out.println("Meth 1");
    }

    public void meth2() {
        System.out.println("Meth 2");
    }
}

public class Ch11_58_InheritanceInInterface {
    public static void main(String[] args) {
        sampleClass cl = new sampleClass();
        cl.meth1();
        cl.meth2();
        cl.meth3();
        cl.meth4();
    }
}
