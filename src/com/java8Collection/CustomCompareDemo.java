package com.java8Collection;

import java.util.TreeSet;

public class CustomCompareDemo {
    public static void main(String args[]){
        TreeSet treeSet =new TreeSet( new MyComparator());
        treeSet.add(15);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(35);
        treeSet.add(45);
        treeSet.add(50);
        treeSet.add(65);
        treeSet.add(55);
        System.out.println(treeSet);

    }
}
