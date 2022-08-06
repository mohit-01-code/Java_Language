package com.company;

abstract class parent {
    public int age;

    public void age(int age) {
        this.age = age;
        System.out.println("Parent age is : " + age);
    }

    public void intro() {
        System.out.println("I am parent");
    }

    abstract public void greet();

    abstract public void greet2();
}

class child extends parent {
    int age = 12;

    public void age() {
        System.out.println("I am 17 years old.");
    }

    @Override
    public void greet() {
        System.out.println("Good Afternoon.");
    }

    @Override
    public void greet2() {
        System.out.println("Good evening.");
    }
}

abstract class child2 extends parent {
    @Override
    public void intro() {
        System.out.println("I am child 2.");
    }

    @Override
    public void greet2() {
        System.out.println("Good evening.");
    }
}

public class Ch11_53_AbstractClassAndMethods {
    public static void main(String[] args) {
        child c = new child();
        c.greet();
        c.intro();
        c.age();
//       parent p = new parent(); -->Not allowed
        parent p = new child();
        p.greet();
        p.intro();
        p.age(45);

//       child2 c2 = new child2(); --> not allowed since child2 is an abstract class
    }
}
