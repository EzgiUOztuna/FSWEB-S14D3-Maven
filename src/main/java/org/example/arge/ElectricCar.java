package org.example.arge;

public class ElectricCar extends CarSkeleton{
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String name, String description, double avgKmPerCharge, int batterySize) {
        super(name, description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }

    public int getBatterySize() {
        return batterySize;
    }

    // Override edilmiş startEngine metodu
    @Override
    public void startEngine() {
        System.out.println("The electric car with a battery size of " + batterySize + " kWh is starting.");
    }

    // Override edilmiş runEngine metodu
    @Override
    protected void runEngine() {
        System.out.println("The electric car with a battery size of " + batterySize + " kWh is running.");
    }

    // Drive metodunu motor tipine göre özelleştir
    @Override
    public void drive() {
        System.out.println("The electric car is driving with an average of " + avgKmPerCharge + " km per charge.");
        runEngine(); // Motoru çalıştır
    }
}
