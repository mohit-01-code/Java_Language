package com.company.Ch11_60_PracticeSet;

abstract class pen {
    abstract public void write();

    abstract public void refill();
}

class fountainPen extends pen {
    public void write() {
        System.out.println("Writing with fountain pen.");
    }

    public void refill() {
        System.out.println("Refill of fountain pen.");

    }

    public void changeNib() {
        System.out.println("Change the Nib of the pen.");
    }
}

public class PS_Ch11_Q1AndQ2 {
    public static void main(String[] args) {
        fountainPen pen = new fountainPen();
        pen.write();
        pen.refill();
        pen.changeNib();
    }
}
