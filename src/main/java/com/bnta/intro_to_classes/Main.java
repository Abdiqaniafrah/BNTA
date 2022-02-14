package com.bnta.intro_to_classes;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {
    public static void main(String [] args) {
        Car myCar = new Car("vauxhall", 4000,EngineType.PETROL);
        Car car2 = new Car("ford", 2000,EngineType.ELECTRIC);
        System.out.println(myCar);
        System.out.println(car2);
    }
}
