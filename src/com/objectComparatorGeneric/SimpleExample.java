package com.objectComparatorGeneric;

import java.util.ArrayList;
import java.util.Collections;

public class SimpleExample {
    public static void main(String args[]) {
        ArrayList<Member> arrayList = new ArrayList<Member>();
        arrayList.add(new Member(25, "Hari", "Kathmandu"));
        arrayList.add(new Member(20, "Shyam", "Bharatpur"));
        arrayList.add(new Member(30, "Abishek", "Pokhara"));
        arrayList.add(new Member(35, "Sankhar", "Butwal"));
        arrayList.add(new Member(22, "Shiva", "Kailash"));

        System.out.println("Shorting according to age");
        Collections.sort(arrayList, new AgeComparator());
        for (Member mem : arrayList) {
            System.out.println("Name" + " " + mem.name + "Age" + mem.age + " " + "Address" + " " + mem.address);

        }
        System.out.println("\n");
        System.out.println("Shorting according to Name");
        Collections.sort(arrayList, new NameComparator());
        for (Member mem : arrayList) {
            System.out.println("Name" + " " + mem.name + "Age" + mem.age + " " + "Address" + " " + mem.address);
        }

    }
}
