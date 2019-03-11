package com.objectComparatorGeneric;

import java.util.Comparator;

public class NameComparator implements Comparator<Member> {
    public int compare(Member member1,Member member2){
        return member1.name.compareTo(member2.name);
    }
}
