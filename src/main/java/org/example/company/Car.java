package org.example.company;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
    }


    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public String toString() {
        return "Car{" +
                "cylinders=" + cylinders +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object car) {
        if(car instanceof Car) {
           return this.cylinders == ((Car)car).cylinders && this.name.equals(((Car)car).name);
        } else {
            return false;
        }
    }

    /*
    @Override
    public boolean equals(Object car) {
        if (car == null || !(car instanceof Car)) {
            return false;
        }
        // car, bir Car nesnesine dönüştürülür
        Car otherCar = (Car) car;
        // Hem silindir sayısını hem de ismi karşılaştırır
        return this.cylinders == otherCar.cylinders && this.name.equals(otherCar.name);
}
     */
    public String startEngine() {
        System.out.println(getClass().getSimpleName());
        return "the car's engine is starting";
    }
    public String accelerate() {
        System.out.println(getClass().getSimpleName());
        return "the car is accelerating";
    }
    public String brake() {
        System.out.println(getClass().getSimpleName());
        return "the car is braking";
    }

}