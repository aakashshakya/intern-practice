package com.java8Collection.lambdas.exceptionHandling;

import java.util.function.BiConsumer;

public class ExceptionHandlingDemo1 {
    public static void main(String args[]) {
        int someNumber[] = {1, 2, 3, 10, 15, 20};
        int key = 0;

        process(someNumber, key, (v, k) -> System.out.println(v / k));

    }

    public static void process(int value[], int key, BiConsumer<Integer, Integer> consumer) {
        for (int i : value) {
            try {
                consumer.accept(i, key);// you can use try catch here but here we have to define multiple catch exception because
                //we don't know the type of exception boz it depend on the lambda exception and it is called by multiple experssion
                //some time some expression cause Arithmetic Exception,some may cause NullArrayException etc.so we have to define
                //multiple catch cases so it is not suitable here. Look for Demo 2 what that says.
            } catch (ArithmeticException e) {
                System.out.println("Arithmetic Exception is Catch");
            }
        }

    }
}
