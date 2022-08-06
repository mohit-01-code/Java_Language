package com.company;

interface bicycle1 {
    public int applyBreak(int decrement);

    public int speedUp(int increment);

    public void displaySpeed(int increment, int decrement);
}

interface GearCycle {
    public String shiftGear(int speed);
}

class AvonCycle1 implements bicycle1, GearCycle {
    int speed;

    public AvonCycle1(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public String shiftGear(int speed) {
        if (speed > 0 && speed < 5) {
            return "1st";
        } else if (speed >= 5 && speed < 10) {
            return "2nd";
        } else if (speed >= 10 && speed < 15) {
            return "3rd";
        } else if (speed >= 15 && speed < 20) {
            return "4th";
        } else if (speed >= 20) {
            return "5th";
        } else {
            return "0";
        }
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
        System.out.println("The Bicycle is running in " + this.shiftGear(this.getSpeed()) + " gear.");
        System.out.println("The speed of bicycle after applying break is : " + this.applyBreak(decrement) + "km/hr");
        System.out.println("The speed of bicycle after speed up is : " + this.speedUp(increment) + "km/hr");
    }
}

public class Ch11_55_MultipleInterfaces {
    public static void main(String[] args) {
        AvonCycle1 a1 = new AvonCycle1(12);
        a1.displaySpeed(3, 2);
    }
}
