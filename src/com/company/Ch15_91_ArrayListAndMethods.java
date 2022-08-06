package com.company;
//import java.util.ArrayList;

import java.util.*;

public class Ch15_91_ArrayListAndMethods {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>(10);
        ArrayList<Integer> l2 = new ArrayList<>(10);
        Scanner scan = new Scanner(System.in);
        l1.add(12); //insert specified element to the end of the array list
        l1.add(1);
        l1.add(2);
        l1.add(7);
        l1.add(9);
        for (int i = l1.size()+1; i <= 10; i++) {
            l1.add(scan.nextInt());
        }
        l1.add(0, 0); //insert specified element at specified index
        System.out.println(l1.clone() + " - l1.clone()"); //returns shallow copy of this array instance
        System.out.println(l1.contains(3) + " - l1.contains(3)"); //returns true if list contains specified element, false otherwise
        System.out.println(l1.hashCode() + " - l1.hashCode()"); //Returns the hash code value for this list
        System.out.println(l1.indexOf(7) + " - l1.indexOf(7)"); //Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element
        l1.remove(2); //removes the element at the specified position in the list
        l1.set(0, 1); //Replaces the element at the specified position in this list with the specified element
        System.out.println(l1.subList(2, 5) + " - l1.subList(2, 5)");
        System.out.println(l1.toArray());

        l2.add(121);
        l2.add(122);
        l2.add(123);
        l2.add(124);
        l1.addAll(l2); //Inserts all the elements of l2 list at the end of l1 list
        System.out.println(l1.equals(l2) + " - l1.equals(l2)"); //Compares the specified object with this list for equality
        l2.clear(); //removes all the elements from l2 list
        System.out.println(l2.isEmpty() + " - l2.isEmpty()");

        System.out.println("\b\b");
        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i) + ", "); //returns element at the specified position in the list
        }
        System.out.println("\b\b");
    }
}
