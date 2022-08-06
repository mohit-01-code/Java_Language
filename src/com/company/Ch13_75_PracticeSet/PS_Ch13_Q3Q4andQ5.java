package com.company.Ch13_75_PracticeSet;

class Q3Thr extends Thread {
    Q3Thr(String name) {
        super(name);
    }

    public void run() {
        System.out.println("Thread1 : " + this.getName());
        System.out.println("Priority for this thread is : " + this.getPriority());// getPriority
    }
}

public class PS_Ch13_Q3Q4andQ5 {
    public static void main(String[] args) {
        Q3Thr t1 = new Q3Thr("Harry1");
        Q3Thr t2 = new Q3Thr("Harry2");
        Q3Thr t3 = new Q3Thr("Harry3");
        Q3Thr t4 = new Q3Thr("Harry4");
        Q3Thr t5 = new Q3Thr("Harry5");

        t3.setPriority(Thread.MAX_PRIORITY);// setPriority
        t4.setPriority(Thread.MIN_PRIORITY);
        System.out.println("The state of this thread is : " + t1.getState());
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        System.out.println("The state of this thread is : " + t1.getState());
        System.out.println("The reference to the current thread is : " + Thread.currentThread().getState());
    }
}
