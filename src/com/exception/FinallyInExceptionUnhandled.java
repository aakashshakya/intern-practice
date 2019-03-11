package com.exception;

public class FinallyInExceptionUnhandled {
    public static void main(String args[]) {
        try {
            int a = 100 / 0;
            System.out.println(a);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } finally {
            System.out.println("Finally is operated");
        }
    }
}
