package com.company.Ch8_39_PracticeSet;

import java.util.Scanner;

class employee {
    int salary;
    String name;

    String getName(String n) {
        name = n;
        return name;
    }

    int getSalary(int s) {
        salary = s;
        return salary;
    }

    void setName() {
        System.out.println("Enter any name to change name: ");
        Scanner scan = new Scanner(System.in);
        name = scan.next();
    }
}

public class PS_Ch8_Q1 {

    public static void main(String[] args) {
        employee harry = new employee();
        System.out.println("The name of an employee is: " + harry.getName("HARRY"));
        System.out.println("The salary of " + harry.getName("HARRY") + " is: " + harry.getSalary(12000));
        harry.setName();
        System.out.println("The name of employee after changing the name: " + harry.name);

    }
}
