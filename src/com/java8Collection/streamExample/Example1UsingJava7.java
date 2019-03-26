package com.java8Collection.streamExample;
/**
 * write a program to make a new list that contain only even number of the original list.
 * By using java 1.7
 */

import java.util.ArrayList;
import java.util.List;

public class Example1UsingJava7 {
    public static void main(String args[]) {
        List<Integer> l = new ArrayList<Integer>();
        l.add(0);
        l.add(1);
        l.add(5);
        l.add(2);
        l.add(20);
        l.add(25);
        l.add(30);
        l.add(10);
        System.out.println(l);
        List<Integer> l1 = new ArrayList<Integer>();
        for (Integer i : l) {
            if (i % 2 == 0) {
                l1.add(i);
            }
        }
        System.out.println(l1);


    }
}
