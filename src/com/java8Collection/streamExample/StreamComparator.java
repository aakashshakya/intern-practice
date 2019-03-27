package com.java8Collection.streamExample;

import java.util.Comparator;

public class StreamComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Student student=(Student)o1;
        Student student1=(Student)o2;
        Integer l1=student.getName().length();
        Integer l2=student1.getName().length();
        return l1.compareTo(l2);

    }
}
