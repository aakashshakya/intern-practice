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
    int teamMember = 20;
    String projectRunning = "Esewa pasal";

    public static void main(String args[]) {
        Employee esewa = new ProjectManagerMultiLevel();
        System.out.println(esewa.ID + "\n" + esewa.name + "\n" + esewa.Address + "\n" + ((ProjectManagerMultiLevel) esewa).department + "\n" + ((ProjectManagerMultiLevel) esewa).position + "\n" + ((ProjectManagerMultiLevel) esewa).teamMember + "\n" + ((ProjectManagerMultiLevel) esewa).projectRunning);


    }

}
