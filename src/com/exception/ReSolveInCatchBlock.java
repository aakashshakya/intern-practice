package com.exception;

public class ReSolveInCatchBlock {
    public static void main(String args[]) {

        int i = 100;
        int j = 0;
        try {
            System.out.println(i / j);

        } catch (ArithmeticException e) {

            System.out.println("a=" + i / (j + 2));
        }
        System.out.println("Rest of the code");
    }

}
