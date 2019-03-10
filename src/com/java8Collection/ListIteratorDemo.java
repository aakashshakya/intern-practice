package com.java8Collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String args[]) {
        LinkedList<String> linkedList = new LinkedList();
        linkedList.add("HAri");
        linkedList.add("Shyam");
        linkedList.add("Shivam");
        linkedList.add("Surya");
        linkedList.add("Amrit");
        linkedList.add("Sankhar");
        linkedList.add("Soumya");
        linkedList.add("Musi");
        System.out.println(linkedList);
        ListIterator litr = linkedList.listIterator();
        while (litr.hasNext()) {
            String name = (String) litr.next();
            System.out.println(name);
            int index = litr.nextIndex();
            if (index % 2 == 0) {
               // System.out.println(index);
                litr.set("Jay Shree Ram");

            }

        }
        System.out.println(linkedList);
        System.out.println(litr.hasNext());
        while (litr.hasPrevious()){
            System.out.println(litr.previous());
            System.out.println(litr.previousIndex());
        }

        while (litr.hasNext()){
            String name =(String)litr.next();
          if(name.equals("Jay Shree Ram")){
              litr.remove();
          }
        }
        System.out.println(linkedList);
    }
}
