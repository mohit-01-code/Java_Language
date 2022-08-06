package com.company;

public class Ch6_27_ForEachLoop {
    public static void main(String[] args) {
        int[] arrInt = new int[5];
        arrInt[1] = 12;
        arrInt[2] = 13;
        arrInt[3] = 11;
        System.out.println("Displaying elements using naive way:");
        System.out.println(arrInt[0]);
        System.out.println(arrInt[1]);
        System.out.println(arrInt[2]);

        float[] arrFloat = {12.2f, 1.01f, 2.2f, 3.14f, 0.0f};
        System.out.println("Displaying elements using for loop:");
        for (int i = 0; i < arrFloat.length; i++) {
            System.out.println(arrFloat[i]);
        }

        String[] arrString = {"Captain", "Jarvis", "Tony", "Thanos"};
        System.out.println("Displaying elements using for-each loop:");
        for (String name : arrString) {
            System.out.println(name);
        }

        //Quick quiz
        System.out.println("Displaying marks in reverse order:");
        int[] marks = {40, 90, 80, 99, 98, 85, 50};
        for (int i = marks.length - 1; i >= 1; i--) {
            System.out.println(marks[i]);
        }
    }
}
