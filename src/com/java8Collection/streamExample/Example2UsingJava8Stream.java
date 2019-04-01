/**
 * IN this class we are using java 8 stream to solve the problem.
 * to check condition we can use filter and to perform some operation
 * we can use map but we have to return the object not value we did return object error value return garey ra basya raixam aani kaha
 * bata milthiyo tani.we did map(p->p.setMarks(p.getMarks()+5))which gives wrong bcz the compiler understand
 * map(Student p ->return p.setMarks(p.getMarks()+5)) looks what is returning just value i.e marks+5 so it encounter error
 * so we have to return object i.e return P. then it is solved dude .Yesko kaam map garnu ho j lie map garnu xa tyo thau ma testai type
 * rakhnu paryo nita hainata so type milauna parxa.
 */

package com.java8Collection.streamExample;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example2UsingJava8Stream {
    public static void main(String args[]) {
        List<Student> list1 = Arrays.asList(
                new Student(1, "Sushant kandel", "9845736616", 40),
                new Student(5, "Kamal Aryal", "984554547", 29),
                new Student(3, "Avishek Roy", "984578512", 28),
                new Student(6, "Soumya Poudel", "98457853", 26),
                new Student(10, "Hari Prashad", "9875462154", 36));
        System.out.println(list1);
        List<Student> evenList = list1.stream().filter(p -> p.getMarks() < 30).map(p -> {
            p.setMarks(p.getMarks() + 5);
            return p;
        }).collect(Collectors.toList());
        System.out.println(evenList);
        System.out.println(list1);
    }


}
