package com.java8Collection;

import java.util.Comparator;

public class StudentComprator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        String name1 = o1.toString();
        String name2 = o2.toString();
        int length1 = name1.length();
        int length2 = name2.length();
        if (length1 < length2) {
            return -1;
        } else if (length1 > length2) {
            return +1;
        }else{
            return name1.compareTo(name2);
        }
    }
}
