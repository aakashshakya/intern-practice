package com.java8Collection.lambdas.lambdaexercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DemoUsingJava8 {
    public static void main(String args[]){
        List<Person> people = Arrays.asList(
                new Person("Sushant", "Kandel", 24),
                new Person("Kamal", "Poudel", 25),
                new Person("Hari", "Sapkota", 27),
                new Person("Shyam", "Khanal", 26),
                new Person("Sankhar", "Chapagain", 25),
                new Person("Saira", "Chandra", 21)
        );
        //sort list by last name
        Collections.sort(people,Comparator.comparing(Person::getLastName));

        // Create a methods that prints all elements in the list.
        printAll(people);
        //create a lambda expression that prints all people that have last name beginning with C.
        printConditionally(people,p->p.getLastName().startsWith("C") );

        //create method that print all people that print first name beginning with s
        printConditionally(people,p->p.getFirstName().startsWith("S") );

    }

    public static void printConditionally(List<Person> people, Condition condition) {
        for (Person p : people) {
            if (condition.test(p)) {
                System.out.println(p);
            }
        }
    }

    public static void printAll(List<Person> people) {
        for (Person p : people) {
            System.out.println(p);
        }
    }
    }

