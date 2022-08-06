package com.company;

import java.util.*;

public class Ch15_92_LinkedListAndMethods {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(12);
        l1.add(5);
        l1.add(2);
        l1.add(15);

        l1.addFirst(0);
        l1.addLast(20);
        l1.offer(100); //Adds the specified element as the tail of this list
        l1.offerFirst(1);
        l1.offerLast(101);
        System.out.println(l1.peek()); //Retrieves, but does not remove, the head (first element) of this list
        l1.poll();
        System.out.println(l1.poll()); //Retrieves and removes the head (first element) of this list
        l1.push(9); //Pushes an element onto the stack represented by this list

        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i) + ", ");
        }
        System.out.println("\b\b");
    }
}
