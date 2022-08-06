package com.company;

class MyRunnableThread1 implements Runnable {
    public void run() {
        for (int i = 0; i < 30000; i++) {
            System.out.println("Runnable interface 1....");
        }
    }
}

class MyRunnableThread2 implements Runnable {
    public void run() {
        for (int i = 0; i < 30000; i++) {
            System.out.println("Runnable interface 2");
        }
    }
}

public class Ch13_71_ThreadUsingRunnableInterface {
    public static void main(String[] args) {
        MyRunnableThread1 t1 = new MyRunnableThread1();
        Thread th1 = new Thread(t1);

        MyRunnableThread2 t2 = new MyRunnableThread2();
        Thread th2 = new Thread(t2);

        th1.start();
        th2.start();
    }
}
