package com.java8Collection.streamExample;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Example5UsingJava8Stream {
    public static void main(String args[]) {

        List<Student> list1 = Arrays.asList(
                new Student(1, "Sushant kandel", "9845736616", 40),
                new Student(5, "Kamal Aryal", "984554547", 29),
                new Student(3, "Avishek Roy", "984578512", 28),
                new Student(6, "Soumya Poudel", "98457853", 26),
                new Student(10, "Hari", "9875462154", 36),
                new Student(20,"Shyam","98457895",37));
        System.out.println(list1);
        Comparator<Student>c=(p1,p2)->{
            Integer l1=p1.getName().length();
            Integer l2=p2.getName().length();
            return l1.compareTo(l2);
        };
        List<Student>l1=list1.stream().sorted(c).collect(Collectors.toList());
        System.out.println(l1);
    }
}
