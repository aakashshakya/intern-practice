package com.java8Collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
    public static void main(String args[]) {
        Vector v = new Vector();
        for (int i = 1; i <= 10; i++) {
            v.addElement(i);
        }
        System.out.println(v);
        Enumeration e = v.elements();
        while (e.hasMoreElements()) {
            int i = (Integer) e.nextElement();
            int j=v.indexOf(i);
            System.out.println("i= "+j);
            if (i%2==0) {
                System.out.println(i);
            } else {
                System.out.println(i + " is removed");
                   v.removeElement(i);

                    //System.out.println(v);
            }

        }
        System.out.println(v);
    }
}
