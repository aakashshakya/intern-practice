package com.java8Collection.lambdas.methodReference;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReference2 {
    public static void main(String args[]) {
        List<Person> people = Arrays.asList(
                new Person("Sushant", "Kandel", 24),
                new Person("Shyam", "Chandra", 25),
                new Person("Pankhar", "Poudel", 22),
                new Person("Abishek", "Sharma", 21),
                new Person("Usha", "POudel", 26),
                new Person("Sankhar", "Hari", 23)

        );
        // performConditionally(people, p->true,p->System.out.println(p));
        performConditionally(people, p -> true, System.out::println);

        performConditionally(people, p->p.getLastName().startsWith("P"),System.out::println);
    }

    private static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
        for (Person p : people) {
            if (predicate.test(p)) {
                consumer.accept(p);
            }
        }
    }
}
