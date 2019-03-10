package calculator;


import java.util.*;

public class Main {

    public static void main(String args[]) {
        float result;
        String check;

        Scanner in = new Scanner(System.in);
        Calculation calc = new Calculation();
        do {
            System.out.println("Enter the first variable");
            float firstValue = in.nextFloat();
            System.out.println("Enter the operand");
            String operand = in.next();
            System.out.println("Enter the second variable");
            float secondValue = in.nextFloat();


            calc.setFirstVariable(firstValue);
            calc.setSecondVariable(secondValue);
            switch (operand) {

                case "+":
                    result = calc.addition();
                    System.out.println("Sum=" + " " + result);
                    break;

                case "-":
                    result = calc.subtraction();
                    System.out.println("Subtraction=" + " " + result);
                    break;

                case "*":
                    result = calc.multiplication();
                    System.out.println("Multiplication=" + " " + result);
                    break;
                case "/":
                    if (secondValue == 0) {
                        System.out.println("It gives infinity Try again");
                        break;
                    }
                    System.out.println("division=" + " " + calc.division());
                    break;

                default:
                    System.out.println("bad input try again");
                    break;


            }

            System.out.println("Enter exit to stop or any key to continue and press enter");
            check = in.next();
        } while (!check.equals("exit"));
    }
}
