package _05_Polymorphism._02_Vehicles_excs;

public class Car extends AbstractVehicle implements Vehicle {
    private static final double FUEL_CONSUMPTION_INCREASE = 0.9;


    public Car(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption + FUEL_CONSUMPTION_INCREASE);
    }


    public String drive(double kilometers) {
        if (fuelQuantity > fuelConsumption * kilometers) {
            fuelQuantity -= fuelConsumption * kilometers;
            return String.format("Car travelled %.0f km", kilometers);
        }
        return "Car needs refueling";
    }

    @Override
    public void refuel(double liters) {
        fuelQuantity += liters;
    }


}
