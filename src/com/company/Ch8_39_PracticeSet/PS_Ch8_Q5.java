package com.company.Ch8_39_PracticeSet;

class rockStarGame {
    void hitting() {
        System.out.println("Hitting...");
    }

    void running() {
        System.out.println("Running...");
    }

    void firing() {
        System.out.println("firing...");
    }
}

public class PS_Ch8_Q5 {
    public static void main(String[] args) {
        rockStarGame TommyVecetti = new rockStarGame();
        TommyVecetti.hitting();
        TommyVecetti.running();
        TommyVecetti.firing();
    }

}
