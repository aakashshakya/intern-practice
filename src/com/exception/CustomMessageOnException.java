package com.exception;

public class CustomMessageOnException {
    public static void main(String args[]) {
        try {
            int a = 100 / 0;
            System.out.println("a=" + a);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divisible by zero");
        }
    }
}
