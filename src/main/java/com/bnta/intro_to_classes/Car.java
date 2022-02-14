package com.bnta.intro_to_classes;

public class Car {
    // properties for a car
    private String manufacturer;
    private int price;
    private EngineType engineType;

    //constructor
    public Car(String manufacturer,
               int price,
               EngineType engineType) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.engineType = engineType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", engineType='" + engineType + '\'' +
                '}';
    }
    //getters
    public String getManufacturer(){
        return manufacturer;
    }
    //setters
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    //getters
    public int getPrice() {
        return price;
    }
    //setters
    public void setPrice(int price){
        this.price = price;
    }
    //getters
    public EngineType getEngineType(){
        return engineType;
    }
    //setters
    public void setEngineType(EngineType engineType){
        this.engineType = engineType;
    }

}




