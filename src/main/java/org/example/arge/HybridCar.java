package org.example.arge;

public class HybridCar extends CarSkeleton{
    private double avgKmPerLiter;
    private int batterySize;
    private int cylinders;

    public HybridCar(String name, String description, double avgKmPerLitre, int batterySize, int cylinders) {
        super(name, description);
        this.avgKmPerLiter = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    public double getAvgKmPerLiter() {
        return avgKmPerLiter;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public int getCylinders() {
        return cylinders;
    }

    // Override edilmiş startEngine metodu
    @Override
    public void startEngine() {
        System.out.println("The hybrid car with a battery size of " + batterySize + " kWh and " + cylinders + " cylinders is starting.");
    }

    // Override edilmiş runEngine metodu
    @Override
    protected void runEngine() {
        System.out.println("The hybrid car with a battery size of " + batterySize + " kWh and " + cylinders + " cylinders is running.");
    }

    // Drive metodunu motor tipine göre özelleştir
    @Override
    public void drive() {
        System.out.println("The hybrid car is driving with an average of " + avgKmPerLiter + " km per litre and an average of " + batterySize + " km per charge.");
        runEngine(); // Motoru çalıştır
    }
}

