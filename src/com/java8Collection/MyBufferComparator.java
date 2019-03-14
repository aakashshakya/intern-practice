package com.java8Collection;

import java.util.Comparator;

public class MyBufferComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        String name1=o1.toString();
        String name2=o2.toString();
        return -name1.compareTo(name2);
    }
}
