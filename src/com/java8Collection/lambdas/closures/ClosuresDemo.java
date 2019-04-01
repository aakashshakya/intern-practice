package com.java8Collection.lambdas.closures;

public class ClosuresDemo {
    public static void main(String args[]){
     int a=10;
     int b=20;

     doProcess(a, new Process() {
         @Override
         public void practice(int i) {
             System.out.println(i+b);
         }
     });

    }

    private static void doProcess(int i,Process process){
        process.practice(i);
    }
    interface Process{
        void practice(int i);
    }
}

