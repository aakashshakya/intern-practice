package com.java8ComparatorExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Java8ComparatorExample {
    public static void main(String args[]) {
        ArrayList<Member> arrayList = new ArrayList<>();
        arrayList.add(new Member(15, "HAri", "Kathmandu"));
        arrayList.add(new Member(20, "Shyam", "Pokhara"));
        arrayList.add(new Member(30, "Birat", "chitwan"));
        arrayList.add(new Member(25, "Sankhar", "Bhairahawa"));
        arrayList.add(new Member(15, "Aakash", "Kathmandu"));
        arrayList.add(new Member(22, "Abishek", "parsa"));


        ArrayList<Member> arrayList2 = new ArrayList<>();
        arrayList2.add(new Member(15, "HAri", "Kathmandu"));
        arrayList2.add(new Member(20, "Shyam", "Pokhara"));
        arrayList2.add(new Member(30, "Birat", "chitwan"));
        arrayList2.add(new Member(25, "Sankhar", "Bhairahawa"));
        arrayList2.add(new Member(15, "Aakash", "Kathmandu"));
        arrayList2.add(new Member(22, "Abishek", "parsa"));

        System.out.println("Sorting By name");
        Comparator<Member> mem1 = Comparator.comparing(Member::getName);
        Collections.sort(arrayList, mem1);
        for (Member mem : arrayList) {
            System.out.println("Name" + " " + mem.getName() + " " + "Age" + " " + mem.getAge() + " " + "Address" + " " + mem.getAddress());
        }
        System.out.println("\nSorting By age\n");
        Comparator<Member> mem2 = Comparator.comparing(Member::getAge);
        Collections.sort(arrayList2, mem2);
        for (Member mem : arrayList2) {
            System.out.println("Name" + " " + mem.getName() + " " + "Age" + " " + mem.getAge() + " " + "Address" + " " + mem.getAddress());
        }
    }

}
