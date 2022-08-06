package com.company;

class ThrPriority extends Thread {
    ThrPriority(String name) {
        super(name);
    }

    public void run() {
        System.out.println("Thank you: " + this.getName());
    }
}

public class Ch13_74_ThreadPriority {
    public static void main(String[] args) {
        ThrPriority t1 = new ThrPriority("Harry1");
        ThrPriority t2 = new ThrPriority("Harry2 (Not important...");
        ThrPriority t3 = new ThrPriority("Harry3");
        ThrPriority t4 = new ThrPriority("Harry4 (Most important...");
        ThrPriority t5 = new ThrPriority("Harry5 (Normal important...");

        t4.setPriority(Thread.MAX_PRIORITY); //Maximum priority
        t2.setPriority(Thread.MIN_PRIORITY); //Minimum priority
        t5.setPriority(Thread.NORM_PRIORITY); //Normal priority
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
