package org.example.company;

public class Mitsubishi extends Car{


    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "the car's engine is starting";
    }
    @Override
    public String accelerate() {
        return "the car is accelerating";
    }
    @Override
    public String brake() {
        return "the car is braking";
    }
}
