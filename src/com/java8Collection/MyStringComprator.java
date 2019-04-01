package com.java8Collection;

import java.util.Comparator;

public class MyStringComprator implements Comparator {
    @Override
    public int compare(Object obj1,Object obj2){
        String I1=(String)obj1;
        String I2=obj2.toString();
         return I1.compareTo(I2);//It send ascending order if we add - sign as it help to sort in descending order.
        // return -I1.compareTo(I2); it send the descending order i.e it return + value

    }
}
