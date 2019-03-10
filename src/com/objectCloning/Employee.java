package com.objectCloning;

public class Employee implements Cloneable{

   int id;
   String name;

   public Employee(int id,String name){
       this.id=id;
       this.name=name;
   }

   public Object Clone()throws CloneNotSupportedException{
       return super.clone();
   }
   public static void main(String args[]){
       try {


           Employee employee1 = new Employee(102, "Hari");
           Employee employee2 = (Employee) employee1.Clone();
           System.out.println(employee1.id+" "+employee1.name);
           System.out.println(employee2.id+" "+employee2.name);
       }catch (CloneNotSupportedException e){

       }
   }
}
