package com.company;

public class Ch6_26_Arrays {
    public static void main(String[] args) {
        int[] marks; //Declaration of an Array
        marks = new int[5]; //Allocating memory of 5 integer

        marks[0] = 1;
        marks[1] = 15;
        marks[2] = 12;
        marks[3] = 14;
        marks[4] = 9;

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[4]);

        int[] arr = new int[7]; // Declaration and allocation together
        arr[5] = 120;
        arr[6] = 14;
        System.out.println(arr[5]);

        int[] arr2 = {5, 10, 12, 3, 0, 1}; //Declaration, allocation and initialization of an array
        System.out.println(arr2[2]);

    }
}
