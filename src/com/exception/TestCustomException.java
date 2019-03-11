package com.exception;

public class TestCustomException {
    public static void main(String args[]) {
        TestCustomException test = new TestCustomException();
        try {
            test.validate(20);
        } catch (CustomException e) {
            System.out.println("Exception xodyo nita"+e);
        }
    }

    void validate(int age) throws CustomException {
        if (age < 18) {
            throw new CustomException("Invalid age");
        } else {
            System.out.println("Welcome to vote");
        }
    }
}
