package com.java8Collection;


import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String args[]){
        TreeMap treeMap =new TreeMap(new TreeMapComparator());
        treeMap.put("sushant",103);
        treeMap.put("hari",104);
        treeMap.put("shyam",105);
        treeMap.put("sankhar",106);
        treeMap.put("shivam",107);
        treeMap.put("aswin",108);
        treeMap.put("sujan",101);
        treeMap.put("ravi",102);
        System.out.println(treeMap);

    }

}

