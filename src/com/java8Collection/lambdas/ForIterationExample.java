package com.java8Collection.lambdas;

import java.util.Arrays;
import java.util.List;

public class ForIterationExample {

    public static void main(String args[]) {
        List<Person> people = Arrays.asList(
                new Person("Sushant", "Kandel", 24),
                new Person("Shyam", "Chandra", 25),
                new Person("Pankhar", "Poudel", 22),
                new Person("Abishek", "Sharma", 21),
                new Person("Usha", "POudel", 26),
                new Person("Sankhar", "Hari", 23)
        );
        System.out.println("Using for loop");
        for (int i = 0; i < people.size(); i++) {//External Iterator]
            System.out.println(people.get(i));
        }
        System.out.println("\n Using for in loop");//[External Iterator] for person p in people print p.
        for (Person p : people) {//people ko list ko object ek ek gardai person ko variable ma rakhni aani tyo variable print garni.
            System.out.println(p);
        }
        System.out.println("\nUsing for each Loop");
        people.forEach(p -> System.out.println(p));//[Internal Iterator] for each person p in people print p. Done By using lambda.
        people.forEach(System.out::println);//[Internal Iterator] for each person p in people print p. Done By using method reference.
        //It says for each element(person p) here in List(people) execute the given lambda.
    }
}
