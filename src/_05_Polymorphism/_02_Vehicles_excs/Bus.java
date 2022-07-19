package _05_Polymorphism._02_Vehicles_excs;

import java.text.DecimalFormat;

public class Bus extends AbstractVehicle {

    private static final double FUEL_CONSUMPTION_WITH_PASSENGERS = 1.4;


    public Bus(double fuelQuantity, double fuelConsumption, int tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }

    DecimalFormat df = new DecimalFormat("0.##");

    @Override
    public String drive(double kilometers) {
        if (hasEnoughFuel(kilometers)) {
            setFuelQuantity(getFuelQuantity() - (getFuelConsumption() + FUEL_CONSUMPTION_WITH_PASSENGERS) * kilometers);
            return "Bus travelled " + df.format(kilometers) + " km";
        }
        return "Bus needs refueling";
    }

    public String driveEmpty(double kilometers) {
        if (hasEnoughFuel(kilometers)) {
            setFuelQuantity(getFuelQuantity() - getFuelConsumption() * kilometers);
            return "Bus travelled " + df.format(kilometers) + " km";
        }
        return "Bus needs refueling";
    }
}
