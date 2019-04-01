package com.java8Collection.lambdas.exceptionHandling;

import java.util.function.BiConsumer;

public class ExceptionHandlingDemo2 {
    public static void main(String args[]) {
        int someNumber[] = {2, 4, 3, 10, 8, 9, 5, 6, 20};
        int key = 0;

            process(someNumber, key, (v, k) -> {
                try {
                    System.out.println(v / k);
                } catch (ArithmeticException e) {
                  System.out.println("Arithmetic exception occurs");
                }
            } );


         /** In this type the one line lambda code become a block of try  catch with 4 lines
         so not suitable arey yaar code lamo bho bhaney ra lambda use garna khojni aani try catch garda pheyri tetrai lamo bhaye
         si k artha k v
         */
    }

    private static void process(int someNumber[], int key, BiConsumer<Integer, Integer> consumer) {
        for (int i : someNumber) {
            consumer.accept(i, key);
        }

    }
}
