package com.company;

import java.util.*;
import java.util.function.Consumer;

public class Ch15_93_ArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> aq1 = new ArrayDeque<>(10);
        aq1.add(1);
        aq1.add(2);
        aq1.add(3);
        aq1.add(4);

        for (int e : aq1) {
            System.out.print(e + ", ");
        }
        System.out.println("\b\b");
    }
}
