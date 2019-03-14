package com.java8Collection;

public class OwnEmployeeClasses implements Comparable {
    String name;
    int empid;

    OwnEmployeeClasses(String name,int empid){
        this.name=name;
        this.empid=empid;
    }

    public String toString(){
        return name+"--"+empid;
    }


    @Override
    public int compareTo(Object o) {
         int eid1=this.empid;
         OwnEmployeeClasses ownEmployeeClasses=(OwnEmployeeClasses) o;
        int eid2=ownEmployeeClasses.empid;
        if(eid1<eid2){
          return -1;
        }else if(eid1>eid2){
            return +1;
        }else{
            return 0;
        }

        }
    }

