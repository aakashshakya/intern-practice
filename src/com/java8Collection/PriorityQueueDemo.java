package com.java8Collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String args[]){
        PriorityQueue priorityQueue=new PriorityQueue();
        System.out.println(priorityQueue.peek());
        //System.out.println(priorityQueue.element());[NoSuchException Occurs]
         for(int i=0;i<=10;i++){
             priorityQueue.offer(i);
         }
         System.out.println(priorityQueue);
      Iterator itr=priorityQueue.iterator();
      while (itr.hasNext()){
          System.out.println(itr.next());
      }

      System.out.println(priorityQueue.poll());//if queue is empty it returns null
        System.out.println(priorityQueue.remove());//if queue is empty it returns NoSuchElementException
        System.out.println(priorityQueue);//Here after using the poll and remove the placement of the remaining object in the queue
         //is not preserved it is done default sorting order.so to make it on our order we use My comparator.


        }
    }

