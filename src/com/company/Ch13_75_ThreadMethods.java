package com.company;

class myThr1 extends Thread {
    public void run() {
        for (int i = 0; i < 30000; i++) {
            System.out.println("Thread1");
        }
    }
}

class myThr2 extends Thread {
    public void run() {
        for (int i = 0; i < 30000; i++) {
            System.out.println("Thread2 : Thank you...");
        }
    }
}

public class Ch13_75_ThreadMethods {
    public static void main(String[] args) {
        myThr1 th1 = new myThr1();
        myThr2 th2 = new myThr2();

        th1.start();
//        th1.join(); --> Throws exception if the th1 is get killed

        try {
            th1.join(); // th2 will start only when th1 will end
        } catch (Exception e) {
            System.out.println(e);
        }
        th2.start();
    }
}
