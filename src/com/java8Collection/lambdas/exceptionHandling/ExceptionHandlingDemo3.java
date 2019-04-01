package com.java8Collection.lambdas.exceptionHandling;

import java.util.function.BiConsumer;

public class ExceptionHandlingDemo3 {

    public static void main(String args[]) {
        int someNumber[] = {2, 4, 3, 10, 8, 9, 5, 6, 20};
        int key = 0;

        process(someNumber, key, wrapperLambda((v, k) -> System.out.println(v / k)));


    }

    private static void process(int someNumber[], int key, BiConsumer<Integer, Integer> consumer) {
        for (int i : someNumber) {
            consumer.accept(i, key);
        }

    }

    private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer) {
       // return (v,k)->System.out.println(v+k);
        return (v,k)-> { try {
            System.out.println("Execution from wrapperLambda");
            consumer.accept(v, k);
        }catch (ArithmeticException e){
            System.out.println("Exception caught in wrapper Lambda");
        }
        };/** This is the perfect method for handling the lambda exception.
         In this case we are creating the wrapperLambda that take the orginal lambda and return it so we can have some modification in the
         code here.
         When the process is called then the consumer.accept run the wrapper lambda and the wrapper lambda we have consumer which accept the
         previous original lambda and return the result .
         The exception handling is done in the wrapperLambda.
         if we wrap the original lambda with the new Lambda then the new lambda is executed by the consumer.accept of the process method.
         so we sending the original lambda in the wrapper method and code for the exception and the consumer.accept executed the wrapper lambda
         so problem is solved.
         No block of code in original lambda and no try catch block in the process method.
         Wrapper lambda ko consumer ma original lambda pathainxa aani tya bhitra try catch maintain garinxa ani jaba process method
         call hunxa aani consumer.accept ley wrapper lambda bhitra ko lambda lie execute garxa.
         thank you.Bujiyo ni ki pheyri mathi bata padxau pada pada majja ley buja.

         */
    }
}

