package com.company.Ch8_39_PracticeSet;

class cellphone {
    void ring() {
        System.out.println("ringing...");
    }

    void vibrate() {
        System.out.println("Vibrating...");
    }
}

public class PS_Ch8_Q2 {
    public static void main(String[] args) {
        cellphone galaxyA30 = new cellphone();
        galaxyA30.ring();

        cellphone iPhoneX = new cellphone();
        iPhoneX.vibrate();
    }
}
