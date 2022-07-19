package _06_S.O.L.I.D_excs;

public abstract class Drink {

    private final double density;
    protected final double milliliters;

    protected Drink(double density, double milliliters) {
        this.density = density;
        this.milliliters = milliliters;
    }

    public double getMilliliters() {
        return this.milliliters;
    }

    public double getDensity() {
        return this.density;
    }

    double getDrinkAmountInLitters() {
        return (1000 / this.getMilliliters()) * getDensity();
    }

}
