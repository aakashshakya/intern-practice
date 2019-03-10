package com.exception;

/**
 * Multiple catch  exception including all exception in the same try block so as first exception is handled then other exception were skipped.
 */
public class MultipleCatchExample {

    public static void main(String args[]) {
        try {
            int ratio = 500 / 0;

            System.out.println("Ratio = " + ratio);

            int systemNumber[] = new int[5];
            systemNumber[10] = 20;

            String name = null;
            System.out.println(name.length());

        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occur");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException Occurs");
        } catch (Exception e) {
            System.out.println("Parent class exception occurs");
        }

        System.out.println("Rest of the code executed");


    }


}
