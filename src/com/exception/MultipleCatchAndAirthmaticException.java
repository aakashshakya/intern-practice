package com.exception;

/**
 * In this program we are using one try block and multiple catch exception having ArrayIndexOutOfBoundException,
 * ArithmeticException and the parent Exception
 * here it will examine and catch the same type exception which exist if the exception didn't match then it will be catched throw parent exception .
 * In this program Arithmetic exception occurs and the Arithmetic exception is catch.
 * if not then the exception is catch by parent Exception as Arithmetic exception is the subclass of parent Exception.
 */
public class MultipleCatchAndAirthmaticException {
    public static void main(String args[]) {
        try {
            int a[] = new int[5];
            a[5] = 100 / 0;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundException Occur");
        } catch (ArithmeticException e) {
            System.out.println("AirthmaticException occur");
        } catch (Exception e) {
            System.out.println("Parent exception occur");
        }

        System.out.println("Rest of the code occur");


    }
}
