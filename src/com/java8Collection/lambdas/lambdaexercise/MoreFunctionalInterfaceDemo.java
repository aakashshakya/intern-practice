package com.java8Collection.lambdas.lambdaexercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MoreFunctionalInterfaceDemo {
    public static void main(String args[]) {
        List<Person> people = Arrays.asList(
                new Person("Sushant", "Kandel", 24),
                new Person("Kamal", "Poudel", 25),
                new Person("Hari", "Sapkota", 27),
                new Person("Keshav", "Khanal", 26),
                new Person("Sankhar", "Chapagain", 25),
                new Person("Saira", "Chandra", 21)
        );
        //sort list by last name
        Collections.sort(people, Comparator.comparing(Person::getLastName));

        // Create a methods that prints all elements in the list.
        printAll(people, p -> System.out.println(p));
        //create a lambda expression that prints all people that have last name beginning with C.
        performConditionally(people, p -> p.getLastName().startsWith("C"), p -> System.out.println(p.getFirstName()));

        //create method that print all people that print first name beginning with s
        performConditionally(people, p -> p.getFirstName().startsWith("S"), p -> System.out.println(p));

    }

    public static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
        for (Person p : people) {
            if (predicate.test(p)) {
                consumer.accept(p);
            }
        }
    }

    public static void printAll(List<Person> people, Consumer<Person> consumer) {
        for (Person p : people) {
            consumer.accept(p);
        }
    }
}



