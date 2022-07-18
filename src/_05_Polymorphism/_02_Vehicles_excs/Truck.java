package _05_Polymorphism._02_Vehicles_excs;

import java.text.DecimalFormat;

public class Truck extends AbstractVehicle implements Vehicle {

    private static final double FUEL_CONSUMPTION_INCREASE = 1.6;

    DecimalFormat df = new DecimalFormat("0.##");

    @Override
    public String drive(double kilometers) {
        if (fuelQuantity > fuelConsumption * kilometers) {
            fuelQuantity -= fuelConsumption * kilometers;
            return "Truck travelled " + df.format(kilometers) + " km";
        }
        return "Truck needs refueling";
    }

    @Override
    public void refuel(double liters) {
        fuelQuantity += (liters * 0.95);
    }

    public Truck(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption + FUEL_CONSUMPTION_INCREASE);
    }

}
