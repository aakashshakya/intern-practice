package com.exception;

public class FinallyInExceptionHandled {
    public static void main(String args[]) {
        try {
            int a = 100 / 0;
            System.out.println(a);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } finally {
            System.out.println("Finally is operated");
        }
    }
}
