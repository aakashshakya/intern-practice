package com.java8Collection;

import java.util.*;

public class HashMapDemo {
    public static void main(String args[]){
        HashMap hashMap= new HashMap();
        hashMap.put("karan",101);
        hashMap.put("shiva",102);
        hashMap.put("sankhar",103);
        hashMap.put("abishek",104);
        hashMap.put("rahul",105);
        System.out.println(hashMap);
        System.out.println(hashMap.put("karan",106));
        System.out.println(hashMap);
        Set set=hashMap.keySet();
        System.out.println("Key set is printing");
        System.out.println(set);
        Set set1=hashMap.entrySet();
        System.out.println("entry set is printing");
        System.out.println(set1);
        Collection collection =hashMap.values();
        System.out.println("Values collection are printing");
        System.out.println(collection);
        Iterator iterator =set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());

        }
        Iterator iterator1=set1.iterator();
        while (iterator1.hasNext()){
           // System.out.println(iterator1.next());
            Map.Entry entry=(Map.Entry)iterator1.next();
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            if(entry.getValue().equals(104)){
                entry.setValue(105);
            }

        }
System.out.println(hashMap);
    }
}
