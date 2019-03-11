package com.Inheritance;

/**
 * Inheritance is the process in which object acquire the properties of the parents class.
 * In the program Employee is the parent class and the developer is the subclass of employee and the projectManager is the subclass of Developer
 * Developer can acquire the properties of Employee and ProjectManager can acquire the properties of employee and developer but the reverse acquiring
 * is not happen.
 * Multiple inheritance is not supported in the java class so that to remove the ambiguity it is removed but we can have the multiple inheritance
 * By using the Interface.
 * Interface is use for method overloading and code Reusability.
 */

public class ProjectManagerMultiLevel extends Developer {
    public static void main(String args[]) {
        ProjectManagerMultiLevel esewa = new ProjectManagerMultiLevel();
        esewa.setId(1);
        esewa.setAddress("Gaida Kot");
        esewa.setName("Sushant Kandel");
        esewa.setDepartment("Development");
        esewa.setPosition("Intern");

        System.out.println("Below is the detail of new eSewa intern:");
        System.out.println("Name: " + esewa.getName());
        System.out.println("Address: " + esewa.getAddress());
        System.out.println("Department: " + esewa.getDepartment());
        System.out.println("Position: " + esewa.getPosition());

    }
}
