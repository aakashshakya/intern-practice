package com.exception;

/**
 * We use throw keyboard to throw the exception explicitly
 * it is use to throw the costum exception
 * in this program we are checking the paying amount and the amount limit in one transaction
 * if paying amount exceed more than one lakh it  throw the arithmatic exception else it proceed for the payment process here
 * we are just showing the payment successful message only we can call the payment calss object there insted of message in realtime operation.
 */
public class ThrowKeyboardExample {
    public static void payAmount(int accountBalance) {
        if (accountBalance > 100000) { //paying amount balance is checking and throwing the exception and conducting the transaction is done in this block.
            throw new ArithmeticException("Sorry you cannot pay more than  one lakh in single transaction ");
        }
        System.out.println("payment successful");


    }

    public static void main(String arg[]) {
        payAmount(20000000);//paying amount is sending to the payAmount method for paying transaction and exception limit checkup.
        System.out.println("Rest of the code");
    }
}
