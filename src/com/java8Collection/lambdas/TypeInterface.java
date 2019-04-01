package com.java8Collection.lambdas;

public class TypeInterface {
    public static void main(String args[]){
       StringLambda lengthFunction=(String name)->name.length();
      System.out.println(lengthFunction.getLength("Sushant kandel"));
    }
    interface StringLambda{
        int getLength(String name);
    }
}
