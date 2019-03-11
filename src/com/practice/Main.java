package com.practice;

public class Main {


    public static void main(String args[]) {

        Animal puppy = new Dog();
        Animal kitty = new Cat();
        Animal hatti = new Elephant();

        puppy.eat();
        puppy.color();
       // puppy.sense();
        puppy.speak();

        kitty.eat();
        kitty.color();
       // kitty.fight();
        kitty.speak();

        hatti.eat();
        hatti.color();
       // hatti.work();
        hatti.speak();
    }
}
