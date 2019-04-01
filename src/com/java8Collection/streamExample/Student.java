package com.java8Collection.streamExample;

public class Student implements Comparable{
    private int rollNumber;
    private String name;
    private String mobNumber;
    public int marks;

     public Student(int rollNumber,String name,String mobNumber,int marks){
         this.rollNumber=rollNumber;
         this.name=name;
         this.mobNumber=mobNumber;
         this.marks=marks;

     }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobNumber() {
        return mobNumber;
    }

    public void setMobNumber(String mobNumber) {
        this.mobNumber = mobNumber;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
    public String toString(){
         return rollNumber+" "+name+" "+mobNumber+" "+marks+"  ";
    }

    @Override
    public int compareTo(Object o) {
        String name1=this.getName();
        Student student=(Student)o;
        String name2=student.getName();
        return - name1.compareTo(name2);
    }
}
