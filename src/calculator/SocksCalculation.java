package calculator;

import java.util.Scanner;

public class SocksCalculation {
    private static int count = 0;

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of socks you have");
        int number = in.nextInt();
        int pair[] = new int[number];
        System.out.println("Enter the types of socks");
        for (int i = 0; i < number; i++) {

            pair[i] = in.nextInt();


        }

        SocksCalculation calculation = new SocksCalculation();
        calculation.sortArray(pair);
        calculation.getArray(pair);
        calculation.countPair(pair);


        System.out.println("count= " + count);
    }

    void sortArray(int pair[]) {
        for (int i = 0; i < pair.length; i++) {
            for (int j = i; j < pair.length; j++) {
                if (pair[i] < pair[j]) {
                    int temp = pair[j];
                    pair[j] = pair[i];
                    pair[i] = temp;

                }
            }
        }
    }

    void getArray(int pair[]) {
        for (int i = 0; i < pair.length; i++) {
            System.out.println(pair[i]);
        }

    }

    void countPair(int pair[]) {
        for (int i = 0; i < pair.length - 1; i++) {

            if (pair[i] == pair[i + 1] && i < pair.length - 1) {
                count += 1;
                i += 1;
            }

        }
    }
}

