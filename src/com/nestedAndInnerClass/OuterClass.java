package com.nestedAndInnerClass;


public class OuterClass {
    private int outerValue=500;

    void test(){
        Inner inner=new Inner();
        inner.display();
        System.out.println(inner.innerValue);//inner class value cannot be directly accessed from outer class because it react as the instance variable .
    }
    public class Inner{
        private int innerValue=400;
        void display(){
            System.out.println(outerValue);//outer class value can be directly accessed from inner class.
        }
    }

}
