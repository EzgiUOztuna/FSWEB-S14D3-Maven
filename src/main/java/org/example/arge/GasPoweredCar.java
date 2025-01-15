package org.example.arge;

public class GasPoweredCar extends CarSkeleton{
    private double avgKmPerLiter;
    private int cylinders;

    public GasPoweredCar(String name, String description, double avgKmPerLitre, int cylinders) {
        super(name, description);
        this.avgKmPerLiter = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    public double getAverageKmPerLiter() {
        return avgKmPerLiter;
    }

    public int getCylinders() {
        return cylinders;
    }

    // Override edilmiş startEngine metodu
    @Override
    public void startEngine() {
        System.out.println("The gas-powered car's engine with " + cylinders + " cylinders is starting.");
    }

    // Override edilmiş runEngine metodu
    @Override
    protected void runEngine() {
        System.out.println("The gas-powered car with " + cylinders + " cylinders is running.");
    }

    // Drive metodunu motor tipine göre özelleştir
    @Override
    public void drive() {
        System.out.println("The gas-powered car is driving with an average of " + avgKmPerLiter + " km per litre.");
        runEngine(); // Motoru çalıştır
    }
}