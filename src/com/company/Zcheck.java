package com.company;
import java.net.*;
import java.io.*;
import java.util.PriorityQueue;

class Zcheck {
            PriorityQueue<String> pq = new PriorityQueue<>();
            pq.add("banana");
            pq.add("pear");
            pq.add("mango");

            pq.add("apple");
            System.out.println(pq.poll()+" "+pq.peek()+" "+pq.poll());
        }
}