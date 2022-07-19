package _05_Polymorphism._02_Vehicles_excs;

import java.text.DecimalFormat;

public class Car extends AbstractVehicle implements Vehicle {

    private static final double FUEL_CONSUMPTION_INCREASE = 0.9;


    public Car(double fuelQuantity, double fuelConsumption, int tankCapacity) {
        super(fuelQuantity, fuelConsumption + FUEL_CONSUMPTION_INCREASE, tankCapacity);
    }

    public String drive(double kilometers) {
        return "Car " + super.drive(kilometers);
    }
}
