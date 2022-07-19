package _06_S.O.L.I.D_excs.products;

import _06_S.O.L.I.D_excs.Drink;
import _06_S.O.L.I.D_excs.Products;

public class Coke extends Drink implements Products {

    public static final double CALORIES_PER_100_GRAMS = 44.0;
    public static final double DENSITY = 0.6;

    public Coke(double milliliters) {
        super(DENSITY, milliliters);
    }

    @Override
    public double getAmountOfCalories() {
        return (CALORIES_PER_100_GRAMS / 100) * super.getMilliliters() * DENSITY;

    }

}
