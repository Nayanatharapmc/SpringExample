package com.example.autowire.constructor;

public class Car {
    private Specification specification;

    // Constructor is needed for Auto-wiring by Constructor
    public Car(Specification specification) {
        this.specification = specification;
    }

//    // Auto-wiring by name happens with the help of a setter function
//    public void setSpecification(Specification specification) {
//        this.specification = specification;
//    }

    public void displayDetails(){
        System.out.println("Car details: "+ specification.toString());
    }
}
