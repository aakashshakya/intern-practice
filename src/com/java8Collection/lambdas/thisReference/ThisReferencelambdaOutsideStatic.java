package com.java8Collection.lambdas.thisReference;

import java.util.function.Consumer;

public class ThisReferencelambdaOutsideStatic {
    public void doProcess(int a, Consumer<Integer> consumer){
        consumer.accept(a);
    }
    public void execute(){

        doProcess(10,i-> {
            System.out.println(i);
            System.out.println(this);
        });
    }

    public String toString(){
        return "Executed from ThisReferenceLambdaOutside";
    }
    public static void main(String args[]){
        ThisReferencelambdaOutsideStatic thisReferencelambdaOutsideStatic=new ThisReferencelambdaOutsideStatic();
        thisReferencelambdaOutsideStatic.execute();
    }
}
