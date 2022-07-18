package _05_Polymorphism._02_Vehicles_excs;

import java.text.DecimalFormat;

public class Car extends AbstractVehicle implements Vehicle {
    private static final double FUEL_CONSUMPTION_INCREASE = 0.9;


    public Car(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption + FUEL_CONSUMPTION_INCREASE);
    }


    DecimalFormat df = new DecimalFormat("0.##");

    public String drive(double kilometers) {
        if (fuelQuantity > fuelConsumption * kilometers) {
            fuelQuantity -= fuelConsumption * kilometers;
            return "Car travelled " + df.format(kilometers) + " km";
        }
        return "Car needs refueling";
    }

    @Override
    public void refuel(double liters) {
        fuelQuantity += liters;
    }


}
