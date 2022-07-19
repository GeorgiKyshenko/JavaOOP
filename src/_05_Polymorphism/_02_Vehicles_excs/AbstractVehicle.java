package _05_Polymorphism._02_Vehicles_excs;

import java.text.DecimalFormat;

public abstract class AbstractVehicle implements Vehicle {

    protected double fuelQuantity;
    protected double fuelConsumption;
    protected int tankCapacity;


    public AbstractVehicle(double fuelQuantity, double fuelConsumption, int tankCapacity) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumption = fuelConsumption;
        this.tankCapacity = tankCapacity;
    }

    DecimalFormat df = new DecimalFormat("0.##");

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    protected boolean hasEnoughFuel(double kilometers) {
        double totalFuelCost = getFuelConsumption() * kilometers;
        return totalFuelCost < getFuelQuantity();
    }

    public void refuel(double liters) {
        if (liters <= 0) {
            System.out.println("Fuel must be a positive number");
        } else if (fuelQuantity + liters > tankCapacity) {
            System.out.println("Cannot fit fuel in tank");
        } else setFuelQuantity(getFuelQuantity() + liters);
    }

    @Override
    public String drive(double kilometers) {
        if (hasEnoughFuel(kilometers)) {
            setFuelQuantity(getFuelQuantity() - getFuelConsumption() * kilometers);
            return "travelled " + df.format(kilometers) + " km";
        }
        return "needs refueling";
    }
}


