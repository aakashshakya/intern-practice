package com.java8Collection;

import java.util.TreeSet;

public class StringObjectTreeSet {
    public static void main(String args[]){
        TreeSet treeSet=new TreeSet(new MyStringComprator());
        treeSet.add("hari");
        treeSet.add("shyam");
        treeSet.add("sankhar");
        treeSet.add("abishek");
        treeSet.add("nishan");
        treeSet.add("abinesh");
        treeSet.add("bipin");
        treeSet.add("abinesh");
        treeSet.add("kalpana");
        System.out.println(treeSet);
    }

}
