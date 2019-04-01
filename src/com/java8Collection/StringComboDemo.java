package com.java8Collection;

import java.util.TreeSet;

public class StringComboDemo {
    public static void main(String args[]){
        TreeSet treeSet = new TreeSet(new MyComboComparator());
        treeSet.add(new StringBuffer("hari"));
        treeSet.add(new StringBuffer("shyam"));
        treeSet.add(new StringBuffer("Ram"));
        treeSet.add("Shyamlal");
        treeSet.add("krishnalal");
        treeSet.add("abishekban");
        System.out.println(treeSet);


    }
}
