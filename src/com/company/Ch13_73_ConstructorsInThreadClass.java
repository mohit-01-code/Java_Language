package com.company;

class myThr extends Thread{
    public myThr(String name){
        super(name);
    }
    public void run(){
        for(int i = 0; i < 12; i++){
            System.out.println("I am sample thread...");
        }
    }
}

class MyThrRunnable implements Runnable{

    public void run(){
        for(int i = 0; i < 9; i++){
            System.out.println("I am runnable ....");
        }
    }
}
public class Ch13_73_ConstructorsInThreadClass {
    public static void main(String[] args) {
        myThr t1 = new myThr("Harry");
        System.out.println(t1.getId());
        System.out.println(t1.getName());

        Thread thr1 = new Thread("Sharry");
        System.out.println(thr1.getId());
        System.out.println(thr1.getName());

        MyThrRunnable ThrRunnable = new MyThrRunnable();
        Thread thr2 = new Thread(ThrRunnable, "Mohit");
        System.out.println(thr2.getName());
        System.out.println(thr2.getId());
    }
}
