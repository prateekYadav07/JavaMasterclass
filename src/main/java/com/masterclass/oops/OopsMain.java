package com.masterclass.oops;

class SuperClass{

    SuperClass(){
        System.out.println("Inside parent no-args constructor");
    }
    public void printMethod(){
        System.out.println("Print statement in super class");
    }
}

class ChildClass extends SuperClass{

//    ChildClass(){
//        System.out.println("Inside Child no-args constructor");
//    }

    @Override
    public void printMethod() {
        super.printMethod();
        System.out.println("Print statement in child class");
    }
}



public class OopsMain {
    public static void main(String[] args) {
        System.out.println("OOPS main method starts here");

//        Car car  = new Car();
//        System.out.println(car.describeCar());
        ChildClass childClass = new ChildClass();
        childClass.printMethod();
    }
}
