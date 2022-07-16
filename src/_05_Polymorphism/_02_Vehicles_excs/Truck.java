package _05_Polymorphism._02_Vehicles_excs;

public class Truck extends AbstractVehicle implements Vehicle {

    private static final double FUEL_CONSUMPTION_INCREASE = 1.6;

    @Override
    public String drive(double kilometers) {
        if (fuelQuantity > fuelConsumption * kilometers) {
            fuelQuantity -= fuelConsumption * kilometers;
            return String.format("Truck travelled %.0f km", kilometers);
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
