package com.example.autowire.name;

public class Car {
    private Specification specification;

    // Auto-wiring by name happens with the help of a setter function
    public void setSpecification(Specification specification) {
        this.specification = specification;
    }

    public void displayDetails(){
        System.out.println("Car details: "+ specification.toString());
    }
}
