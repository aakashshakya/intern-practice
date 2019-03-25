package com.java8Collection.lambdas.thisReference;

import java.util.function.Consumer;

public class ThisReferenceAnonymousClass {
    public void doProcess(int a, Consumer<Integer> consumer){
        consumer.accept(a);
    }
    public static void main(String args[]){
        ThisReferenceAnonymousClass thisReferenceAnonymousClass=new ThisReferenceAnonymousClass();
        thisReferenceAnonymousClass.doProcess(5, new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
                System.out.println(this);
            }
            public String toString(){
                return "This is anonymous inner class";
            }
        });
    }
}
