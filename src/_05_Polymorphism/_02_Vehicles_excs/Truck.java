package _05_Polymorphism._02_Vehicles_excs;

import java.text.DecimalFormat;

public class Truck extends AbstractVehicle implements Vehicle {

    private static final double FUEL_CONSUMPTION_INCREASE = 1.6;

    public Truck(double fuelQuantity, double fuelConsumption, int tankCapacity) {
        super(fuelQuantity, fuelConsumption + FUEL_CONSUMPTION_INCREASE, tankCapacity);
    }

    DecimalFormat df = new DecimalFormat("0.##");

    @Override
    public String drive(double kilometers) {
        return "Truck " + super.drive(kilometers);
    }

    @Override
    public void refuel(double liters) {
        if (liters <= 0) {
            System.out.println("Fuel must be a positive number");
        } else if (fuelQuantity + liters > tankCapacity) {
            System.out.println("Cannot fit fuel in tank");
        } else fuelQuantity += (liters * 0.95);
    }
}
