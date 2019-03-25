package com.java8Collection.lambdas.closures;

import java.util.function.Consumer;

public class ClosuresDemoWithLambda {

    public static void main(String args[]) {
        int a = 10;
        int b = 25;

        doProcess(a,i->System.out.println(i + b));

    }

    private static void doProcess(int i, Consumer<Integer> consumer) {
        consumer.accept(i);
    }
}
/**
 * In this demo we are using the lambda expression sending the function on the do process and a=10 argument but not b but the result
 * is 35 how due to closure phenomenon patha ko ta xaina tara compiler ley b ko value lie track garey ko xa jaba lambda function ma b dekhyo
 * aani tei frozen tracked value i.e 20 not a lie use gardiyo .yes lie nai closure bhanxa.clouser demo ma anonymous class use garey ko
 * xa tesko ni same case ho .
 */


