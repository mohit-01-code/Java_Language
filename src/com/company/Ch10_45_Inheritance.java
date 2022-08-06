package com.company;

class Base {
    int x;
    int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

class Derived extends Base {
    int z;

    public int getZ() {
        return z;
    }

    public void setZ() {
        this.z = x + y;
    }

    public void display() {
        this.setZ();
        System.out.println("The value of z is : " + this.getZ());
    }
}

class Animal {
    int legs;
    String type;
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

class Dog extends Animal {
    String breed;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void sound() {
        System.out.println(this.getName() + " is Barking....");
    }


}

public class Ch10_45_Inheritance {
    public static void main(String[] args) {
        Derived d = new Derived();
        d.setX(12);
        d.setY(3);
        System.out.println("x = " + d.getX());
        System.out.println("y = " + d.getY());
        //d.setZ();
        d.display();

        Dog js = new Dog();
        js.setLegs(4);
        js.setType("Dog");
        js.setBreed("German Shepherd");
        js.setName("Tuffy");

        System.out.println("The animal is : " + js.getType());
        System.out.println("The " + js.getType() + " has " + js.getLegs() + " legs");
        System.out.println("The breed of " + js.getType() + " is : " + js.getBreed());
        System.out.println("The name of the " + js.getType() + " is : " + js.getName());
        js.sound();
    }
}
