package com.company;

class myThread1 extends Thread { // Extending thread class to make threads
    @Override
    public void run() {
        int i = 0;
        while (i < 30000) {
            System.out.println("This is thread 1.....");
            i++;
        }
    }
}

class myThread2 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 30000) {
            System.out.println("This is thread 2");
            i++;
        }
    }
}

public class Ch13_70_CreatingThreadByExtendingThreadClass {
    public static void main(String[] args) {
        myThread1 t1 = new myThread1();
        myThread2 t2 = new myThread2();

        t1.start();
        t2.start();
    }
}
