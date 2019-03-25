package com.java8Collection.lambdas.thisReference;

import java.util.function.Consumer;

public class ThisReferenceLambda {
    public void doProcess(int a, Consumer<Integer> consumer){
        consumer.accept(a);
    }
    public static void main(String args[]){
        ThisReferenceLambda thisReferenceLambda=new ThisReferenceLambda();
        thisReferenceLambda.doProcess(5,i->{
            System.out.println(i);
           // System.out.println(this); //in the lambda the this reference point the reference above the lambda expression here it
            //is static so this is not allowed inside the static main to point static main reference
            //in previous anonymous class this reference is pointing the tha instance object of anonymous class.
            //Lets see by using the this reference outside the static main.
        });
    }
}
