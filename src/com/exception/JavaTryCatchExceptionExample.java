package com.exception;

/**
 * common scenarios of exception occur
 * when we divide any  number by zero a arithmetic exception occur,if the result and variable are in float it will not occur.
 * If we have null value in any variable performing any action on that variable throw NullPointerException.
 * The wrong formatting of any value may occur NumberFormatException.suppose i have a string variable that has character
 * converting this variable into digit will occur NumberFormatException.
 * If you are inserting anything in the wrong index of array then ArrayIndexOutOfBoundException occur;
 */

public class JavaTryCatchExceptionExample {

    public static void main(String args[]) {
        try {
            int a = 100 / 0; // we use TryCatch exception handling to handel arithmatic exception divide by zero


        } catch (ArithmeticException e) {
            System.out.println(e);

        }
        try {


            String name = null;
            System.out.println(name.length());//NullPointerException occur.
        } catch (NullPointerException e) {
            System.out.println(e);
        }
        try {
            String place = "ABC";
            int location = Integer.parseInt(place);//NumberFormatException occur.
        } catch (NumberFormatException e) {
            System.out.println(e);
        }


        try {
            int a[] = new int[5];
            a[10] = 50;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }


        System.out.println("rest of the code");//If didn't use TryCatch handling this code has not been executed

    }


}
