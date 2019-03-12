package com.java8Collection;

import java.util.TreeSet;

/**Here the all the added value is homogeneous as we add the String .
 * when we add string there will not happen run time exception.
 * When we try to add String buffer then there occur run time exception.
 * In Tree set demo we are adding the string in tree set which don't encounter Class cast exception but
 * In this code it create Class Cast exception
 * Because added object should be Homogeneous and Comparable.
 * String object is homogeneous and comparable but the StringBuffer object is Homogeneous but not comparable As the
 * StringBuffer class didn't implement the comparable.
 *
 */

public class TreeSetDemo2 {
    public static void main(String args[]){
        TreeSet treeSet=new TreeSet();
        treeSet.add(new StringBuffer("A"));
        treeSet.add(new StringBuffer("B"));
        treeSet.add(new StringBuffer("C"));
        treeSet.add(new StringBuffer("L"));
        treeSet.add(new StringBuffer("Z"));
        System.out.println(treeSet);

    }
}
