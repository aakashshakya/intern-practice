package com.java8Collection;

import java.util.TreeMap;

public class StudentMainClass {
    public static void main(String args[]){
        StudentClass s1=new StudentClass("sushant",100);
        StudentClass s2=new StudentClass("hari",103);
        StudentClass s3=new StudentClass("shyam",102);
        StudentClass s4=new StudentClass("sankhar",106);
        StudentClass s5=new StudentClass("shivam",107);
        StudentClass s6=new StudentClass("aswin",108);
        StudentClass s7=new StudentClass("sujan",101);
        StudentClass s8=new StudentClass("ravi",102);
        TreeMap treeMap =new TreeMap(new StudentComprator());
        treeMap.put(s1,1);
        treeMap.put(s2,1);
        treeMap.put(s3,2);
        treeMap.put(s4,3);
        treeMap.put(s5,4);
        treeMap.put(s6,5);
        treeMap.put(s7,6);
        treeMap.put(s8,7);
        System.out.println(treeMap);
    }
}
