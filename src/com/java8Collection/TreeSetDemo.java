package com.java8Collection;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String args[]){
        TreeSet treeSet= new TreeSet();
       treeSet.add("A");
        treeSet.add("B");
        treeSet.add("N");
        treeSet.add("c");
        treeSet.add("C");
        treeSet.add("b");
        treeSet.add("N");
       // treeSet.add(new Integer(10));//If we try to add heterogeneous object class cast exception occur.
        //treeSet.add(10);
        //treeSet.add(null);//--Null pointer exception occur null is not allowed from 1.7 version.
        System.out.println(treeSet);
    }
}
