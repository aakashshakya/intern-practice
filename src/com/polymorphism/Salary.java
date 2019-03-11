package com.polymorphism;

public class Salary extends Employee {
    private double salary;

    public Salary(String name, String address, int number, double salary) {
        super(name, address, number);
        System.out.println("Constructing an Salary");
        this.salary = salary;
    }

    public static void main(String args[]) {
        Employee employee = new Salary("Sushant", "Kathmandu", 15, 2000.00);
        Salary salary = new Salary("Avishek", "Narayangarh", 16, 2000.00);
        System.out.println("Call mail check using salary reference");
        salary.checkMail();
        System.out.println("Call mail check using Employee reference");
        employee.checkMail();

    }

    public void checkMail() {
        System.out.println("Mail is checking in Salary class");
        System.out.println("name" + " " + getName() + " " + getAddress() + " " + salary);
    }




}
