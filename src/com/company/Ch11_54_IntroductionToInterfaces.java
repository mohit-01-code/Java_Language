package com.company;

interface bicycle {
    public int applyBreak(int decrement);

    public int speedUp(int increment);

    public void displaySpeed(int increment, int decrement);
}

class AvonCycle implements bicycle {
    int speed = 7;

    public int getSpeed() {
        return speed;
    }

    public int applyBreak(int decrement) {
        speed = speed - decrement;
        return speed;
    }

    public int speedUp(int increment) {
        speed = speed + increment;
        return speed;
    }

    public void displaySpeed(int increment, int decrement) {
        System.out.println("Initial speed of bicycle is : " + this.getSpeed() + "km/hr");
        System.out.println("The speed of bicycle after applying break is : " + this.applyBreak(decrement) + "km/hr");
        System.out.println("The speed of bicycle after speed up is : " + this.speedUp(increment) + "km/hr");
    }
}

public class Ch11_54_IntroductionToInterfaces {
    public static void main(String[] args) {
        AvonCycle a1 = new AvonCycle();
        a1.displaySpeed(3, 2);
    }
}
