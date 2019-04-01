package com.java8Collection;

import java.util.TreeSet;

public class OwnEmployeeComparable {
    public static void main(String args[]){
        OwnEmployeeClasses employee1=new OwnEmployeeClasses("Hari",100);
        OwnEmployeeClasses employee2=new OwnEmployeeClasses("Pari",101);
        OwnEmployeeClasses employee3=new OwnEmployeeClasses("Mori",102);
        OwnEmployeeClasses employee4=new OwnEmployeeClasses("Geeta",103);
        OwnEmployeeClasses employee5=new OwnEmployeeClasses("Meeta",104);
        TreeSet treeSet =new TreeSet();
        treeSet.add(employee1);
        treeSet.add(employee2);
        treeSet.add(employee3);
        treeSet.add(employee4);
        treeSet.add(employee5);
        System.out.println(treeSet);
        TreeSet treeSet1=new TreeSet(new OwnEmployeeComparator());
        treeSet1.add(employee1);
        treeSet1.add(employee2);
        treeSet1.add(employee3);
        treeSet1.add(employee4);
        treeSet1.add(employee5);
        System.out.println(treeSet1);


    }
}
