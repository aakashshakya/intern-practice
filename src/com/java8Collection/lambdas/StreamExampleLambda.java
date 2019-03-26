package com.java8Collection.lambdas;

import java.util.Arrays;
import java.util.List;

public class StreamExampleLambda {
    public static void main(String args[]) {
        List<Person> people = Arrays.asList(
                new Person("Sushant", "Kandel", 24),
                new Person("Shyam", "Chandra", 25),
                new Person("Pankhar", "Poudel", 22),
                new Person("Abishek", "Sharma", 21),
                new Person("Usha", "POudel", 26),
                new Person("Sankhar", "Hari", 23)
        );
        long count = people.stream()
                .filter(p -> p.getLastName().startsWith("P"))
                .count();
        System.out.println(count);

        // .forEach(System.out::println);
    }

}
