package com.java8Collection;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Underlying data structure of hashset is hash table.
 * Duplicate object are not allowed.
 * insertion order is not preserved.
 * Null insertion is possible but only one time why not second time because duplicates are not allowed.
 */

public class HashSetConstructorDemo {
    public static void main(String args[]) {
        HashSet<String> hashSet = new HashSet();/**empty hashset constructor which has default capacity =16 and the default fill ratio is 0.75
         fill ratio 0.75 means after filling 75% new hash set object will be created automatically.
         */
        hashSet.add("Hello");//if you print this it returns true.
        hashSet.add("Manxey");//if you print this it returns true.
        hashSet.add("Shivam");//if you print this it returns true.
        hashSet.add("bandar");//if you print this it returns true.
        System.out.println(hashSet);//print the hash set
        hashSet.add("Hello");//Duplicate of 1st but it don't cause the compile time error but if you print it returns false and avoid insertion.
        System.out.println(hashSet);
        HashSet<Integer> hashSet1 = new HashSet<>(50);/** Initial capacity hash set constructor this constructor create the hash set with the
         defined capacity of hash set thai is  50 but have the default fill ratio 0.75.
         */
        hashSet1.add(1);
        hashSet1.add(36);
        hashSet1.add(45);
        hashSet1.add(15);
        hashSet1.add(20);
        hashSet1.add(45);//Duplicate of 3rd but it don't cause the compile time error but if you print it returns false and avoid insertion.
        System.out.println(hashSet1);

        HashSet hashSet2 = new HashSet(10, (float) 0.5);/**Hash set constructor with the initial capacity and the defined load factor
         or fill ratio*/
        hashSet2.add("Aakash Dai");
        hashSet2.add("Shyam");
        System.out.println(hashSet2.size());
        hashSet2.add("Ram");
        hashSet2.add("Shyam");
        hashSet2.add("Hari");
        hashSet2.add("Usha");
        hashSet2.add("Soumya");
        System.out.println(hashSet2.size());
        System.out.println(hashSet2);

        ArrayList<String> arrayList = new ArrayList();//Creating an empty array list.
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("E");
        arrayList.add("F");
        arrayList.add("G");
        arrayList.add("H");
        arrayList.add("A");
        HashSet hashSet3 = new HashSet(arrayList);//Creating equivalent hash set object of given collection(arraylist).
        System.out.println(hashSet3);//[A,B,C,D,E,F,G,H] Last A is not inserted in hash set boz duplicates are not allowed.


    }
}
