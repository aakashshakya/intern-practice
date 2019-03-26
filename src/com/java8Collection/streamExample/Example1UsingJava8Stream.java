package com.java8Collection.streamExample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Example1UsingJava8Stream {
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
        List<Integer> l1 = l.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(l1);
    }
}
