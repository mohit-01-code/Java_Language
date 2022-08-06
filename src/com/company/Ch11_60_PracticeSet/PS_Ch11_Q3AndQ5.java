package com.company.Ch11_60_PracticeSet;

interface basicAnimal {
    public void eat();

    public void sleep();
}

class monkey {
    int legs;

    public monkey(int legs) {
        this.legs = legs;
    }

    public int getLegs() {
        return legs;
    }

    public void bite() {
        System.out.println("Monkey is biting...");
    }

    public void jump() {
        System.out.println("Monkey is jumping...");
    }

}

class human extends monkey implements basicAnimal {
    String name;

    public String getName() {
        return name;
    }

    public human(int legs, String name) {
        super(legs);
        this.name = name;
    }

    public void eat() {
        System.out.println(this.getName() + " is eating...");
    }

    public void sleep() {
        System.out.println(this.getName() + " is sleeping");
    }

    public void display() {
        System.out.println(this.getName() + " is not a Basic Animal.");
    }
}

public class PS_Ch11_Q3AndQ5 {
    public static void main(String[] args) {
        human man1 = new human(2, "Harry");
        man1.eat();
        man1.sleep();
        System.out.println(man1.getName() + " has " + man1.getLegs() + " legs.");

        monkey monk = new monkey(4);
        monk.bite();
        monk.jump();
        System.out.println("Monkey has " + monk.getLegs() + " legs.");

        basicAnimal bAnimal = new human(2, "Basic animal");
//        bAnimal.display(); --> due to polymorphism it cannot access to Human class
        bAnimal.eat();
        bAnimal.sleep();
    }
}
