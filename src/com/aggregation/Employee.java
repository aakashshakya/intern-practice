package com.aggregation;

public class Employee {
    int id;
    String name;
    String department;
    Address address;

    Employee(int id, String name, String department, Address address) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.address = address;

    }

    public static void main(String args[]) {


        Address address1 = new Address("Lumbini", "Nawalpur", "Gaindakot");
        Address address2 = new Address("Bagmati", "Kathmandu", "kathmandu");
        Employee employee1 = new Employee(12, "Sushant Kandel", "Java", address1);
        Employee employee2 = new Employee(13, "Abishek", "forntend", address2);
        System.out.println(employee1.id + employee1.name + employee1.department + employee1.address.zone + employee1.address.district + employee1.address.municiplity);
        System.out.println(employee2.id + employee2.name + employee2.department + employee2.address.zone + employee2.address.district + employee2.address.municiplity);

    }
}
