package com.java8Collection;

import java.util.TreeSet;

public class StringBuffferDemo {
    public static void main(String args[]){
        TreeSet treeSet=new TreeSet(new MyBufferComparator());
        treeSet.add(new StringBuffer("hari"));
        treeSet.add(new StringBuffer("himash"));
        treeSet.add(new StringBuffer("shyam"));
        treeSet.add(new StringBuffer("ram"));
        treeSet.add(new StringBuffer("shiva"));
        treeSet.add(new StringBuffer("ravi"));
        treeSet.add(new StringBuffer("abishek"));
        System.out.println(treeSet);

    }
}
