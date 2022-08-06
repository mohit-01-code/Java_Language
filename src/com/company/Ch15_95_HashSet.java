package com.company;

import java.util.*;

public class Ch15_95_HashSet {
    public static void main(String[] args) {
        HashSet<Integer> myHashSet = new HashSet<>(5, 0.5f);
        myHashSet.add(1);
        myHashSet.add(2);
        myHashSet.add(3);
        myHashSet.add(4);
        System.out.println(myHashSet);

        for (int e : myHashSet) {
            System.out.println(e);
        }
    }
}
