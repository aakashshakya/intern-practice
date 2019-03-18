package com.java8Collection;

public class StudentClass implements Comparable {
     String name;
     int rollnum;

    StudentClass(String name,int rollnum){
        this.name=name;
        this.rollnum=rollnum;
    }

    @Override
    public int compareTo(Object o) {
        String name1=this.name;
        StudentClass studentClass=(StudentClass)o;
        String name2=studentClass.name;
        return name1.compareTo(name2);
    }
public String toString(){
    return name+"-->"+rollnum;
}
}
