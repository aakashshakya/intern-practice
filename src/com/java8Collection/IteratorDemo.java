package com.java8Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String args[]) {
        ArrayList al = new ArrayList();
        for (int i = 0; i < 10; i++) {
            al.add(i);
        }
        System.out.println("The System Value is" + al);
        Iterator itr = al.iterator();
        while (itr.hasNext()) {
            int value = (Integer) itr.next();

            if (value % 2 == 0) {
                System.out.println(value);
            } else {
                itr.remove();
            }
        }
        System.out.println(al);
    }
}
