package com.objectComparatorGeneric;

import java.util.Comparator;

public class AgeComparator implements Comparator<Member> {
    public int compare(Member member1,Member member2){
        if(member1.age<member2.age){
            return -1;
        }else if(member1.age>member2.age){
            return 1;

        }else {
            return 0;
        }
    }

}
