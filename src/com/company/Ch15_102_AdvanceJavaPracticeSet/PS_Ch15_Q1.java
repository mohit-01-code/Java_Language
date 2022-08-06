package com.company.Ch15_102_AdvanceJavaPracticeSet;

import java.util.ArrayList;

public class PS_Ch15_Q1 {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>(10);
        students.add("Sergio(Professor)");
        students.add("Rio");
        students.add("Tokyo");
        students.add("Denver");
        students.add("Alicia Ciara");
        students.add("Arturo Roman");
        students.add("Monika Gastambida");
        students.add("Gandiya");
        students.add("Raquell Morio");
        students.add("Nairobi");
        students.add("Berlin");

        System.out.println("The list of the students are:");
        for(String name : students){
            System.out.println(name);
        }
    }
}
