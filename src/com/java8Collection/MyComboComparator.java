package com.java8Collection;

import java.util.Comparator;

public class MyComboComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {

        String name1 = o1.toString();
        String name2 = o2.toString();
        int l1 = name1.length();
        int l2 = name2.length();
        if (l1 < l2) {
            return -1;
        } else if (l1 > l2) {
            return +1;
        } else {
             return name1.compareTo(name2);
        }

    }
}
