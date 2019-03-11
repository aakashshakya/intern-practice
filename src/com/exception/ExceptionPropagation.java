package com.exception;

/**
 * In this program we are focusing on the exception propagation.
 * As we have the exception propagation class where it contains various method which is calling the next method explicitly
 * Here we are calling the College method from the static main class and college method is calling the student method of Exception propagation
 * and Student method is calling the student  marks method
 * In the student mark method the index of the student id is assign to 40 but we are assigning the  marks to the student having 41 which doesnt exist
 * so it create the ArrayOutOFBoundException which is not handled in the Student marks method so the exception propagate to the previous method student
 * as we are not handling the exception in the student method again it propagate to the college method  willing that may be it is handled in the college method
 * And finally it is handled in the college method.
 * Note:By using exception propagation we can handle the exception in any call stack.
 * Thank you
 * NOTE:Checked exception will not propagate only unchecked Exception propagate.Do you know why?
 * Check exception is compile time exception it gives compile Time error and unchecked exception is run time exception so it is handled in real time.
 */

public class ExceptionPropagation {
    void studentMarks() {      //Exception occured here.And propagate to student method
        int studentId[] = new int[40];
        studentId[41] = 50;
        System.out.println("Executed StudentMarks");
    }

    void student() { //exception propagate here and if not handled propagte to previous call stack i.e college method.
        studentMarks();
        System.out.println("Executed student");
    }

    void college() { //exception is handled .
        try {
            student();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception is handled in college method at it propagate from studentMarks");
        }
        System.out.println("Executed college");
    }

    public static void main(String args[]) {
        ExceptionPropagation propagation = new ExceptionPropagation();
        propagation.college();

        System.out.println("Rest of the code");
    }

}
