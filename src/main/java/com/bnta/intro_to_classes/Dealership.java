package com.bnta.intro_to_classes;

public class Dealership {
    // properties for the dealership
    private String name;
    private int maxCar;
    private Car [] car;

    //constructor
    public Dealership (String name,
                       int maxCar){
        this.name = name;
        this.maxCar = maxCar;
    // We don't have any cars yet, but we know how many we *could* have. We can use that value to create an empty array with maxCars spaces in it.
        this.car = new Car[maxCar];
    }


}
