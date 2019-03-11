package com.java8Collection;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String args[]) {
        ArrayList<Integer> integers = new ArrayList<Integer>();
        integers.add(5);
        integers.add(15);
        integers.add(20);
        integers.add(25);
        integers.add(30);
        integers.add(35);
        integers.add(-56);
        System.out.println("Size of list is" + " " + integers.size());//reading the size of list.
        System.out.println(integers.get(6));//Accessing the item by index.
        integers.add(2, 50);//Adding the element by index.
        System.out.println("Size of list is" + " " + integers.size());
        for (Integer listValue : integers) {//iterating and displaying the value present in the list.
            System.out.println(listValue);
        }
        System.out.println("Removing the element from the index 2");
        integers.remove(2);//Removing the element of the index 2.
        System.out.println("Size is: " + integers.size());//Calculate the size.
        for (Integer listValue : integers) {
            System.out.println(listValue);

        }
        int index = integers.indexOf(20);//finding the index value of 20.and placed in the variable index
        System.out.println("The index of search is: " + index);
        Integer searchItem = integers.get(index);//placing the the value of the evaluated index in the variable named searchItem.
        System.out.println("The searched value is: " + searchItem);//displaying the value present in search item.
    }
}
