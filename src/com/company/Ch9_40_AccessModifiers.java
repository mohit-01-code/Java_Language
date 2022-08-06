package com.company;

class Myemployee {
    private int id; //private access modifier
    private String name;

    public void setId(int i) {// Setter
        id = i;
    }

    public int getId() {// Getter
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Ch9_40_AccessModifiers {
    public static void main(String[] args) {
        Myemployee harry = new Myemployee();
//        harry.id = 422; ->throws error due to access modifier (private)
//        harry.name = "Harish Khan";
        harry.setId(422);
        harry.setName("Harish Khan");
        System.out.println("Employee id is : " + harry.getId());
        System.out.println("Employee name is : " + harry.getName());

        //Quick Quiz
        Myemployee e1 = new Myemployee();
        e1.setName("Mohit Rajpurohit");
        e1.setId(112);
        System.out.println("Employee id is : " + e1.getId());
        System.out.println("Employee name is : " + e1.getName());
    }
}
