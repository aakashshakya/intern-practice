package com.java8Collection;

import java.util.PriorityQueue;

public class PriorityQueueComparatorDemo {
    public static void main(String args[]) {
        PriorityQueue priority = new PriorityQueue(16,new MyStringComprator());
        priority.offer("A");
        priority.offer("Z");
        priority.offer("L");
        priority.offer("B");
        System.out.println(priority);

    }
}
