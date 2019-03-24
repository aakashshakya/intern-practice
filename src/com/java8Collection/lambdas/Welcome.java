package com.java8Collection.lambdas;

public class Welcome {
    public static void main(String args[]) {
        Welcome welcome = new Welcome();
        HelloWordGreeting helloWordGreeting = new HelloWordGreeting();
        Greeting myLambda = () -> System.out.println("Hello Word");
        myLambda.perform();
        welcome.greet(myLambda);
        welcome.greet(helloWordGreeting);
    }

    private void greet(Greeting greeting) {
        greeting.perform();
    }
}
