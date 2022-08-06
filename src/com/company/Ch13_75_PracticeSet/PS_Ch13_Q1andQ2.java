package com.company.Ch13_75_PracticeSet;

class Q1Thread extends Thread {
    public void run() {
        for(int i = 0; i < 30000; i++){
            System.out.println("Good Morning...Welcome");
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class PS_Ch13_Q1andQ2 {
    public static void main(String[] args) {
        Q1Thread thr = new Q1Thread();
        thr.start();
    }
}
