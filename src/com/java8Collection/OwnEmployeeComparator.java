package com.java8Collection;

import java.util.Comparator;

public class OwnEmployeeComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        OwnEmployeeClasses own1=(OwnEmployeeClasses)o1;
        OwnEmployeeClasses own2=(OwnEmployeeClasses)o2;
        String name1=own1.name;
        String name2=own2.name;
        return name1.compareTo(name2);
    }
}
