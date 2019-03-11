package com.exception;

/**
 * As you handel the exception if u are writing some code that don't create exception inside the try block that will not
 * execute so don't write the code in the try block which will not throw the exception
 */

public class TryCatchBlock {

    public static void main(String args[]) {
        try {
            int a = 100 / 0;
            System.out.println(a);

            System.out.println("rest of the code 1");// code is not executed.
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        try {
            String name = null;
            System.out.println(name.length());
        } catch (NullPointerException e) {
            System.out.println(e);

        }
        System.out.println("Rest of the code 2");//code is executed as it is not in the try block.

        /**We can handel the exception using the parent exception class but the best approach
         * is handling by the generated exception class */

        try {
            int place[] = new int[5];
//
            place[10] = 100;
            System.out.println("the value is " + place);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("rest of the code 3");

    }


}
